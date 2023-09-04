package sistema.de.enfileiramento.datasource;

import java.util.ArrayList;
import java.util.List;

import sistema.de.enfileiramento.entity.Match;

public class MatchList {
    
    private static List<Match> matches;

    public static List<Match> getMatches() {
        if (matches == null) {
            matches = new ArrayList<>();
        }
        return matches;
    }
}
