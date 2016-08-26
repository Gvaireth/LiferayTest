package org.gvaireth.liferaytest;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.context.ServletContextAware;

@SpringBootApplication
@EnableAutoConfiguration
@Configuration
public class LiferaytestApplication extends SpringBootServletInitializer implements ServletContextAware {

	private static Class<LiferaytestApplication> applicationClass = LiferaytestApplication.class;

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(applicationClass);
	}

	@Override
	public void onStartup(ServletContext servletContext) throws ServletException {
		servletContext.setInitParameter("initparam", "ok");
		servletContext.setAttribute("contextattribute", "ok");
		servletContext.setAttribute("contextConfigLocation", "/WEB-INF/spring-portlet.xml");
		super.onStartup(servletContext);

	}

	public static void main(String[] args) {
		SpringApplication.run(LiferaytestApplication.class, args);
		System.out.println("app running!");
	}

	@Override
	public void setServletContext(ServletContext servletContext) {
		System.out.println("servletContext " + servletContext);
		System.out.println("initparam " + servletContext.getInitParameter("initparam"));
		System.out.println("contextattribute " + servletContext.getAttribute("contextattribute"));
	}
}
