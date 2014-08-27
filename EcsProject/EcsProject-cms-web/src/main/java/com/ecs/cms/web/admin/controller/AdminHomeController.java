package com.ecs.cms.web.admin.controller;

import org.springframework.stereotype.Controller;

import com.ecs.cms.web.mvc.annotation.AuthLevel;
import com.ecs.cms.web.mvc.annotation.AuthRequired;

@Controller
@AuthRequired(AuthLevel.UNCHECK)
public class AdminHomeController {


}
