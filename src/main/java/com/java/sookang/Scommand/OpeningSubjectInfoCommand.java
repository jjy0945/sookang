package com.java.sookang.Scommand;

import java.util.ArrayList;

import org.springframework.ui.Model;

import com.java.sookang.dao.ProfessorDao;
import com.java.sookang.dto.OpeningSubjectDto;


public class OpeningSubjectInfoCommand implements SCommand {

	@Override
	public void execute(Model model) {
		// TODO Auto-generated method stub

		ProfessorDao dao = new ProfessorDao();
		ArrayList<OpeningSubjectDto> dtos = dao.OSList();
		model.addAttribute("OSlist", dtos);
	}

}
