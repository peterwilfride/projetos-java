package chess.system.java.chess;

import chess.system.java.boardgame.Board;
import chess.system.java.boardgame.Piece;
import chess.system.java.boardgame.Position;
import chess.system.java.chess.pieces.King;
import chess.system.java.chess.pieces.Rook;

public class ChessMatch {
    
    private Board board;

    public ChessMatch() {
        this.board = new Board(8, 8);
        this.initialSetup();
    }

    public ChessPiece[][] getPieces() {
        int rows = this.board.getRows();
        int columns = this.board.getColumns();
        ChessPiece[][] mat = new ChessPiece[rows][columns];
        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                mat[i][j] = (ChessPiece) this.board.piece(i, j);
            }
        }
        return mat;
    }

    public ChessPiece perfromChessMove(ChessPosition sourcePosition, ChessPosition targetPosition) {
        Position source = sourcePosition.toPosition();
        Position target = targetPosition.toPosition();
        validadeSourcePosition(source); 
        Piece capturedPiece = makeMove(source, target);
        return (ChessPiece)capturedPiece;    
    }
    
    private Piece makeMove(Position source, Position target) {
        Piece p = board.removePiece(source);
        Piece capturedPiece = board.removePiece(target);
        board.placePiece(p, target);
        return capturedPiece;
    }

    private void validadeSourcePosition(Position source) {
        if (!board.thereIsAPiece(source)) {
            throw new ChessException("Thre is no piece in source position.");  
        }
    }

    private void placeNewPiece(char column, int row, ChessPiece piece) {
        this.board.placePiece(piece, new ChessPosition(column, row).toPosition());
    }

    private void initialSetup() {
        placeNewPiece('c', 1, new Rook(board, Color.WHITE));
        placeNewPiece('c', 2, new Rook(board, Color.WHITE));
        placeNewPiece('d', 2, new Rook(board, Color.WHITE));
        placeNewPiece('e', 2, new Rook(board, Color.WHITE));
        placeNewPiece('e', 1, new Rook(board, Color.WHITE));
        placeNewPiece('d', 1, new King(board, Color.WHITE));
        
        placeNewPiece('c', 7, new Rook(board, Color.BLACK));
		placeNewPiece('e', 8, new Rook(board, Color.BLACK));
        placeNewPiece('c', 8, new Rook(board, Color.BLACK));
        placeNewPiece('d', 7, new Rook(board, Color.BLACK));
        placeNewPiece('e', 7, new Rook(board, Color.BLACK));
        placeNewPiece('d', 8, new King(board, Color.BLACK));
    } 
}
