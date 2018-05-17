package board.dao;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import board.model.MemberVO;

public class MemberDaoTest {

	/**
	 * 
	* Method : getMemberPageListTest
	* 최초작성일 : 2018. 5. 15.
	* 작성자 : "P.H.S"
	* 변경이력 :
	* Method 설명 : 회원 페이지 list 조회 테스트
	 */
	@Test
	public void getMemberPageListTest() {
		
		/***Given***/
		MemberDaoInf memberDao = new MemberDao();
		int page = 1;
		int pageSize = 10;
		
		/***When***/
		List<MemberVO> memberList = memberDao.getMemberPageList(page, pageSize);
		for(MemberVO member : memberList)
			System.out.println(member);
		
		/***Then***/
		assertNotNull(memberList);
		assertEquals(10, memberList.size());
		
	}
	
	
	/**
	 * 
	* Method : getMemberTotalCntTest
	* 최초작성일 : 2018. 5. 15.
	* 작성자 : "P.H.S"
	* 변경이력 :
	* Method 설명 : 사용자 전체 건수조회
	 */
	@Test
	public void getMemberTotalCntTest(){
		
		/***Given***/
		MemberDaoInf memberDao = new MemberDao();
		
		/***When***/
		int memberTotalCnt = memberDao.getMemberTotalCnt();

		/***Then***/
		assertEquals(23, memberTotalCnt);
	}

	/**
	 * 
	* Method : getMemberTest
	* 최초작성일 : 2018. 5. 15.
	* 작성자 : "P.H.S"
	* 변경이력 :
	* Method 설명 : 회원 상세정보 조회 테스트
	 */
	@Test
	public void getMemberTest(){
		/***Given***/
		MemberDaoInf memberDao = new MemberDao();
		String mem_id = "a001";
		
		/***When***/
		MemberVO memberVO = memberDao.getMember(mem_id);
		
		/***Then***/
		assertEquals(mem_id, memberVO.getMem_id());
		assertEquals("1111", memberVO.getMem_pass());
		assertEquals("김은대", memberVO.getMem_name());	
	}

	
	
}
