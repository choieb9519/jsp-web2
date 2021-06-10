package sample2.controller.board;

import java.io.IOException;
<<<<<<< HEAD
import java.util.List;
=======
>>>>>>> 9bcedfc860e708cf72e20978218325c3bf97aa45

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

<<<<<<< HEAD
import sample2.bean.BoardDto;
import sample2.bean.Comment;
import sample2.dao.BoardDao;
import sample2.service.comment.CommentService;

=======
import sample2.bean.Board;
import sample2.dao.BoardDao;
>>>>>>> 9bcedfc860e708cf72e20978218325c3bf97aa45

/**
 * Servlet implementation class Sample2BoardDetailServlet
 */
@WebServlet("/sample2/board/detail")
public class Sample2BoardDetailServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
<<<<<<< HEAD
    
	private CommentService commentSerivce;
	
=======
       
>>>>>>> 9bcedfc860e708cf72e20978218325c3bf97aa45
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Sample2BoardDetailServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
<<<<<<< HEAD
    
    @Override
    public void init() throws ServletException {
    	super.init();
    	this.commentSerivce = new CommentService();
    	
    }
=======
>>>>>>> 9bcedfc860e708cf72e20978218325c3bf97aa45

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("id");
		
		if (id == null) {
			String path = request.getContextPath() + "/sample2/board/list";
			response.sendRedirect(path);
		} else {
			BoardDao dao = new BoardDao();
<<<<<<< HEAD
//			Board board = dao.get(Integer.parseInt(id));
			BoardDto board = dao.get2(Integer.parseInt(id));
			
			List<Comment> commentList = commentSerivce.list(Integer.parseInt(id));
			request.setAttribute("board", board);
			request.setAttribute("comments", commentList);
=======
			Board board = dao.get(Integer.parseInt(id));
			
			request.setAttribute("board", board);
>>>>>>> 9bcedfc860e708cf72e20978218325c3bf97aa45
			
			String path = "/WEB-INF/sample2/board/detail.jsp";
			request.getRequestDispatcher(path).forward(request, response);
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

<<<<<<< HEAD
}
=======
}
>>>>>>> 9bcedfc860e708cf72e20978218325c3bf97aa45
