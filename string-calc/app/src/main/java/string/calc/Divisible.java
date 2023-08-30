package string.calc;

import java.util.Arrays;

public class Divisible {
    
    public static boolean isDivisible(int... nums) {
        for (int i=1; i<nums.length; i++) {
            if (nums[0] % nums[i] != 0) return false;
        }

        Arrays.stream(nums).skip(1);

        return true;
    }
}
