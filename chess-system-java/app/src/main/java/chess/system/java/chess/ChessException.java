package chess.system.java.chess;

import chess.system.java.boardgame.BoardException;

public class ChessException extends BoardException {
     
    private static final long serialVersionUID = 1L;

    public ChessException(String msg) {
        super(msg);
    }
}
