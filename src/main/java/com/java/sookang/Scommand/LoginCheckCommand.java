package com.java.sookang.Scommand;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.ui.Model;

import com.java.sookang.dao.LCDao;


public class LoginCheckCommand implements LCCommand {

	@Override
	public int execute(Model model) {
		// TODO Auto-generated method stub
		
		Map<String, Object> map = model.asMap();
		HttpServletRequest request = (HttpServletRequest) map.get("request");
		
		String InlineRadioOptions = (String) request.getParameter("InlineRadioOptions");
		String Id = request.getParameter("Id");
		String Password = request.getParameter("Password");
		
		LCDao dao = new LCDao();
		int i = dao.LoginCheck(InlineRadioOptions, Id, Password);
		
		return i;
		
	}

}
