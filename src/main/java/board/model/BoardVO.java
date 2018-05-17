package board.model;

import java.util.Date;

public class BoardVO {

	private int board_seq;
	private int pboard_seq;
	private int category_seq;
	private int group_seq;
	private String title;
	private String content;
	private String reg_id;
	private String del_yn;
	private Date reg_dt;
	
	public BoardVO(){
		
	}
	
	public int getboard_seq() {
		return board_seq;
	}
	public void setboard_seq(int board_seq) {
		this.board_seq = board_seq;
	}
	public int getpboard_seq() {
		return pboard_seq;
	}
	public void setpboard_seq(int pboard_seq) {
		this.pboard_seq = pboard_seq;
	}
	public int getcategory_seq() {
		return category_seq;
	}
	public void setcategory_seq(int category_seq) {
		this.category_seq = category_seq;
	}
	public int getgroup_seq() {
		return group_seq;
	}
	public void setgroup_seq(int group_seq) {
		this.group_seq = group_seq;
	}
	public Date getReg_dt() {
		return reg_dt;
	}
	public void setReg_dt(Date reg_dt) {
		this.reg_dt = reg_dt;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getReg_id() {
		return reg_id;
	}
	public void setReg_id(String reg_id) {
		this.reg_id = reg_id;
	}
	public String getDel_yn() {
		return del_yn;
	}
	public void setDel_yn(String del_yn) {
		this.del_yn = del_yn;
	}
	
	
}
