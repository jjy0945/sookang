package com.java.sookang.Scommand;

import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.ui.Model;

import com.java.sookang.dao.StudentDao;
import com.java.sookang.dto.StudentDto;

public class StudentInfoCommand implements SCommand {

	@Override
	public void execute(Model model) {
		// TODO Auto-generated method stub

		Map<String, Object> map = model.asMap();
		HttpSession session = (HttpSession) map.get("session");
		
		String Id = (String) session.getAttribute("Id");
		
		StudentDao dao = new StudentDao();
		StudentDto dto = dao.SInfoView(Id);
		
		model.addAttribute("SInfoView", dto);
		
	}

}
