package org.iotmit.controller;

import org.iotmit.domain.EventVO;
import org.iotmit.domain.Criteria;
import org.iotmit.domain.PageDTO;
import org.iotmit.service.EventService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;


@Controller
@Log4j
@RequestMapping("/event/*")
@AllArgsConstructor
public class EventController {

	private EventService service;
	
	@GetMapping("/eventlist")
	public void eventlist(Criteria cri,  Model model) {
		log.info("** 이벤트 목록 ***");
		model.addAttribute("eventlist",service.getList( cri ) );
		int count = (int)service.scount();  
		model.addAttribute("pageMaker", new PageDTO(cri,count));
	}
	

	
}














