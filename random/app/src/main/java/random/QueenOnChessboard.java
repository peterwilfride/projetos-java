package random;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class QueenOnChessboard {
    public static List<String> availableMoves(String position) {
        
        /*
         * pos = A*
         * A1,A2,A3,A4,A5,A6,A7,A8
         * pos = *1
         * A1,B1,C1,D1,E1,F1,G1,H1
         * pos = D3
         * D3,C2  B1,E4,F5,G6,H7
         */

        List<String> res = new ArrayList<>();
        
        char p1 = position.charAt(0);
        char p2 = position.charAt(1);

        for (int i = 1; i <= 8; i++) {
            res.add(String.valueOf(p1) + String.valueOf(i));
        }

        for (int i = 0; i < 8; i++) {
            char ch = "ABCDEFGH".charAt(i);
            res.add(String.valueOf(ch) + String.valueOf(p2));
        }
        
        int k = Integer.valueOf(String.valueOf(p2));
        for (int i = k; i > 0; i--) {
            char ch1 = "ABCDEFGH".charAt(i);
            res.add(String.valueOf(ch1) + String.valueOf(i));
        }

        for (int j = k; j < 8; j++) {
            char ch1 = "ABCDEFGH".charAt(j);
            res.add(String.valueOf(ch1) + String.valueOf(j));
        }

        return res.stream().distinct().sorted().toList();
	}
}
