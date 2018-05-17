package board.dao;

import java.util.List;

import board.model.NoticeVO;

public interface NoticeDaoInf {
	
	/**
	 * 
	* Method : getNoticeList
	* 최초작성일 : 2018. 5. 16.
	* 작성자 : "P.H.S"
	* 변경이력 :
	* @return
	* Method 설명 : 게시판 조회 리스트
	 */
	public List<NoticeVO> getNoticeList();
	
	/**
	 * 
	* Method : insertNotice
	* 최초작성일 : 2018. 5. 16.
	* 작성자 : "P.H.S"
	* 변경이력 :
	* @param NoticeVO
	* @return
	* Method 설명 : 게시판 신규 생성
	 */
	public int insertNotice(NoticeVO NoticeVO);
	
	/**
	 * 
	* Method : modifyNotice
	* 최초작성일 : 2018. 5. 16.
	* 작성자 : "P.H.S"
	* 변경이력 :
	* @param NoticeVO
	* @return
	* Method 설명 : 게시판 수정
	 */
	public int modifyNotice(NoticeVO NoticeVO);
	

	
}
