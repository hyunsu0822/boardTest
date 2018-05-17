package board.model;

import java.util.Date;

public class NoticeVO {

	private int category_seq;
	private String ntc_name;
	private String mem_id;
	private String atv_yn;
	private Date ntc_dt;

	
	public NoticeVO(){
		
	}
	
	public NoticeVO(int category_seq, String ntc_name, String mem_id, String atv_yn, Date ntc_dt){
		this.category_seq = category_seq;
		this.ntc_name = ntc_name;
		this.mem_id = mem_id;
		this.atv_yn = atv_yn;
		this.ntc_dt = ntc_dt;
	}
	
	
	public int getCategory_seq() {
		return category_seq;
	}
	public void setCategory_seq(int category_seq) {
		this.category_seq = category_seq;
	}
	public String getNtc_name() {
		return ntc_name;
	}
	public void setNtc_name(String ntc_name) {
		this.ntc_name = ntc_name;
	}
	public String getMem_id() {
		return mem_id;
	}
	public void setMem_id(String mem_id) {
		this.mem_id = mem_id;
	}
	public String getAtv_yn() {
		return atv_yn;
	}
	public void setAtv_yn(String atv_yn) {
		this.atv_yn = atv_yn;
	}
	public Date getNtc_dt() {
		return ntc_dt;
	}
	public void setNtc_dt(Date ntc_dt) {
		this.ntc_dt = ntc_dt;
	}
	
	
}
