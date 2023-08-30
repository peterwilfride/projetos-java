package string.calc;

import java.util.Arrays;

public class StringCalculator {
    
    public int addDel(String numbers) {
        if (numbers.isEmpty()) return 0;
        if (numbers.length() == 1) return Integer.valueOf(numbers);
        
        String[] cmdsSplited = numbers.split("\n");
        char del = cmdsSplited[0].charAt(2);

        String[] numbersSplited = cmdsSplited[1].split(String.valueOf(del));

        return Arrays.stream(numbersSplited)
                    .mapToInt(Integer::parseInt)
                    .sum();
    }

    public int add(String numbers) {
        if (numbers.isEmpty()) return 0;
        if (numbers.length() == 1) return Integer.valueOf(numbers);
        return Arrays.stream(numbers.split(",")).mapToInt(Integer::parseInt).sum();
    }
}
