package com.nw.grocery.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProductListController {
	
	@GetMapping("/product/list")
	public String list() {
		return "product/list";
	}

}
