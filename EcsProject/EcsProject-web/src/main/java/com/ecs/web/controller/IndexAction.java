package com.ecs.web.controller;

import org.slf4j.ext.XLogger;
import org.slf4j.ext.XLoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ecs.core.manager.HomeManager;
import com.ecs.web.mvc.annotation.AuthLevel;
import com.ecs.web.mvc.annotation.AuthRequired;

@Controller
@AuthRequired(AuthLevel.NONE)
public class IndexAction {
	private static final XLogger LOGGER=XLoggerFactory.getXLogger(IndexAction.class);
	@Autowired
	private HomeManager homeManager;

	@RequestMapping(value="index")
	public String index(Model model){
		model.addAttribute("dataList", homeManager.getHomeDateList());
		return "index";
	}
}
