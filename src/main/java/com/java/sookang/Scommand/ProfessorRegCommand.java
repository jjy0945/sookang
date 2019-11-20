package com.java.sookang.Scommand;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.ui.Model;

import com.java.sookang.dao.ManagerDao;

public class ProfessorRegCommand implements SCommand {

	@Override
	public void execute(Model model) {
		// TODO Auto-generated method stub

		Map<String, Object> map = model.asMap();
		HttpServletRequest request = (HttpServletRequest) map.get("request");

		String Id = request.getParameter("Id");
		String Password = request.getParameter("Password");
		String Name = request.getParameter("Name");
		String Date = request.getParameter("Date");
	
		ManagerDao dao = new ManagerDao();
		dao.PReg(Id, Password, Name, Date);
	}

}
