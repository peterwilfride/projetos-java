package prova.pratica.numeroMaximo;

public class NumeroMaximo {
    public int numeroMaximo(int[] lista) {
        int nmax = lista[0];

        for(int i=0; i<lista.length; i++) {
            if (lista[i] > nmax) nmax = lista[i];
        }

        return nmax;
    }
}
