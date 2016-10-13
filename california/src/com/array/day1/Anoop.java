package com.array.day1;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Anoop extends HttpServlet{
	public void init(){
		System.out.println("I am in init method");
		
	}
	public void dopost(HttpServletRequest req, HttpServletResponse res){
		System.out.println("i am in do pst method");
		
	}
	public void destroy(){
		System.out.println("I am in destroy metod");
	}

}
