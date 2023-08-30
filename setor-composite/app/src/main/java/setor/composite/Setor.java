package setor.composite;

import java.util.ArrayList;
import java.util.List;

public class Setor {
    
    private Long id;
    private Setor setorSuperior;
    private String denomicacao;

    public Setor(Long id, Setor setorSuperior, String denomicacao) {
        this.id = id;
        this.setorSuperior = setorSuperior;
        this.denomicacao = denomicacao;
    }

    public Setor getSetorSuperior() {
        return setorSuperior;
    }

    public String getDenomicacao() {
        return denomicacao;
    }

    // @Override
    // public String toString() {
    //     List<String> setores = new ArrayList<>();
        
    //     Setor ss = this.setorSuperior;
    //     System.out.println(ss.setorSuperior);
    //     while(ss.setorSuperior != null) {
    //         setores.add(ss.getDenomicacao());
    //         ss = this.setorSuperior;
    //     }

    //     return String.join(" -> ", setores);
    // }
}
