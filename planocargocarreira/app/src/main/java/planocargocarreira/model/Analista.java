package planocargocarreira.model;

import java.util.ArrayList;
import java.util.List;

public class Analista implements IPlanoCarreira {

    private List<List<Cargo>> plano;

    public Analista() {
        List<Cargo> cargosNv1 = new ArrayList<>();
        cargosNv1.add(new Cargo("JR1", 2000.0));
        cargosNv1.add(new Cargo("JR2", 2500.0));
        cargosNv1.add(new Cargo("JR3", 3000.0));

        List<Cargo> cargosNv2 = new ArrayList<>();
        cargosNv2.add(new Cargo("PL1", 2800.0));
        cargosNv2.add(new Cargo("PL2", 3400.0));    
        cargosNv2.add(new Cargo("PL3", 4000.0));

        List<Cargo> cargosNv3 = new ArrayList<>();
        cargosNv3.add(new Cargo("SR1", 5500.0));
        cargosNv3.add(new Cargo("SR2", 7500.0));
        cargosNv3.add(new Cargo("SR3", 9500.0));

        this.plano = new ArrayList<>();
        this.plano.add(cargosNv1);
        this.plano.add(cargosNv2);
        this.plano.add(cargosNv3);
    }

    @Override
    public int[] promossao(int nivelPromossao, int nivelProgressao) {
        int horizontal = this.plano.get(nivelProgressao).size();
        int vertical = this.plano.size();
        
        int novoNivelPromossao = nivelPromossao;
        int novonivelProgressao = nivelProgressao;

        if (nivelPromossao < horizontal - 1) {
            novoNivelPromossao += 1;
            novonivelProgressao = nivelProgressao;
        } else {
            if (nivelProgressao < vertical - 1) {
                novoNivelPromossao = 0;
                novonivelProgressao += 1;
                Double baseSalarialAtual = this.getBaseSalarial(nivelPromossao, nivelProgressao);
                Double novaBaseSalarialAtual = this.getBaseSalarial(novoNivelPromossao, novonivelProgressao);
                while(novaBaseSalarialAtual < baseSalarialAtual) {
                    novoNivelPromossao += 1;
                    novaBaseSalarialAtual = this.getBaseSalarial(novoNivelPromossao, novonivelProgressao);
                }
            } else {
                novoNivelPromossao = nivelPromossao;
                novonivelProgressao = nivelProgressao;
            }
        }

        int[] res = {novoNivelPromossao, novonivelProgressao};
        return res;

        // if (nivelPromossao < horizontal - 1 && nivelProgressao < vertical - 1) {
        //     novoNivelPromossao += 1;
        //     novonivelProgressao = nivelProgressao;
        // }

        // if (nivelPromossao < horizontal - 1 && !(nivelProgressao < vertical - 1)) {
        //     novoNivelPromossao += 1;
        //     novonivelProgressao = nivelProgressao;
        // }

        // if (!(nivelPromossao < horizontal - 1) && nivelProgressao < vertical - 1) {
        //     novoNivelPromossao = 0;
        //     novonivelProgressao += 1;
        //     Double baseSalarialAtual = this.plano.get(nivelProgressao).get(nivelPromossao).getBaseSalarial();
        //     Double novaBaseSalarialAtual = this.plano.get(novonivelProgressao).get(novoNivelPromossao).getBaseSalarial();
        //     while(novaBaseSalarialAtual < baseSalarialAtual) {
        //         novoNivelPromossao += 1;
        //         novaBaseSalarialAtual = this.plano.get(novonivelProgressao).get(novoNivelPromossao).getBaseSalarial();
        //     }
        // }

        // if (!(nivelPromossao < horizontal - 1) && !(nivelProgressao < vertical - 1)) {
        //     novoNivelPromossao = nivelPromossao;
        //     novonivelProgressao = nivelProgressao;
        // }
    }

    @Override
    public int[] progressao(int nivelPromossao, int nivelProgressao) {
        int vertical = this.plano.size();
        
        int novoNivelPromossao = nivelPromossao;
        int novonivelProgressao = nivelProgressao;

        if (!(nivelProgressao < vertical - 1)) {
            novoNivelPromossao = nivelPromossao;
            novonivelProgressao = nivelProgressao;
        } else {
            novoNivelPromossao = 0;
            novonivelProgressao += 1;
            Double baseSalarialAtual = this.getBaseSalarial(nivelPromossao, nivelProgressao);
            Double novaBaseSalarialAtual = this.getBaseSalarial(novoNivelPromossao, novonivelProgressao);
            while(novaBaseSalarialAtual < baseSalarialAtual) {
                novoNivelPromossao += 1;
                novaBaseSalarialAtual = this.getBaseSalarial(novoNivelPromossao, novonivelProgressao);
            }
        }

        int[] res = {novoNivelPromossao, novonivelProgressao};
        return res;

        // if (nivelPromossao < horizontal - 1 && nivelProgressao < vertical - 1) {
        //     novoNivelPromossao = 0;
        //     novonivelProgressao += 1;
        //     Double baseSalarialAtual = this.plano.get(nivelProgressao).get(nivelPromossao).getBaseSalarial();
        //     Double novaBaseSalarialAtual = this.plano.get(novonivelProgressao).get(novoNivelPromossao).getBaseSalarial();
        //     while(novaBaseSalarialAtual < baseSalarialAtual) {
        //         novoNivelPromossao += 1;
        //         novaBaseSalarialAtual = this.plano.get(novonivelProgressao).get(novoNivelPromossao).getBaseSalarial();
        //     }
        // }

        // if (nivelPromossao < horizontal - 1 && !(nivelProgressao < vertical - 1)) {
        //     novoNivelPromossao = nivelPromossao;
        //     novonivelProgressao = nivelProgressao;
        // }

        // if (!(nivelPromossao < horizontal - 1) && nivelProgressao < vertical - 1) {
        //     novoNivelPromossao = 0;
        //     novonivelProgressao += 1;
        //     Double baseSalarialAtual = this.plano.get(nivelProgressao).get(nivelPromossao).getBaseSalarial();
        //     Double novaBaseSalarialAtual = this.plano.get(novonivelProgressao).get(novoNivelPromossao).getBaseSalarial();
        //     while(novaBaseSalarialAtual < baseSalarialAtual) {
        //         novoNivelPromossao += 1;
        //         novaBaseSalarialAtual = this.plano.get(novonivelProgressao).get(novoNivelPromossao).getBaseSalarial();
        //     }
        // }

        // if (!(nivelPromossao < horizontal - 1) && !(nivelProgressao < vertical - 1)) {
        //     novoNivelPromossao = nivelPromossao;
        //     novonivelProgressao = nivelProgressao;
        // }
    }

    @Override
    public List<List<Cargo>> getPlano() {
        return this.plano;
    }

    private Double getBaseSalarial(int nivelPromossao, int nivelProgressao) {
        return this.plano.get(nivelProgressao).get(nivelPromossao).getBaseSalarial();
    }
}
