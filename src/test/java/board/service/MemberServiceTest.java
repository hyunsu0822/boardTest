package board.service;

import static org.junit.Assert.*;

import java.util.List;
import java.util.Map;

import org.junit.Test;

import board.dao.MemberDao;
import board.dao.MemberDaoInf;
import board.model.MemberVO;

public class MemberServiceTest {

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
		MemberServiceInf memberService = new MemberService();
		int page = 1;
		int pageSize = 10;
		
		/***When***/
		Map<String, Object> resultMap = memberService.getMemberPageList(page, pageSize);
		
		/***Then***/
		List<MemberVO> memberList = (List<MemberVO>)resultMap.get("memberList");
		
		assertNotNull(memberList);
		assertEquals(10, memberList.size());
		
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
		MemberServiceInf memberService = new MemberService();
		String mem_id = "a001";
		
		/***When***/
		MemberVO memberVO = memberService.getMember(mem_id);
		
		/***Then***/
		assertEquals(mem_id, memberVO.getMem_id());
		assertEquals("1111", memberVO.getMem_pass());
		assertEquals("김은대", memberVO.getMem_name());	
	}


}
