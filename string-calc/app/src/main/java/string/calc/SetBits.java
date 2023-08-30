package string.calc;

import java.util.Arrays;

public class SetBits {

    public long eliminateUnsetBits(String number) {
        long idx = 0;
        long res = 0;

        for (String ch : Arrays.stream(number.split("")).toList()) {
            if (ch.equals("1")) {
                res += Math.pow(2, idx);
                idx++;
            }
        }
        
        return res;
    }
    
}
