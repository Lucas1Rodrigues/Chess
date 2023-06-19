package board;

public class Pieces {
	protected Position position;
	private Board board;
	
	public Pieces(Board board) {
		this.board = board;
		this.position = null;
	}

	protected Board getBoard() {
		return board;
	}
	
	

}
