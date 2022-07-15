package com.kh.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/subway")
public class SubwayServlet extends HttpServlet {
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String birth = req.getParameter("birth");
		
		//연산 ~~~
		String year_ = birth.substring(0, 4);
		int year = Integer.parseInt(year_);
		
		int todayYear = LocalDate.now().getYear();
		
		int age = todayYear - year + 1;
		
		
		//출력
		resp.setContentType("text/pain; charset=UTF-8");
		PrintWriter pw = resp.getWriter();
		
		pw.println(age);
		
	}

}//class







































