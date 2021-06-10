package sample2.controller.member;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import sample2.bean.Member;
import sample2.dao.MemberDao;
import sample2.service.member.MemberService;

/**
 * Servlet implementation class Sample2InfoServlet
 */
<<<<<<< HEAD:src/sample2/controller/member/Sample2InfoServlet.java
@WebServlet("/sample2/member/info")
=======
@WebServlet("/sample2/mamber/info")
>>>>>>> 9bcedfc860e708cf72e20978218325c3bf97aa45:src/sample2/controller/Sample2InfoServlet.java
public class Sample2InfoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	private MemberService service;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Sample2InfoServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

    @Override
    public void init() throws ServletException {
    	super.init();
    	service = new MemberService();
    }
    
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession(); //로그인 한 사람만 접근하도록
		Member member = (Member) session.getAttribute("userLogined");
		
		if (member != null) {
			MemberDao dao = new MemberDao();
//			Member mem = dao.getMember(member.getId());
//			Member mem = dao.getMember2(member.getId());
			
			Member mem = service.getMember(member.getId());
			
			request.setAttribute("member", mem);
<<<<<<< HEAD:src/sample2/controller/member/Sample2InfoServlet.java
			
			String path = "/WEB-INF/sample2/member/info.jsp";
=======
	
			String path = "/WEB-INF/sample2/mamber/info.jsp";
>>>>>>> 9bcedfc860e708cf72e20978218325c3bf97aa45:src/sample2/controller/Sample2InfoServlet.java
			request.getRequestDispatcher(path).forward(request, response);
		} else {
			String path = request.getContextPath() + "/sample2/main";
			response.sendRedirect(path);
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}




