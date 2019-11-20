package com.java.sookang.Scommand;

import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.ui.Model;

import com.java.sookang.dao.ProfessorDao;
import com.java.sookang.dto.ProfessorDto;

public class ProfessorInfoCommand implements SCommand {

	@Override
	public void execute(Model model) {
		// TODO Auto-generated method stub

		Map<String, Object> map = model.asMap();
		HttpSession session = (HttpSession) map.get("session");
		
		String Id = (String) session.getAttribute("Id");
		
		ProfessorDao dao = new ProfessorDao();
		ProfessorDto dto = dao.PInfoView(Id);
		
		model.addAttribute("PInfoView", dto);
		
	}

}
