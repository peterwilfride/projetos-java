package string.calc;

import java.util.Arrays;
import java.util.List;

public class ArrayPrinter {

    public String printArray(Object[] array) {
        List<String> txt = Arrays.stream(array).map(x -> String.valueOf(x)).toList();
        return String.join(",", txt);
    }    
}
