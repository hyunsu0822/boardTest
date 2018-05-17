package board.service;

import java.util.Map;

import board.model.MemberVO;

public interface MemberServiceInf {

	/** 
	 * Method   : loginProcess
	 * 최초작성일  : 2018. 5. 14. 
	 * 작성자 : "P.H.S"
	 * 변경이력 : 
	 * @param memberVO
	 * @return 
	 * Method 설명 : 로그인 프로세스
	 */
	public MemberVO loginProcess(MemberVO memberVO);
	
	/** 
	 * Method   : getMemberPageList
	 * 최초작성일  : 2018. 5. 14. 
	 * 작성자 : "P.H.S"
	 * 변경이력 : 
	 * @param page
	 * @param pageSize
	 * @return 
	 * Method 설명 : 회원 페이지 list 조회
	 */
	
	public Map<String, Object> getMemberPageList(int page, int pageSize);

	/** 
	 * Method   : getMember
	 * 최초작성일  : 2018. 5. 14. 
	 * 작성자 : "P.H.S"
	 * 변경이력 : 
	 * @param mem_id
	 * @return 
	 * Method 설명 : 회원 상세정보 조회 
	 */
	
	public MemberVO getMember(String mem_id);
	
	
	
}


