package board;

public abstract class Pieces {
	protected Position position;
	private Board board;
	
	public Pieces(Board board) {
		this.board = board;
		this.position = null;
	}

	protected Board getBoard() {
		return board;
	}
	
	public abstract boolean[][] possibleMoves();
	
	public boolean possibleMove() {
		return possibleMoves()[position.getRow()][position.getColumn()];
	}
	
	public boolean isTherePossibleMove() {
		boolean[][] mat = possibleMoves();
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat.length; j++) {
				if(mat[i][j]) {
					return true;
				}
			}
		}
		return false;
	}

}
