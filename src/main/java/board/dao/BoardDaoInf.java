package board.dao;

import java.util.List;

import board.model.BoardVO;

public interface BoardDaoInf {

	
	/**
	 * 
	* Method : getBoardList
	* 최초작성일 : 2018. 5. 16.
	* 작성자 : "P.H.S"
	* 변경이력 :
	* @return
	* Method 설명 :
	 */
	public List<BoardVO> getBoardList();
	
	
	/**
	 * 
	* Method : insertBoard
	* 최초작성일 : 2018. 5. 16.
	* 작성자 : "P.H.S"
	* 변경이력 :
	* @param boardVO
	* @return
	* Method 설명 :
	 */
	public int insertBoard(BoardVO boardVO);
	
	/**
	 * 
	* Method : modifyNotice
	* 최초작성일 : 2018. 5. 16.
	* 작성자 : "P.H.S"
	* 변경이력 :
	* @param boardVO
	* @return
	* Method 설명 :
	 */
	public int modifyNotice(BoardVO boardVO);
	
	
	
	
}
