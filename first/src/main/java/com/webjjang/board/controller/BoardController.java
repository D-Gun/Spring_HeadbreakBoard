package com.webjjang.board.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/board")
public class BoardController {
	@GetMapping("/list.do")
	//������ method�ۼ�
	public String list() {
		System.out.println("BoardController.list()");
		// /WEB-INF/views/ + board/list + .jsp
		return "board/list";
	}
}
