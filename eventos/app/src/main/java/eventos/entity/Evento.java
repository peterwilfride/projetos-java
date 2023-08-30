package eventos.entity;

public abstract class Evento {
    abstract boolean processar(Setor setorIdGestor, Setor setorIdInter);
}
