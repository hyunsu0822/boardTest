package board.model;

import java.util.Date;

public class CommentVO {

	private int cmt_num;
	private int board_seq;
	private String cmt_ct;
	private Date cmt_dt;
	private String cmt_dl;
	private String mem_id;
	
	
	public CommentVO(){
		
	}
	
	public CommentVO(int cmt_num, int board_seq, String cmt_ct, Date cmt_dt,
			String cmt_dl, String mem_id) {
		super();
		this.cmt_num = cmt_num;
		this.board_seq = board_seq;
		this.cmt_ct = cmt_ct;
		this.cmt_dt = cmt_dt;
		this.cmt_dl = cmt_dl;
		this.mem_id = mem_id;
	}


	public int getCmt_num() {
		return cmt_num;
	}


	public void setCmt_num(int cmt_num) {
		this.cmt_num = cmt_num;
	}


	public int getBoard_seq() {
		return board_seq;
	}


	public void setBoard_seq(int board_seq) {
		this.board_seq = board_seq;
	}


	public String getCmt_ct() {
		return cmt_ct;
	}


	public void setCmt_ct(String cmt_ct) {
		this.cmt_ct = cmt_ct;
	}


	public Date getCmt_dt() {
		return cmt_dt;
	}


	public void setCmt_dt(Date cmt_dt) {
		this.cmt_dt = cmt_dt;
	}


	public String getCmt_dl() {
		return cmt_dl;
	}


	public void setCmt_dl(String cmt_dl) {
		this.cmt_dl = cmt_dl;
	}


	public String getMem_id() {
		return mem_id;
	}


	public void setMem_id(String mem_id) {
		this.mem_id = mem_id;
	}
	
	
}
