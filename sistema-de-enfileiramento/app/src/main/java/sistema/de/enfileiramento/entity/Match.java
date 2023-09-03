package sistema.de.enfileiramento.entity;

import java.util.List;
import java.util.UUID;

public class Match {

    private UUID id;
    private Team _team1;
    private Team _team2;
    private List<Player> team1;
    private List<Player> team2;

    // public Match() {
    //     this.id = UUID.randomUUID();
    //     this.team1 = new ArrayList<>(this.teamSize);
    //     this.team2 = new ArrayList<>(this.teamSize);
    // }

    public Match() {
        this.id = UUID.randomUUID();
    }

    public void addTeam1(Team team) {
        this._team1 = team;
    }

    public void addTeam2(Team team) {
        this._team2 = team;
    }

    // public void addTeam1(Player player) {
    //     if (!isTeam1Full()) {
    //         team1.add(player);
    //     }
    // }

    // public void addTeam2(Player player) {
    //     if (!isTeam2Full()) {
    //         team2.add(player);
    //     }
    // }

    // public boolean isTeam1Full() {
    //     if (team1.size() >= this.teamSize) return true;
    //     return false;
    // }
    
    // public boolean isTeam2Full() {
    //     if (team2.size() >= this.teamSize) return true;
    //     return false;
    // }

    public boolean isClosed() {
        if (_team1.isComplete() && _team2.isComplete()) { 
            //addToHistory();
            return true;
        }
        return false;
    }

    // private void addToHistory() {
    //     for (Player player : team1) {
    //         player.addToHistory(this);
    //     }
    //     for (Player player : team2) {
    //         player.addToHistory(this);
    //     }
    // }

    @Override
    public String toString() {
        return "id=" + id + 
               "\nteam1=[" + 
               team1.get(0).getId() + ", " + team1.get(1).getId() + ", " + team1.get(2).getId() + "]" +
               "\nteam2=[" + 
               team2.get(0).getId() + ", " + team2.get(1).getId() + ", " + team2.get(2).getId() + "]";
    }    
}
