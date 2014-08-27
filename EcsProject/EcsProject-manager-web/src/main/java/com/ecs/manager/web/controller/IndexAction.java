package com.ecs.manager.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ecs.manager.web.annotation.AuthLevel;
import com.ecs.manager.web.annotation.AuthRequired;

@Controller
@AuthRequired(AuthLevel.NONE)
public class IndexAction {

	@RequestMapping(value="index")
	public String index(Model model){
		return "redirect:/login";
	}
}
