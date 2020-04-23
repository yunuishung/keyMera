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
		log.info("** 글 목록 ***");
		model.addAttribute("list",service.getList( cri ) );
		int count = (int)service.scount();  
		model.addAttribute("pageMaker", new PageDTO(cri,count));
	}
	

	@GetMapping("/register")
	public void register() {

	}	

	@GetMapping("/insert")
	public void insert() {

	}
	@GetMapping("/get")
	public void get(@RequestParam("bno") long bno, Model model) {
		log.info("************글번호 가져오기******************");
		model.addAttribute("board", service.get(bno));

	}
	@GetMapping("/modify")
	public void modify(@RequestParam("bno") long bno, Model model,Criteria cri) {
		log.info("************글번호 가져오기******************");
		model.addAttribute("board", service.get(bno));


	}	

	@PostMapping("/register")
	public String register(EventVO board) {
		log.info("=======글 쓰기=======" + board);
		service.register(board);
		return "redirect:/board/list";
		
	}

	@PostMapping("/insert")
	public String insert(EventVO board) {
		log.info("=======글 쓰기=======" + board);
		service.insert(board);
		return "redirect:/board/list";
		
	}

	@PostMapping("/modify")
	public String modify(EventVO board, @ModelAttribute("cri") Criteria cri, RedirectAttributes rttr) {
		log.info("modify:" + board);

		if (service.modify(board)) {
			rttr.addFlashAttribute("result", "success");
		}

		rttr.addAttribute("pageNum", cri.getPageNum());
		rttr.addAttribute("amount", cri.getAmount());
		//rttr.addAttribute("type", cri.getType());
		//rttr.addAttribute("keyword", cri.getKeyword());

		return "redirect:/board/list";
	}

	@PostMapping("/remove")
	public String remove(@RequestParam("bno") Long bno, Criteria cri, RedirectAttributes rttr) {

		log.info("remove..." + bno);
		if (service.remove(bno)) {
			rttr.addFlashAttribute("result", "success");
		}
		rttr.addAttribute("pageNum", cri.getPageNum());
		rttr.addAttribute("amount", cri.getAmount());
		//rttr.addAttribute("type", cri.getType());
		//rttr.addAttribute("keyword", cri.getKeyword());

		return "redirect:/board/list";
	}
	

	
}














