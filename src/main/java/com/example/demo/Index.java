package com.example.demo;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class Index {
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String index(Model model) {
	  model.addAttribute("now", new Date().toString());
	  return "index";
	}
}

