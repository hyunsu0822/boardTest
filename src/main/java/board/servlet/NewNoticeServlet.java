package board.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import board.model.NoticeVO;
import board.service.NoticeService;
import board.service.NoticeServiceInf;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/newnoticeServlet")
public class NewNoticeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public NewNoticeServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=utf-8");
		
		NoticeServiceInf service = new NoticeService();
				
		NoticeVO notice = new NoticeVO();
		notice.setCategory_seq(Integer.parseInt(request.getParameter("category_seq")));
		notice.setNtc_name(request.getParameter("ntc_name"));
		notice.setMem_id(request.getParameter("mem_id"));
		
		int result = service.insertNotice(notice);
		
		if(result == 0){
			System.out.println("저장 실패하였습니다.");
		} else {		
			List<NoticeVO> noticeList = service.getNoticeList();
			request.setAttribute("noticeList", noticeList);
			
			RequestDispatcher rd = request.getRequestDispatcher("notice/noticeInsert.jsp");
			rd.forward(request, response);
		}
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}
