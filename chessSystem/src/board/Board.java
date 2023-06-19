package board;

public class Board {
	private int rows;
	private int columns;
	private Pieces[][] pieces;
	
	
	public Board(int rows, int columns) {
		this.rows = rows;
		this.columns = columns;
		pieces = new Pieces[rows][columns];
	}


	public int getColumns() {
		return columns;
	}


	public void setColumns(int columns) {
		this.columns = columns;
	}


	public Pieces[][] getPieces() {
		return pieces;
	}


	public void setPieces(Pieces[][] pieces) {
		this.pieces = pieces;
	}
	
	

	
}
