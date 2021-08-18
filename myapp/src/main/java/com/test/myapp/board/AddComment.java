package com.test.myapp.board;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/board/addcomment.do") // web.xml을 작성 안해도됨
public class AddComment extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		//할일
		//1. 데이터 가져오기 (content,pseq)
		//2. DB작업 > DAO 위임 > insert
		//3. 돌아가기 > view.do?seq=10
		CheckMember cm = new CheckMember();
		cm.check(req,resp);

		HttpSession session = req.getSession();
		
		
		//1. 
		String pseq = req.getParameter("pseq");// 보고 있던 글번호
		String content = req.getParameter("content");
		String id = session.getAttribute("id").toString();
		
		
		//2. 
		BoardDAO dao = new BoardDAO();
		
		CommentDTO dto = new CommentDTO();
		
		dto.setId(id);
		dto.setPseq(pseq);
		dto.setContent(content);
		
		int result = dao.addComment(dto);//   1  or 0
		
		
		//3.
		if(result==1) {
			resp.sendRedirect("/myapp/board/view.do?seq="+pseq);
		}else {
			
			resp.setCharacterEncoding("UTF-8");
			
			PrintWriter writer = resp.getWriter();
			writer.print("<html>");
			writer.print("<body>");
			writer.print("<script>");
			writer.print("alert('댓글 쓰기 실패');");
			writer.print("history.back();");
			writer.print("</script>");
			writer.print("</body>");
			writer.print("</html>");
			writer.close();
		}
		

	}

}