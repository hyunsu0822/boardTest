package board.model;

public class AttachmentVO {

	private int	atm_num;
	private int	board_seq;
	private String atm_route;
	
	
	public AttachmentVO(int atm_num, int board_seq, String atm_route) {
		super();
		this.atm_num = atm_num;
		this.board_seq = board_seq;
		this.atm_route = atm_route;
	}


	public int getAtm_num() {
		return atm_num;
	}


	public void setAtm_num(int atm_num) {
		this.atm_num = atm_num;
	}


	public int getBoard_seq() {
		return board_seq;
	}


	public void setBoard_seq(int board_seq) {
		this.board_seq = board_seq;
	}


	public String getAtm_route() {
		return atm_route;
	}


	public void setAtm_route(String atm_route) {
		this.atm_route = atm_route;
	}

	
	
}
