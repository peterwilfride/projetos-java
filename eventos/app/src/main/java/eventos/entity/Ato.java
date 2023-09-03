package eventos.entity;

public abstract class Ato {

    public abstract boolean processar(Setor setorIdGestor, Setor setorIdInter);

    public abstract String imprimir();
}
