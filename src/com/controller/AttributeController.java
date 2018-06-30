package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.entiey.Student;

@Controller
@RequestMapping("student")
@SessionAttributes(value= {"id"},types= {Student.class})
public class AttributeController {
 
	@RequestMapping(value="session/{id}",method=RequestMethod.GET)
	public ModelAndView session(@PathVariable("id")Integer id,ModelMap map) {
		ModelAndView m=new ModelAndView();
		m.addObject("id", id);
		m.addObject("student", new Student(1,"³ÂÐ¡·æ","123456"));
		m.setViewName("haha");
		map.addAttribute("name", "ÕÅÈý");
		map.addAttribute("age", 18);
		return m;
		
	}
	
	@RequestMapping("inter")
	public String testInterceptor() {
		System.out.println("testInterceptor");
		return "test";
	}
}
