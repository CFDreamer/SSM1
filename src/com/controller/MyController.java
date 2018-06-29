  
package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.view.json.MappingJackson2JsonView;

import com.entiey.Student;
import com.service.StudentService;

@Controller
@RequestMapping("")
public class MyController {
	
	@Autowired
	StudentService studentService;

	@RequestMapping("hello")
	public ModelAndView hello() {
		System.out.println("hello");
		ModelAndView m=new ModelAndView();
		List<Student> list=studentService.selectAll();
		m.addObject("list",list);
		m.setViewName("hello");
		return m;
	}
	@RequestMapping("test")
	public ModelAndView test() {
		System.out.println("test");
		ModelAndView m=new ModelAndView();
		m.setViewName("test");
		return m;
	}
	
	//POJO���ȡ����(POJO������Ա����ǰ��һ��)
	@RequestMapping( value="showParams",method=RequestMethod.POST)
	public ModelAndView test(Student s) {
		System.out.println("showParams");
		ModelAndView m=new ModelAndView();
		m.addObject("id", s.getId());
		m.addObject("username", s.getUsername());
		m.addObject("password", s.getPassword());
		m.setViewName("showParams");
		return m;
	}
	
	//@RequestParamע���ȡ����(���ݵĲ���Ϊǰ�����õ����� Ĭ�ϲ�����Ϊ�� ��Ϊ�ջ��׳��쳣)
	//������required=false ���ܵĲ�������Ϊ��
	@RequestMapping( value="showParams1",method=RequestMethod.POST)
	public ModelAndView test(@RequestParam("id") String id,@RequestParam("user_name") String username,@RequestParam("pass_word") String password) {
		System.out.println("showParams1");
		ModelAndView m=new ModelAndView();
		m.addObject("id", id);
		m.addObject("username", username);
		m.addObject("password", password);
		m.setViewName("showParams");
		return m;
	}
	/**
	 * 
	 * ������д��URL��ַ ����  action�����ַΪ./showParams2/1/��С��/123456
	 * ����ʽֻ����get
	 * @RequestMappingע���е�({id},{username},{password}) �������һ����URL��ɵĲ���
	 * @PathVariable("id") ��ʾȡ����Ϊid�Ĳ���
	 */
	@RequestMapping( value="showParams2/{id}/{username}/{password}",method=RequestMethod.GET)
	public ModelAndView test(@PathVariable("id") Integer id,@PathVariable("username") String username,@PathVariable("password") String password) {
		System.out.println("showParams2");
		ModelAndView m=new ModelAndView();
		Student s=studentService.selectById(id);
		m.addObject("student", s);
		m.setView(new MappingJackson2JsonView());
//		m.addObject("id", id);
//		m.addObject("username", username);
//		m.addObject("password", password);
//		m.setViewName("showParams");
		return m;
	}
	
	/**
	 * �ض���
	 */
	/**
	 * ����һ��Student��������
	 */
	@RequestMapping(value="addStudent",method=RequestMethod.POST)
	public String addStudent(Model model,Student s) {
		System.out.println("hello");
		studentService.insert(s);
		model.addAttribute("id", s.getId());
		return "redirect:./showJson";
		
	}
	@RequestMapping("showJson")
	public void showJson(Model model,Integer id) {
		System.out.println(id);
	}
	
	@RequestMapping(value="addStudent1",method=RequestMethod.POST)
	public String addStudent1(RedirectAttributes rs,Student s) {
		System.out.println("addStudent1");
		studentService.insert(s);
		rs.addFlashAttribute("student", s);
		return "redirect:./showStudentJson";
		
	}
	@RequestMapping(value="showStudentJson",method=RequestMethod.GET)
	public ModelAndView showStudentJson(Student student) {
		System.out.println(student);
		ModelAndView m=new ModelAndView();
		m.setViewName("haha");
		return m;
	}
}
