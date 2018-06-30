package com.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class StudentInterceptor extends HandlerInterceptorAdapter {
	/**
	 * �߼�ǰִ�еķ���
	 */
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object hander) {
		System.out.println("preHandle");
		return true;
	}

	/**
	 * �߼�������ִ�еķ���
	 */
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object hander,
			ModelAndView modelAndView) {
		System.out.println("postHandle");

	}
	/**
	 * ��ͼ��Ⱦ��ִ�еķ���
	 */
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object hander,Exception ex) {
		System.out.println("afterCompletion");
	}

}
