package org.gvaireth.liferaytest;

import javax.portlet.ActionResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.portlet.bind.annotation.ActionMapping;
import org.springframework.web.portlet.bind.annotation.RenderMapping;

@Controller
@RequestMapping("VIEW")
public class ViewController {
	public static final String PAGE_1 = "first";
	public static final String PAGE_2 = "second";

	@RenderMapping
	public String defaultView() {
		System.out.println("first");

		return PAGE_1;
	}

	@RenderMapping(params = "render=second")
	public String alternativeView() {
		System.out.println("second");

		return PAGE_2;
	}

	@ActionMapping(params = "action=action-one")
	public void actionOne() {
		System.out.println("Action one");
	}

	@ActionMapping(params = "action=action-two")
	public void actionTwo(ActionResponse actionResponse) {
		System.out.println("Action two");

		actionResponse.setRenderParameter("render", "second");
	}
}
