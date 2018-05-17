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
	
	
}


