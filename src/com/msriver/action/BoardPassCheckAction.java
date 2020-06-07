package com.msriver.action;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.msriver.dao.BoardDAO;
import com.msriver.dto.BoardVO;

public class BoardPassCheckAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub				
		String num = request.getParameter("num");
		String pass = request.getParameter("pass");
		String what = request.getParameter("what");
		String message = "비밀번호가 맞지않습니다.";
		String url = null;
		BoardDAO bDao = BoardDAO.getInstance();
		boolean passCheck = bDao.checkPass(pass, num);
		
		if(passCheck==true) {
			url = "board/successCheck.jsp";
		} else if(passCheck==false){
			request.setAttribute("message", message);
			url = "board/passCheck.jsp";			
		}
		request.getRequestDispatcher(url).forward(request, response);
	}
	
}
