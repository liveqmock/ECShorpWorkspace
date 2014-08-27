package com.ecs.manager.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ecs.manager.web.annotation.AuthLevel;
import com.ecs.manager.web.annotation.AuthRequired;

@Controller
@AuthRequired(AuthLevel.STRICT)
public class MainController {
  
  @RequestMapping(value="main",method=RequestMethod.GET)
  public String main(){
   return "main";
  }
}
