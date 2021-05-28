package ch14;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class JDBC01Servlet
 */
@WebServlet("/JDBC01Servlet")
			//
public class JDBC01Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public JDBC01Servlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		executeJDBC();
		
		response.getWriter().print("<h1>jdbc01</h1>");
	}

	private void executeJDBC() {
		String sql = "SELECT CustomerName From Customets WHERE CustomerID = 1";
		
		//연결
		String url ="jdbc:mysql://3.35.141.156/test";
		String user = "root";
		String password = "wnddkdwjdqhcjfl1";
		Connection con = DriverManager.getConnection(url, user, password);
		
		//statement 생성
		Statement stmt = con.createStatement();
		//쿼리 실행, 결과를 리턴(resultSet)
		ResultSet re = stmt.executeQuery(sql);
		
		//결과 확인
		String name = rs.getString(1);
		System.out.println(name);
	}
	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
