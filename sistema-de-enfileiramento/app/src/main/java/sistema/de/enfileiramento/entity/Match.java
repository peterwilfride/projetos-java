package sistema.de.enfileiramento.entity;

import java.util.UUID;

public class Match {

    private UUID id;
    private Team _team1;
    private Team _team2;

    public Match() {
        this.id = UUID.randomUUID();
    }

    public void addTeam1(Team team) {
        this._team1 = team;
    }

    public void addTeam2(Team team) {
        this._team2 = team;
    }

    public boolean isClosed() {
        if (_team1.isComplete() && _team2.isComplete()) { 
            return true;
        }
        return false;
    }

    public String getId() {
        return this.id.toString();
    }

    @Override
    public String toString() {
        return 
            "--------------------------------------" +
            "\nid: " + this.getId() +
            "\nteam_1: " + this._team1.print() +
            "\nteam_2: " + this._team2.print() +
            "--------------------------------------";
    }   
}
