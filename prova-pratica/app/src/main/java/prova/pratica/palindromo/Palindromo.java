package prova.pratica.palindromo;

public class Palindromo {
    
    public boolean ehPalindromo(String texto) {

        texto = texto.toLowerCase();

        texto = texto.replace(" ", "");

        StringBuilder sb = new StringBuilder(texto);
        
        String textoInvertido = sb.reverse().toString();

        if (texto.equals(textoInvertido)) {
            return true;
        }
    
        return false;
    } 
}
