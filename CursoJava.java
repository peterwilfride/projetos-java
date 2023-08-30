import java.util.ArrayList;

public class CursoJava {

    public static void main(String[] args) {
        ArrayList<String> carros = new ArrayList<>();

        carros.add("Polo");
        carros.add("Cruze");
        carros.add("Argo");

        throw new IllegalArgumentException("Erro");

        /*
        try {
            System.out.println(carros.get(5));
        } catch(IndexOutOfBoundsException e) {
            System.out.println("Erro: " + e.getMessage());
        }*/
    }
}
