package com.dtb.c;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DtbController {

	@RequestMapping("/index")
	public String index() {
		System.out.println("index.....");
		return "index";
	}
}
