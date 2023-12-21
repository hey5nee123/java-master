package common;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//doget 직접 만들기

@WebServlet("/getStudentSetvlet")
public class GetStudentServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// sno라는 parameter를 읽어오겠습니다.
		// parameter는 여러 개 가능
		// url?sno =23-010&sname = 홍길동
		resp.setContentType("text/html;charset=utf-8");

		String sno = req.getParameter("sno");

		StudentDAO dao = new StudentDAO();
		Student std = dao.getStudnet(sno);

		String str = "<table border = '1'>";
		str += "<caption>학생정보</caption>";
		str += "<tr><th>학번</th><td>" + std.getStudNo() + "</td></tr>";
		str += "<tr><th>이름</th><td>" + std.getStudName() + "</td></tr>";
		str += "<tr><th>영어</th><td>" + std.getEngScore() + "</td></tr>";
		str += "<tr><th>수학</th><td>" + std.getMatScore() + "</td></tr>";
		str += "</table>";
		str += "<br><a href ='modifyStudent?sno="+ std.getStudNo() +"'>수정화면</a>";
		str += "<br><a href =''>목록</a>";

		// 사용자 페이지로 출력.
		resp.getWriter().print(str);

	}
}