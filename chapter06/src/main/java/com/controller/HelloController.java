package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class HelloController {
	
	@RequestMapping(value="/hello.do", method=RequestMethod.GET)
	public ModelAndView hello() {//사용자가 만든 콜백 메소드
		ModelAndView mav = new ModelAndView();
		mav.addObject("result","Hello Spring!!");
		//mav.setViewName("hello"); //파일명만 지정(나머지는 dispatcherServlet-servlet.xml에 작성함)
		mav.setViewName("/WEB-INF/view/hello");
		return mav;
	}
	
	@RequestMapping(value="/hello2.do", method=RequestMethod.GET)
	public ModelAndView hello2() {
		ModelAndView mav = new ModelAndView();
		mav.addObject("result2","Hava a nice day");
		mav.setViewName("/WEB-INF/view2/hello2");
		return mav;
	}
	
	@RequestMapping(value="/hello3.do", method=RequestMethod.GET, produces = "text/html; charset=UTF-8")
	@ResponseBody //단순 문자열로 인식
	public String hello3() {
		
		return "안녕하세요!";//파일명 로 인식
	}
	//스프링에서는 return타입이 String이면 파일명으로 인식한다.
	//스프링은 welcome.jsp 파일을 찾는다.
	//만약 단순 문자열로 웹 브라우저에 나타내려면 @ResponseBody 사용

}

/*
 콜백 메소드
- 어떤 때가 되면 운영체제, 스프링에 의해서 호출되는 메소드

 http://locallhost:8080/Context명(프로젝트명)/hello.do
 
 DistpatcherServlet -> HelloController.java
 				HandlerMapping
 */