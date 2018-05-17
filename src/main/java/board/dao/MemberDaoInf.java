package board.dao;

import java.util.List;

import board.model.MemberVO;

public interface MemberDaoInf {
	
	
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
