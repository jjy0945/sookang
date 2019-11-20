package com.java.sookang.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.java.sookang.Scommand.LCCommand;
import com.java.sookang.Scommand.LoginCheckCommand;
import com.java.sookang.Scommand.SCommand;


@Controller
public class SookangController {

	SCommand command = null;
	LCCommand lccommand = null;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String Main (Model model) {
		
		return "Main";
	}
	
	@RequestMapping(value = "UserLogin", method = RequestMethod.GET)
	public String UserLogin (Model model) {
		
		return "UserLogin";
	}
	
	@RequestMapping(value = "LoginCheck", method = RequestMethod.POST)
	public String LoginCheck (HttpServletRequest request, HttpServletResponse response, HttpSession session, Model model) throws IOException {
		
		String InlineRadioOptions = request.getParameter("InlineRadioOptions");
		String Id = request.getParameter("Id");
		String Password = request.getParameter("Password");
		
		session.setAttribute("InlineRadioOptions", InlineRadioOptions);
		session.setAttribute("Id", Id);
		session.setAttribute("Password", Password);
		session.setMaxInactiveInterval(600);
		
		model.addAttribute("request", request);
		model.addAttribute("session", session);
		lccommand = new LoginCheckCommand();
		
		if(lccommand.execute(model) == 1) {
		
			return "StudentMain";
		}
		
		if(lccommand.execute(model) == 2) {
			
			return "ProfessorMain";
		}
		
		if(lccommand.execute(model) == 3) {
			
			return "ManagerMain";
		}
		
		
		return "Main";
	}
	
	@RequestMapping(value = "/Logout", method = RequestMethod.GET)
	public String Logout(HttpSession session, Model model) {
		
		session.invalidate();
		
		return "redirect:/";
	}
	
}
