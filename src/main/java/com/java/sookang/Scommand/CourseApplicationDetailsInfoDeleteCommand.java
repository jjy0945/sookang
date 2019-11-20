package com.java.sookang.Scommand;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.ui.Model;

import com.java.sookang.dao.StudentDao;

public class CourseApplicationDetailsInfoDeleteCommand implements SCommand {

	@Override
	public void execute(Model model) {
		// TODO Auto-generated method stub

		Map<String, Object> map = model.asMap();
		HttpServletRequest request = (HttpServletRequest) map.get("request");
		
		String sSTUDENT_ID = request.getParameter("STUDENT_ID");
		String sOPENING_SUBJECT_ID = request.getParameter("OPENING_SUBJECT_ID");
		StudentDao dao = new StudentDao();
		dao.CADDel(sSTUDENT_ID, sOPENING_SUBJECT_ID);
	}

}
