package com.java.sookang.controller;

import javax.servlet.http.HttpServletRequest;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.java.sookang.Scommand.CourseApplicationDetailsInfoCommand;
import com.java.sookang.Scommand.CourseApplicationDetailsInfoDeleteCommand;
import com.java.sookang.Scommand.OpeningSubjectInfoCommand;
import com.java.sookang.Scommand.OpeningSubjectSignUpCommand;
import com.java.sookang.Scommand.SCommand;
import com.java.sookang.Scommand.StudentInfoCommand;
import com.java.sookang.Scommand.StudentModCommand;


@Controller
public class StudentController {

	SCommand command = null;
	
	
	@RequestMapping(value = "StudentModForm", method = RequestMethod.GET)
	public String StudentModForm (HttpSession session, Model model) {
		
		model.addAttribute("session", session);
		command = new StudentInfoCommand();
		command.execute(model);
		
		return "StudentModForm";
	}
	
	@RequestMapping(value = "StudentMod", method = RequestMethod.POST)
	public String StudentModMod(HttpServletRequest request, Model model){
		
		model.addAttribute("request", request);
		command = new StudentModCommand();
		command.execute(model);
		
		return "StudentMain";
	}
	
	@RequestMapping(value = "OpeningSubjectInfoS", method = RequestMethod.GET)
	public String OpeningSubjectInfoS(HttpSession session, Model model) {
		
		command = new OpeningSubjectInfoCommand();
		command.execute(model);
		String i = (String) session.getAttribute("InlineRadioOptions");
		String Id = (String) session.getAttribute("Id");
		model.addAttribute("Id", Id);
		
		if(i.equals("option1")) {
			
		return "OpeningSubjectInfoS";
		}
		
		return "redirect:/";
	}
	
	@RequestMapping(value = "OpeningSubjectSignUp", method = RequestMethod.GET)
	public String OpeningSubjectSignUp(HttpSession session, HttpServletRequest request, Model model) {
		
		model.addAttribute("request", request);
		model.addAttribute("session", session);
		command = new OpeningSubjectSignUpCommand();
		command.execute(model);
		
		return "StudentMain";
	}
	
	@RequestMapping(value = "CourseApplicationDetailsInfo", method = RequestMethod.GET)
	public String CourseApplicationDetailsForm (HttpSession session, Model model) {
		
		command = new CourseApplicationDetailsInfoCommand();
		command.execute(model);
		String i = (String) session.getAttribute("InlineRadioOptions");
		String Id = (String) session.getAttribute("Id");
		model.addAttribute("Id", Id);
		
		if(i.equals("option1")) {
			
		return "CourseApplicationDetailsInfo";
		}
		
		return "redirect:/";
	}
	
	@RequestMapping(value = "CourseApplicationDetailsInfoDelete", method = RequestMethod.GET)
	public String CourseApplicationDetailsInfoDelete(HttpServletRequest request, Model model) {
		
		model.addAttribute("request", request);
		command = new CourseApplicationDetailsInfoDeleteCommand();
		command.execute(model);
		
		return "StudentMain";
	}
	
	@RequestMapping(value = "CourseApplicationDetailsLookUp", method = RequestMethod.GET)
	public String CourseApplicationDetailsLookUp (HttpSession session, Model model) {
		
		command = new CourseApplicationDetailsInfoCommand();
		command.execute(model);
			
		return "CourseApplicationDetailsLookUp";
	}
	
}
