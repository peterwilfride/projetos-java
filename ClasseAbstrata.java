
abstract class Animal {
    //public abstract void fazerSom();
}

class Gato {
    public String fazerSom() {
        return "miau";
    }
}

public class ClasseAbstrata {
	public static void main(String[] arg) {
		System.out.println("Olá, mundo!");

        Gato gato = new Gato();
        System.out.println(gato.fazerSom());
	}
}

