import java.util.function.Predicate;

public class App {
    public static void main(String[] args) {
        Predicate<Integer> lessthan = x -> (x < 10);
        
        System.out.println(lessthan.test(20));
    }
}
