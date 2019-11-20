package com.java.sookang.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.java.sookang.Scommand.ProfessorListCommand;
import com.java.sookang.Scommand.ProfessorRegCommand;
import com.java.sookang.Scommand.SCommand;
import com.java.sookang.Scommand.StudentListCommand;
import com.java.sookang.Scommand.StudentRegCommand;


@Controller
public class ManagerController {

	SCommand command = null;
	
	@RequestMapping(value = "StudentRegForm", method = RequestMethod.GET)
	public String StudentRegForm (Model model) {
		
		return "StudentRegForm";
	}
	
	@RequestMapping(value = "StudentReg", method = RequestMethod.POST)
	public String StudentReg (HttpServletRequest request, Model model) {
		
		model.addAttribute("request", request);
		command = new StudentRegCommand();
		command.execute(model);
		
		return "ManagerMain";
	}
	
	@RequestMapping(value = "StudentList", method = RequestMethod.GET)
	public String StudentList(HttpSession session, Model model) {
		
		command = new StudentListCommand();
		command.execute(model);
		String i = (String) session.getAttribute("InlineRadioOptions");
		
		if(i.equals("option3")) {
			
		return "StudentList";
		}
		
		return "redirect:/";
	}
	
	@RequestMapping(value = "ProfessorRegForm", method = RequestMethod.GET)
	public String ProfessorRegForm (Model model) {
		
		return "ProfessorRegForm";
	}
	
	@RequestMapping(value = "ProfessorReg", method = RequestMethod.POST)
	public String ProfessorReg (HttpServletRequest request, Model model) {
		
		model.addAttribute("request", request);
		command = new ProfessorRegCommand();
		command.execute(model);
		
		return "ManagerMain";
	}
	
	@RequestMapping(value = "ProfessorList", method = RequestMethod.GET)
	public String ProfessorList(HttpSession session, Model model) {
		
		command = new ProfessorListCommand();
		command.execute(model);
		String i = (String) session.getAttribute("InlineRadioOptions");
		
		if(i.equals("option3")) {
			
		return "ProfessorList";
		}
		
		return "redirect:/";
	}
	
}
