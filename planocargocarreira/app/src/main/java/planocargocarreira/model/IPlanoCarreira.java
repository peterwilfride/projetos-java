package planocargocarreira.model;

import java.util.List;

public interface IPlanoCarreira {
    
    public int[] promossao(int nivelPromossao, int nivelProgressao);

    public int[] progressao(int nivelPromossao, int nivelProgressao);

    public List<List<Cargo>> getPlano();
}
