package chess;

import board.Board;
import board.Pieces;

public abstract class ChessPiece extends Pieces {
	private Color color;

	public ChessPiece(Board board, Color color) {
		super(board);
		this.color = color;
	}

	public Color getColor() {
		return color;
	}
	
}
