package board.dao;

import java.util.List;

import board.model.MemberVO;

public interface MemberDaoInf {
	
	/**
	 * 
	* Method : getMemberPageList
	* 최초작성일 : 2018. 5. 15.
	* 작성자 : "P.H.S"
	* 변경이력 :
	* @param page
	* @param pageSize
	* @return
	* Method 설명 : 회원 페이지 리스트 조회
	 */
	public List<MemberVO> getMemberPageList(int page, int pageSize);
	
	/**
	 * 
	* Method : getMemberTotalCnt
	* 최초작성일 : 2018. 5. 15.
	* 작성자 : "P.H.S"
	* 변경이력 :
	* @return
	* Method 설명 : 전체 회원 건수 조회
	 */
	public int getMemberTotalCnt();
	
	/**
	 * 
	* Method : getMember
	* 최초작성일 : 2018. 5. 15.
	* 작성자 : "P.H.S"
	* 변경이력 :
	* @param mem_id
	* @return
	* Method 설명 : 회원 상세정보 조회
	 */
	public MemberVO getMember(String mem_id);
			
	
	/**
	 * 
	* Method : loginProcess
	* 최초작성일 : 2018. 5. 16.
	* 작성자 : "P.H.S"
	* 변경이력 :
	* @param memberVO
	* @return
	* Method 설명 : 로그인
	 */
	public MemberVO loginProcess(MemberVO memberVO);
	

	
}
