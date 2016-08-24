package org.gvaireth.liferaytest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

	@RequestMapping("/")
	public String helloWorld(Model model) {
		System.out.println("front controller up");
		return "/start.jsp";
	}

	@RequestMapping("/foo")
	public String helloWorld2(Model model) {
		System.out.println("front controller up");
		return "/start.jsp";
	}

}
