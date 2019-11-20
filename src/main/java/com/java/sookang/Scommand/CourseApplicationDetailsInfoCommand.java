package com.java.sookang.Scommand;

import java.util.ArrayList;

import org.springframework.ui.Model;

import com.java.sookang.dao.StudentDao;
import com.java.sookang.dto.CourseApplicationDto;


public class CourseApplicationDetailsInfoCommand implements SCommand {

	@Override
	public void execute(Model model) {
		// TODO Auto-generated method stub

		StudentDao dao = new StudentDao();
		ArrayList<CourseApplicationDto> dtos = dao.CADList();
		model.addAttribute("CADlist", dtos);
	}

}
