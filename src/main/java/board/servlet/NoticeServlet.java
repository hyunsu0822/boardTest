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
@WebServlet("/noticeServlet")
public class NoticeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public NoticeServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=utf-8");
		
		NoticeServiceInf service = new NoticeService();
		List<NoticeVO> noticeList = service.getNoticeList();
		
		/*List<NoticeVO> noticeList = new ArrayList<NoticeVO>();
		noticeList.add(new NoticeVO(1, "첫번째 제목입니다.", "브라운", "Y", new Date()));
		noticeList.add(new NoticeVO(2, "두번째 제목입니다.", "보미", "Y", new Date()));
		noticeList.add(new NoticeVO(3, "세번째 제목입니다.", "샐리", "Y", new Date()));
		noticeList.add(new NoticeVO(4, "네번째 제목입니다.", "라이언", "Y", new Date()));
		noticeList.add(new NoticeVO(5, "다섯번째 제목입니다.", "어피치", "Y", new Date()));*/
		
		request.setAttribute("noticeList", noticeList);
		
		RequestDispatcher rd = request.getRequestDispatcher("notice/noticeList.jsp");
		rd.forward(request, response);
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}
