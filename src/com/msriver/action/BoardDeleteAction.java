package com.msriver.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.msriver.dao.BoardDAO;

public class BoardDeleteAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		BoardDAO bDao = BoardDAO.getInstance();
		bDao.deleteBoard(request.getParameter("num"));
		
		response.sendRedirect("BoardServlet?command=board_list");
	}

}
