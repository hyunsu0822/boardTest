package board.service;

import java.util.ArrayList;
import java.util.List;

import board.dao.NoticeDao;
import board.dao.NoticeDaoInf;
import board.model.NoticeVO;

public class NoticeService implements NoticeServiceInf {

	private NoticeDaoInf NoticeDao;
	
	private List<NoticeVO> NoticeList;
	
	public NoticeService(){
		NoticeDao = new NoticeDao();
		
		NoticeList = new ArrayList<NoticeVO>();
		
		
	}
	
	@Override
	public List<NoticeVO> getNoticeList() {
		return NoticeDao.getNoticeList();
	}

	@Override
	public int insertNotice(NoticeVO NoticeVO) {
		return NoticeDao.insertNotice(NoticeVO);
	}

	@Override
	public int modifyNotice(NoticeVO NoticeVO) {
		return NoticeDao.modifyNotice(NoticeVO);
	}

	

	
	
}
