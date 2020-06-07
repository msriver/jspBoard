package com.msriver.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.msriver.dao.BoardDAO;
import com.msriver.dto.BoardVO;

public class BoardWriteAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		BoardVO bVo = new BoardVO();
		bVo.setPass(request.getParameter("pass"));
		bVo.setName(request.getParameter("name"));
		bVo.setTitle(request.getParameter("title"));
		bVo.setEmail(request.getParameter("email"));
		bVo.setContent(request.getParameter("content"));
		
		BoardDAO bDao = BoardDAO.getInstance();
		bDao.insertBoard(bVo);
		response.sendRedirect("BoardServlet?command=board_list");
	}
	
}
