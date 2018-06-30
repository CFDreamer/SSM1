package com.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class StudentInterceptor extends HandlerInterceptorAdapter {
	/**
	 * 逻辑前执行的方法
	 */
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object hander) {
		System.out.println("preHandle");
		return true;
	}

	/**
	 * 逻辑处理完执行的方法
	 */
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object hander,
			ModelAndView modelAndView) {
		System.out.println("postHandle");

	}
	/**
	 * 视图渲染后执行的方法
	 */
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object hander,Exception ex) {
		System.out.println("afterCompletion");
	}

}
