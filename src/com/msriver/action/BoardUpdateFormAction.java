package com.msriver.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.msriver.dao.BoardDAO;
import com.msriver.dto.BoardVO;

public class BoardUpdateFormAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String url = "board/boardUpdate.jsp";
		BoardDAO bDao = BoardDAO.getInstance();
		BoardVO bVo = bDao.selectBoardByNum(request.getParameter("num"));
		request.setAttribute("board", bVo);
		request.getRequestDispatcher(url).forward(request, response);
	}
	
}
