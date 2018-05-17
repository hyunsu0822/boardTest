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

	

	

	

	
	
}
