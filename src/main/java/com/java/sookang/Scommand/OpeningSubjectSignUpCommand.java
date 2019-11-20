package com.java.sookang.Scommand;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.ui.Model;

import com.java.sookang.dao.StudentDao;

public class OpeningSubjectSignUpCommand implements SCommand {

	@Override
	public void execute(Model model) {
		// TODO Auto-generated method stub

		Map<String, Object> map = model.asMap();
		HttpServletRequest request = (HttpServletRequest) map.get("request");
		HttpSession session = (HttpSession)map.get("session");
		
		String sId = (String) session.getAttribute("Id");
		String sOPENING_SUBJECT_ID = request.getParameter("OPENING_SUBJECT_ID");
		String sSUBJECT_ID = request.getParameter("SUBJECT_ID");
		String sSUBJECT_NAME = request.getParameter("SUBJECT_NAME");
		String sPROFESSOR_NAME = request.getParameter("PROFESSOR_NAME");
		String sLECTURE_TIME = request.getParameter("LECTURE_TIME");
		String sLECTURE_ROOM = request.getParameter("LECTURE_ROOM");
		String sSCORE = request.getParameter("SCORE");
		
		StudentDao dao = new StudentDao();
		dao.OSSignUp(sId, sOPENING_SUBJECT_ID, sSUBJECT_ID, sSUBJECT_NAME, sPROFESSOR_NAME, sLECTURE_TIME, sLECTURE_ROOM, sSCORE);
	}

}
