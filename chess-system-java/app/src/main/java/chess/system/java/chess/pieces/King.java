package chess.system.java.chess.pieces;

import chess.system.java.boardgame.Board;
import chess.system.java.chess.ChessPiece;
import chess.system.java.chess.Color;

public class King extends ChessPiece {
    
    public King(Board board, Color color) {
        super(board, color);
    }

    @Override
    public String toString() {
        return "K";
    }    
}
