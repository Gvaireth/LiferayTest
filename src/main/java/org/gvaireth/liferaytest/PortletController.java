package org.gvaireth.liferaytest;

import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.springframework.web.portlet.ModelAndView;
import org.springframework.web.portlet.mvc.AbstractController;

//low level old style controller
public class PortletController extends AbstractController {

	public ModelAndView handleRenderRequestInternal(RenderRequest request, RenderResponse response) {
		ModelAndView mav = new ModelAndView("foo");
		mav.addObject("message", "Hello World!");
		return mav;
	}
}
