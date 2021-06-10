package sample2.controller.member;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import sample2.bean.Member;
import sample2.dao.MemberDao;

/**
 * Servlet implementation class Sample2ListServlet
 */
<<<<<<< HEAD:src/sample2/controller/member/Sample2ListServlet.java
@WebServlet("/sample2/member/list")
=======
@WebServlet("/sample2/mamber/list")
>>>>>>> 9bcedfc860e708cf72e20978218325c3bf97aa45:src/sample2/controller/Sample2ListServlet.java
public class Sample2ListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Sample2ListServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		MemberDao dao = new MemberDao();
		
		// db에서 회원 list 얻어서
		List<Member> list = dao.list();
		
		// request attribute에 붙여서
		request.setAttribute("members", list);
		
		// forward
<<<<<<< HEAD:src/sample2/controller/member/Sample2ListServlet.java
		String path = "/WEB-INF/sample2/member/list.jsp";
=======
		String path = "/WEB-INF/sample2/mamber/list.jsp";
>>>>>>> 9bcedfc860e708cf72e20978218325c3bf97aa45:src/sample2/controller/Sample2ListServlet.java
		request.getRequestDispatcher(path).forward(request, response);
		
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
