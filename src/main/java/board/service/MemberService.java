package board.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import board.dao.MemberDao;
import board.dao.MemberDaoInf;
import board.model.MemberVO;

public class MemberService implements MemberServiceInf {

	private MemberDaoInf memberDao;
	
	private List<MemberVO> memberList;
	
	public MemberService(){
		memberDao = new MemberDao();
		
		memberList = new ArrayList<MemberVO>();
		
	}
	
	@Override
	public MemberVO loginProcess(MemberVO memberVO) { 
		return memberDao.loginProcess(memberVO);
	}

	@Override
	public Map<String, Object> getMemberPageList(int page, int pageSize) {
		Map<String, Object> resultMap = new HashMap<String, Object>();
		
		List<MemberVO> memberList = memberDao.getMemberPageList(page, pageSize);
		String pageNav = makePageNav(page, memberDao.getMemberTotalCnt());
		
		resultMap.put("memberList", memberList);
		resultMap.put("pageNav", pageNav);
		
		return resultMap;
	}

	private String makePageNav(int page, int memberTotalCnt) {
		
		int pageTotalCnt = (int)Math.ceil( (double)memberTotalCnt / 10);
		
		StringBuffer pageNav = new StringBuffer();
		pageNav.append("<nav>");
		pageNav.append("	<ul class=\"pagination\">");
		pageNav.append("		<li>");
		pageNav.append("			<a href=\"getMemberPageList?page=1&pageSize=10\" aria-label=\"Previous\">");
		pageNav.append("				<span aria-hidden=\"true\">&laquo;</span>");
		pageNav.append("			</a>");
		pageNav.append("		</li>");

		
		for(int i = 1; i <= pageTotalCnt; i++){
			if( i == page)
				pageNav.append("		<li class=\"active\"><a href=\"getMemberPageList?page=" + i + "&pageSize=10\">" + i + "</a></li>");
			else
				pageNav.append("		<li ><a href=\"getMemberPageList?page=" + i + "&pageSize=10\">" + i + "</a></li>");
		}
		
		pageNav.append("		<li>");
		pageNav.append("			<a href=\"getMemberPageList?page=" + pageTotalCnt + "&pageSize=10\" aria-label=\"Next\">");
		pageNav.append("				<span aria-hidden=\"true\">&raquo;</span>");
		pageNav.append("			</a>");
		pageNav.append("		</li>");
		pageNav.append("	</ul>");
		pageNav.append("</nav>");
		    
		return pageNav.toString();

		
	}

	@Override
	public MemberVO getMember(String mem_id) {
		
		return memberDao.getMember(mem_id);
	}

	

	

	
	
}
