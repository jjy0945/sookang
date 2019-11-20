package com.java.sookang.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.java.sookang.Scommand.OpeningSubjectDeleteCommand;
import com.java.sookang.Scommand.OpeningSubjectInfoCommand;
import com.java.sookang.Scommand.OpeningSubjectModifyCommand;
import com.java.sookang.Scommand.OpeningSubjectRegCommand;
import com.java.sookang.Scommand.ProfessorInfoCommand;
import com.java.sookang.Scommand.ProfessorModCommand;
import com.java.sookang.Scommand.SCommand;


@Controller
public class ProfessorController {
	
	SCommand command = null;
	
	
	@RequestMapping(value = "ProfessorModForm", method = RequestMethod.GET)
	public String ProfessorModForm (HttpSession session, Model model) {
		
		model.addAttribute("session", session);
		command = new ProfessorInfoCommand();
		command.execute(model);
		
		return "ProfessorModForm";
	}
	
	@RequestMapping(value = "ProfessorMod", method = RequestMethod.POST)
	public String ProfessorMod(HttpServletRequest request, Model model){
		
		model.addAttribute("request", request);
		command = new ProfessorModCommand();
		command.execute(model);
		
		return "ProfessorMain";
	}
	
	@RequestMapping(value = "OpeningSubjectForm", method = RequestMethod.GET)
	public String OpeningSubjectForm (Model model) {
		
		return "OpeningSubjectForm";
	}
	
	@RequestMapping(value = "OpeningSubjectReg", method = RequestMethod.POST)
	public String StudentReg (HttpServletRequest request, Model model) {
		
		model.addAttribute("request", request);
		command = new OpeningSubjectRegCommand();
		command.execute(model);
		
		return "ProfessorMain";
	}
	
	@RequestMapping(value = "OpeningSubjectInfo", method = RequestMethod.GET)
	public String OpeningSubjectInfo(HttpSession session, Model model) {
		
		command = new OpeningSubjectInfoCommand();
		command.execute(model);
		String i = (String) session.getAttribute("InlineRadioOptions");
		String Id = (String) session.getAttribute("Id");
		model.addAttribute("Id", Id);
		
		if(i.equals("option2")) {
			
		return "OpeningSubjectInfo";
		}
		
		return "redirect:/";
	}
	
	@RequestMapping(value = "OpeningSubjectDelete", method = RequestMethod.GET)
	public String OpeningSubjectDelete(HttpServletRequest request, Model model) {
		
		model.addAttribute("request", request);
		command = new OpeningSubjectDeleteCommand();
		command.execute(model);
		
		return "ProfessorMain";
	}
	
	@RequestMapping(value = "OpeningSubjectInfoLookUp", method = RequestMethod.GET)
	public String OpeningSubjectInfoLookUp (HttpSession session, Model model) {
		
		command = new OpeningSubjectInfoCommand();
		command.execute(model);
		String i = (String) session.getAttribute("InlineRadioOptions");
		String Id = (String) session.getAttribute("Id");
		model.addAttribute("Id", Id);
		
		if(i.equals("option2")) {
			
		return "OpeningSubjectInfoLookUp";
		}
		
		return "redirect:/";
	}
	
	@RequestMapping(value = "OpeningSubjectMod", method = {RequestMethod.GET, RequestMethod.POST})
	public String OpeningSubjectMod (HttpServletRequest request, Model model) {
		
		model.addAttribute("request", request);
		command = new OpeningSubjectModifyCommand();
		command.execute(model);
		
		return "ProfessorMain";
	}
}
