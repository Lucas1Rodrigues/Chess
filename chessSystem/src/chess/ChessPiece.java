package chess;

import board.Board;
import board.Pieces;
import board.Position;

public abstract class ChessPiece extends Pieces {
	private Color color;

	public ChessPiece(Board board, Color color) {
		super(board);
		this.color = color;
	}

	public Color getColor() {
		return color;
	}
	public ChessPosition getChessPosition() {
		return ChessPosition.fromPosition(position);
	}
	protected boolean isThereOpponentPiece(Position position) {
		ChessPiece p = (ChessPiece)getBoard().pieces(position);
		return p != null && p.getColor() != color;
	}
}
