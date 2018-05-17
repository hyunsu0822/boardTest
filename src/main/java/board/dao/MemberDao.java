package board.dao;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import board.model.MemberVO;

public class MemberDao implements MemberDaoInf {

	
	private static MemberDaoInf dao = new MemberDao();
	
	private SqlSessionFactory sqlSessionFactory;
	
	public MemberDao(){
		String resource = "db/mybatis/mybatis-config.xml";
		InputStream inputStream = null;
		try {
			inputStream = Resources.getResourceAsStream(resource);
			sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		} catch (IOException e) {
			e.printStackTrace();
		}	
		
	}
	
	public static MemberDaoInf getInstance(){
		return dao;
	}

	
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
	@Override
	public MemberVO loginProcess(MemberVO memberVO) {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		MemberVO memVO = sqlSession.selectOne("member.loginProcess", memberVO);
		
		sqlSession.close();
		
		return memVO;
	}

	@Override
	public List<MemberVO> getMemberPageList(int page, int pageSize) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getMemberTotalCnt() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public MemberVO getMember(String mem_id) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
}
