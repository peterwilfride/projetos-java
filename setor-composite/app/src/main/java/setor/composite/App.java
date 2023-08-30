/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package setor.composite;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {

        Setor setor1 = new Setor(1L, null, "Gabinete dos Governadores");
        Setor setor2 = new Setor(2L, null, "Plenário");
        Setor setor3 = new Setor(3L, null, "Comissões Permanentes");
        Setor setor4 = new Setor(4L, setor2, "Mesa Diretora");
        Setor setor5 = new Setor(5L, setor4, "Presidência");
        Setor setor6 = new Setor(6L, setor5, "Secretaria");
        Setor setor7 = new Setor(7L, setor5, "Chefia do Controle Interno");
        Setor setor8 = new Setor(8L, setor5, "Chefia do Almoxarifado");
        Setor setor9 = new Setor(9L, setor5, "Motorista");
        Setor setor0 = new Setor(0L, setor5, "Auxiliar de Serviços Gerais");

        imprimirHierarquiaSetores(setor1);
    }

    public static void imprimirHierarquiaSetores(Setor setor) {
        List<String> setores = new ArrayList<>();
        
        while(setor.getSetorSuperior() != null) {
            setores.add(setor.getDenomicacao());
            setor = setor.getSetorSuperior();
        }
        setores.add(setor.getDenomicacao());

        System.out.println(String.join(" -> ", setores));
    }
}
