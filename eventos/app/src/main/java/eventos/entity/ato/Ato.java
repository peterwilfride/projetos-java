package eventos.entity.ato;

import eventos.entity.Setor;

public abstract class Ato {

    public abstract boolean processar(Setor setorIdGestor, Setor setorIdInter);

    public abstract String imprimir();
}
