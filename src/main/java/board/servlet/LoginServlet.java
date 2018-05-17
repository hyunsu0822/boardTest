package board.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import board.model.MemberVO;
import board.service.MemberService;
import board.service.MemberServiceInf;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/loginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private MemberServiceInf service;
    
	public LoginServlet() {
        super();
        service = new MemberService();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=utf-8");
		
		//as-is
		//LoginServlet에서 mem_id, mem_pass 파라미터를 화면 응답으로 생성
		String mem_id = request.getParameter("mem_id");
		String mem_pass = request.getParameter("mem_pass"); 
		String remember = request.getParameter("remember");
		
		MemberVO member = new MemberVO();
		member.setMem_id(mem_id);
		member.setMem_pass(mem_pass);
		
		System.out.println("remember : " + remember);
		
		
		MemberVO loginResult = service.loginProcess(member);
		if(loginResult != null){
			
			request.setAttribute("mem_id", mem_id);
			
			HttpSession session = request.getSession();
			session.setAttribute("mem_id", mem_id);
			
			ServletContext sc = getServletContext();
			sc.setAttribute("mem_id", "APPLICATION");
			
			RequestDispatcher rd = request.getRequestDispatcher("main.jsp");
			rd.forward(request, response);
		}else{
			response.sendRedirect("login/login.jsp");
		}
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}
