package com.java.sookang.Scommand;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.ui.Model;

import com.java.sookang.dao.ProfessorDao;

public class OpeningSubjectDeleteCommand implements SCommand {

	@Override
	public void execute(Model model) {
		// TODO Auto-generated method stub

		Map<String, Object> map = model.asMap();
		HttpServletRequest request = (HttpServletRequest) map.get("request");
		
		String sOPENING_SUBJECT_ID = request.getParameter("OPENING_SUBJECT_ID");
		ProfessorDao dao = new ProfessorDao();
		dao.OSDel(sOPENING_SUBJECT_ID);
	}

}
