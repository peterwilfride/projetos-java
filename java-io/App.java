import java.io.FileInputStream;
import java.io.FileOutputStream;

public class App {

    public static void main(String[] args) {
        try {
            FileOutputStream fout = new FileOutputStream("teste.txt");
            fout.write(65);
            fout.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            FileOutputStream fout = new FileOutputStream("teste2.txt");
            String texto = "testando 1,2,3...";
            byte[] b = texto.getBytes();
            fout.write(b);
            fout.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            FileInputStream fin = new FileInputStream("teste2.txt");
            int i = fin.read();
            System.out.println(i);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}