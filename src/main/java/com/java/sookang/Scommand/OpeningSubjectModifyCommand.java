package com.java.sookang.Scommand;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.ui.Model;

import com.java.sookang.dao.ProfessorDao;


public class OpeningSubjectModifyCommand implements SCommand {

	@Override
	public void execute(Model model) {
		// TODO Auto-generated method stub

		Map<String, Object> map = model.asMap();
		HttpServletRequest request = (HttpServletRequest) map.get("request");
		
		String sLECTURE_TIME = request.getParameter("LECTURE_TIME");
		String sLECTURE_ROOM = request.getParameter("LECTURE_ROOM");
		String sSCORE = request.getParameter("SCORE");
		String sALLOWED_PERSONNEL = request.getParameter("ALLOWED_PERSONNEL");
		String sOPENING_SUBJECT_ID = request.getParameter("OPENING_SUBJECT_ID");
		
		ProfessorDao dao = new ProfessorDao();
		dao.OSMod(sLECTURE_TIME, sLECTURE_ROOM, sSCORE, sALLOWED_PERSONNEL, sOPENING_SUBJECT_ID);
		
	}

}
