package br.com.caelum.loja.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@RequestMapping("/")
	public String Index() {
		System.out.println("Exibindo a home da CDC");
		return "home";
	}
}
