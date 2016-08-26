package org.gvaireth.liferaytest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

	@RequestMapping("/start")
	public String helloWorld2(Model model) {
		model.addAttribute("modelparam", "ok");
		System.out.println("front controller up");
		return "/start.jsp";
	}

}
