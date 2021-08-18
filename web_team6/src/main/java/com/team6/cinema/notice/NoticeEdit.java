package com.team6.cinema.notice;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/***
 * 공지사항 수정 클래스
 * @author 6조
 *
 */
@WebServlet("/notice/noticeedit.do") // web.xml을 작성 안해도됨
public class NoticeEdit extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		

		RequestDispatcher dispatcher = req.getRequestDispatcher("/WEB-INF/views/notice/noticeedit.jsp");
		dispatcher.forward(req, resp);
	}

}
