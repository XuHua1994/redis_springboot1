package com.fastech.controller.view;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/userview")
public class UserViewController {

	@RequestMapping("/hello")
	public String hello() {
		return "boss";
	}

}
