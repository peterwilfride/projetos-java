import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

class DoubleChar {
    public static void main(String[] args) {
        //System.out.println(doublechar("Hello World"));

        //System.out.println(billboard("pedro", 10));

        //System.out.println(consoantevalue("strength"));
        
        //System.out.println(arrayparity(new int[] {-3,1,2,3,-1,-4,-4,-2}));

        //System.out.println(numberfromstring("aa1bb2cc3dd"));

        System.out.println(triangular(-10));
    }

    public static long triangular(long n) {
        if (n <= 0) return 0;
        long sum = 0;
        for(long i=n; i>=1; i--) {
            sum += i;
        }
        return sum;
    }

    public static long numberfromstring(String value) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < value.length(); i++) {
            Character ch = value.charAt(i);
            if (Character.isDigit(ch)) {
                sb.append(ch);
            }
        }
        return Long.valueOf(sb.toString());
    }


    public static int arrayparity(int[] arr) {
        List<Integer> arrList = new ArrayList<>(Arrays.stream(arr).boxed().toList());

        for (int i=0; i<arrList.size(); i++) {
            Integer num = arrList.get(i);
            if (arrList.contains(-num)) {
                arrList.remove(num);
                Optional<Integer> k = arrList.stream().filter(n -> n == -num).findFirst();
                arrList.remove(k.get());
                i--;
            }
        }

        return arrList.get(0);
    }

    public static int consoantevalue(String s) {
        
        String[] susb = s.split("[aeiou]");

        Integer[] values = {};

        int sum = 0;

        for (String string : susb) {
            if (string.isEmpty()) continue;
            for(int i=0; i<string.length(); i++) {
                char ch = string.charAt(i);
                int int_ch = map(ch);
                sum += int_ch;
            }
            values = addElement(values, sum);
            sum = 0;
        };
        return maxElement(values);
    }

    public static Integer[] addElement(Integer[] srcArray, int elementToAdd) {
        Integer[] destArray = new Integer[srcArray.length+1];
        for(int i=0; i<srcArray.length; i++) {
            destArray[i] = srcArray[i];
        }
        destArray[destArray.length - 1] = elementToAdd;
        return destArray;
    }

    public static int maxElement(Integer[] srcArray) {
        int max = srcArray[0];
        for(int i=0; i<srcArray.length; i++) {
            if (srcArray[i] > max) {
                max = srcArray[i];
            }
        }
        return max;
    }

    public static int map(char ch) {
        return "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
        .toLowerCase()
        .indexOf(ch) + 1;
    }

    public static int billboard(String name, int price) {
        int length = name.length();
        return Math.multiplyExact(price, length);
    }

    public static int billboard(String name) {
        int length = name.length();
        return Math.multiplyExact(30, length);
    }

    public static String doublechar(String s) {
        // StringBuilder sb = new StringBuilder();
        // for(int i=0; i<s.length(); i++) {
        //     System.out.println(s.charAt(i));
        //     sb.append(s.charAt(i));
        //     sb.append(s.charAt(i));
        // }
        // return sb.toString();

        return s.replaceAll(".", "$0$0");
    }
}