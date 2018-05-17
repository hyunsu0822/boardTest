package board.dao;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import board.model.NoticeVO;

public class NoticeDao implements NoticeDaoInf {

	private SqlSessionFactory sqlSessionFactory;
	
	public NoticeDao(){
		String resource = "db/mybatis/mybatis-config.xml";
		InputStream inputStream = null;
		try {
			inputStream = Resources.getResourceAsStream(resource);
			sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		} catch (IOException e) {
			e.printStackTrace();
		}	
		
	}
	
	/**
	 * 
	* Method : getNoticeList
	* 최초작성일 : 2018. 5. 16.
	* 작성자 : "P.H.S"
	* 변경이력 :
	* @return
	* Method 설명 : 게시판 리스트 조회
	 */
	@Override
	public List<NoticeVO> getNoticeList() {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		List<NoticeVO> noticeList = sqlSession.selectList("notice.getNoticeList");
		sqlSession.close();
		return noticeList;
	}
	
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
	@Override
	public int insertNotice(NoticeVO NoticeVO) {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		int insertCnt = sqlSession.insert("notice.insertNotice", NoticeVO);
		
		sqlSession.commit();
		sqlSession.close();
		return insertCnt;
	}
	
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
	@Override
	public int modifyNotice(NoticeVO NoticeVO) {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		int modifyCnt = sqlSession.update("notice.modifyNotice", NoticeVO);
		
		sqlSession.commit();
		sqlSession.close();
		return modifyCnt;
	}
	
	
	

}
