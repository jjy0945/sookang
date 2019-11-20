package com.java.sookang.Scommand;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.ui.Model;

import com.java.sookang.dao.StudentDao;

public class StudentModCommand implements SCommand {

	@Override
	public void execute(Model model) {
		// TODO Auto-generated method stub

		Map<String, Object> map = model.asMap();
		HttpServletRequest request = (HttpServletRequest) map.get("request");

		String Password = request.getParameter("Password");
		String Id = request.getParameter("Id");

		StudentDao dao = new StudentDao();
		dao.SModify(Password, Id);
	}

}
