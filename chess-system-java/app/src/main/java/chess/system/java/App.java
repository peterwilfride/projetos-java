/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package chess.system.java;

import java.util.Scanner;

import chess.system.java.chess.ChessMatch;
import chess.system.java.chess.ChessPiece;
import chess.system.java.chess.ChessPosition;

public class App {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        ChessMatch chessMatch = new ChessMatch();
        
        while(true) {
            UI.printBoard(chessMatch.getPieces());
            System.out.println();
            
            System.out.print("Source: ");
            ChessPosition source = UI.readChessPosition(sc);

            System.out.print("Target: ");
            ChessPosition target = UI.readChessPosition(sc);

            ChessPiece capturedPiece = chessMatch.perfromChessMove(source, target); 
        }
    }
}
