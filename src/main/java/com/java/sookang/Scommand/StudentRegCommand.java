package com.java.sookang.Scommand;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.ui.Model;

import com.java.sookang.dao.ManagerDao;

public class StudentRegCommand implements SCommand {

	@Override
	public void execute(Model model) {
		// TODO Auto-generated method stub

		Map<String, Object> map = model.asMap();
		HttpServletRequest request = (HttpServletRequest) map.get("request");

		String Id = request.getParameter("Id");
		String Password = request.getParameter("Password");
		String Rnumber = request.getParameter("Rnumber");
		String Name = request.getParameter("Name");
		String Grade = request.getParameter("Grade");
		String Dept = request.getParameter("Dept");
		
		ManagerDao dao = new ManagerDao();
		dao.Reg(Id, Password, Rnumber, Name, Grade, Dept);
	}

}
