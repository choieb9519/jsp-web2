package sample2.controller.member;

import java.io.IOException;
import java.sql.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import sample2.bean.Member;
import sample2.dao.MemberDao;

/**
 * Servlet implementation class Sample2SignUpServlet
 */
<<<<<<< HEAD:src/sample2/controller/member/Sample2SignUpServlet.java
@WebServlet("/sample2/member/signup")
public class Sample2SignUpServlet extends HttpServlet {
=======
@WebServlet("/sample2/mamber/signup")
public class Sample2SignUpSelvet extends HttpServlet {
>>>>>>> 9bcedfc860e708cf72e20978218325c3bf97aa45:src/sample2/controller/member/Sample2SignUpSelvet.java
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Sample2SignUpServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
<<<<<<< HEAD:src/sample2/controller/member/Sample2SignUpServlet.java
		String path = "/WEB-INF/sample2/member/signup.jsp";
=======
		String path = "/WEB-INF/sample2/mamber/signup.jsp";
>>>>>>> 9bcedfc860e708cf72e20978218325c3bf97aa45:src/sample2/controller/member/Sample2SignUpSelvet.java
		request.getRequestDispatcher(path).forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		request.setCharacterEncoding("utf-8");
		// request parameter 수집
		String id = request.getParameter("id");
		String password = request.getParameter("password");
		String name = request.getParameter("name");
		String birth = request.getParameter("birth");
		String gender = request.getParameter("gender");
		
		// Member bean 완성
		Member member = new Member();
		member.setId(id);
		member.setPassword(password);
		member.setName(name);
		member.setBirth(Date.valueOf(birth));
		member.setGender(gender);
		
		// dao insert 메소드 호출
		MemberDao dao = new MemberDao();
		boolean ok = dao.insert(member);
		
		// forward or redirect
		if (ok) {
			String path = request.getContextPath() + "/sample2/member/list";
			response.sendRedirect(path);
		} else {
<<<<<<< HEAD:src/sample2/controller/member/Sample2SignUpServlet.java
			request.setAttribute("message", "가입 실패");
			
			String path = "/WEB-INF/sample2/member/signup.jsp";
=======
			String path = "/WEB-INF/sample2/mamber/signup.jsp";
>>>>>>> 9bcedfc860e708cf72e20978218325c3bf97aa45:src/sample2/controller/member/Sample2SignUpSelvet.java
			request.getRequestDispatcher(path).forward(request, response);
		}
	}
}