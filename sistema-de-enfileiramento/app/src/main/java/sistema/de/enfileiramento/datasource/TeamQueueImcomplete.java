package sistema.de.enfileiramento.datasource;

import java.util.ArrayDeque;
import java.util.Deque;

import sistema.de.enfileiramento.entity.Team;

public class TeamQueueImcomplete {
        private static Deque<Team> teams;
    
    public static Deque<Team> getQueue() {
        if (teams == null) {
            teams = new ArrayDeque<>();
        }
        return teams;
    }
}
