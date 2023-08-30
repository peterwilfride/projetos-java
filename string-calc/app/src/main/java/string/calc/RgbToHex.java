package string.calc;

import java.util.HashMap;
import java.util.Map;

public class RgbToHex {
    public static String rgb(int r, int g, int b) {
        return convert(r)+convert(g)+convert(b);
    }

    public static String convert(int n) {
        if (n <= 0) return "00";
        if (n >= 255) return "FF";

        Map<Integer, Character> map = new HashMap<>();
        map.put(10, 'A');
        map.put(11, 'B');
        map.put(12, 'C');
        map.put(13, 'D');
        map.put(14, 'E');
        map.put(15, 'F');

        StringBuilder res = new StringBuilder();
        while(n > 0) {
            int r = n % 16;
            if (r >= 0 && r <= 9) res.insert(0, String.valueOf(r));
            else res.insert(0, map.get(r));
            n = n / 16;
        }
        if (res.length() == 1) res.insert(0, 0);
        return res.toString();
    }
}
