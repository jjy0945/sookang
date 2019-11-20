package com.java.sookang.Scommand;

import java.util.ArrayList;


import org.springframework.ui.Model;

import com.java.sookang.dao.ManagerDao;
import com.java.sookang.dto.StudentDto;


public class StudentListCommand implements SCommand {

	@Override
	public void execute(Model model) {
		// TODO Auto-generated method stub

		ManagerDao dao = new ManagerDao();
		ArrayList<StudentDto> dtos = dao.List();
		model.addAttribute("list", dtos);
	}

}
