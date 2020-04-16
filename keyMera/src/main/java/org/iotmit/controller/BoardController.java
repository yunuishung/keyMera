package org.iotmit.controller;

import org.iotmit.domain.BoardVO;
import org.iotmit.domain.Criteria;
import org.iotmit.domain.PageDTO;
import org.iotmit.service.BoardService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;


@Controller
@Log4j
@RequestMapping("/board/*")
@AllArgsConstructor
public class BoardController {

	private BoardService service;
	
	@GetMapping("/list")
	public void list(Criteria cri,  Model model) {
		log.info("***����Ʈ ó��*****");
		model.addAttribute("list",service.getList( cri ) );
		int count = (int)service.scount();  
		model.addAttribute("pageMaker", new PageDTO(cri,count));
	}
	
	@PostMapping("/register")
	public String register(BoardVO board) {
		log.info("****�۵��ó��:*****" + board);
		service.register(board);
		return "redirect:/board/list";
		
	}
	@GetMapping("/register")
	public void register() {

	}	
	
	@GetMapping("/get")
	public void get(@RequestParam("bno") long bno, Model model) {
		log.info("**************************�� ��ȸ ��û********************");
		model.addAttribute("board", service.get(bno));

	}
	
	@PostMapping("/modify")
	public String modify(BoardVO board, RedirectAttributes rttr) {
		log.info("=========================�� ���� =========="+ board );
		if( service.modify(board)) {
			rttr.addFlashAttribute("���", "�� ���� ����");
		}
		return "redirect:/board/list";
	}

	@PostMapping("/remove")
	public String remove(@RequestParam("bno") Long bno, RedirectAttributes rttr) {
		log.info( "==========================���� ===============" + bno );
		if( service.remove(bno)) {
			rttr.addFlashAttribute("result","�� ���� ����");
		}
		return "redirect:/board/list";
	}
	

	
}














