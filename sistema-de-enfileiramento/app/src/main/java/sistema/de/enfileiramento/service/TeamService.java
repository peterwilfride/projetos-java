package sistema.de.enfileiramento.service;

import sistema.de.enfileiramento.datasource.TeamQueueComplete;
import sistema.de.enfileiramento.entity.Team;

public class TeamService {
    
    public Team choose() {
        return TeamQueueComplete.getQueue().removeFirst();
    }

    public Team[] chooseTeams() {
        Team[] teams = {choose(), choose()};
        return teams;
    }
}
