package com.java.sookang.Scommand;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.ui.Model;

import com.java.sookang.dao.ProfessorDao;

public class OpeningSubjectRegCommand implements SCommand {

	@Override
	public void execute(Model model) {
		// TODO Auto-generated method stub

		Map<String, Object> map = model.asMap();
		HttpServletRequest request = (HttpServletRequest) map.get("request");

		String OPENING_SUBJECT_ID = request.getParameter("OPENING_SUBJECT_ID");
		String PROFESSOR_ID = request.getParameter("PROFESSOR_ID");
		String PROFESSOR_NAME = request.getParameter("PROFESSOR_NAME");
		String SUBJECT_ID = request.getParameter("SUBJECT_ID");
		String SUBJECT_NAME = request.getParameter("SUBJECT_NAME");
		String LECTURE_TIME = request.getParameter("LECTURE_TIME");
		String LECTURE_ROOM = request.getParameter("LECTURE_ROOM");
		String SCORE = request.getParameter("SCORE");
		String ALLOWED_PERSONNEL = request.getParameter("ALLOWED_PERSONNEL");
		
		ProfessorDao dao = new ProfessorDao();
		dao.OSReg(OPENING_SUBJECT_ID, PROFESSOR_ID, PROFESSOR_NAME, SUBJECT_ID, SUBJECT_NAME, 
				LECTURE_TIME, LECTURE_ROOM, SCORE, ALLOWED_PERSONNEL);
	}

}
