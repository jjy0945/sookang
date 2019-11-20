package com.java.sookang.Scommand;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.ui.Model;

import com.java.sookang.dao.ProfessorDao;


public class ProfessorModCommand implements SCommand {

	@Override
	public void execute(Model model) {
		// TODO Auto-generated method stub

		Map<String, Object> map = model.asMap();
		HttpServletRequest request = (HttpServletRequest) map.get("request");

		String Password = request.getParameter("Password");
		String Id = request.getParameter("Id");

		ProfessorDao dao = new ProfessorDao();
		dao.PModify(Password, Id);
	}

}
