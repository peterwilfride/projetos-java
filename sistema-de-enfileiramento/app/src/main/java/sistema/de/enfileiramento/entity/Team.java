package sistema.de.enfileiramento.entity;

import java.util.HashMap;
import java.util.Map;

import sistema.de.enfileiramento.enums.Position;
import sistema.de.enfileiramento.enums.TeamStatus;

public class Team {
    
    private Map<Player, Position> positions;
    private TeamStatus teamStatus;

    public Team() {
        this.positions = new HashMap<>();
        this.teamStatus = TeamStatus.INCOMPLETE;
    }

    public Map<Player, Position> getPositions() {
        return this.positions;
    }

    public Object addToTeam(Player player) {

        if (this.isComplete()) {
            return "time cheio";
        }
        if (this.positions.containsKey(player)) {
            return "jogador já está na time";
        }

        Position[] playerPrefs = player.gePositionsPermutation();

        // player tem 100% de preferencia
        if (player.hasPreference()){
            if (this.positions.containsValue(playerPrefs[0])) {
                // player retorna para o topo da fila
                return "Posição já ocupada";
            } else {
                positions.put(player, playerPrefs[0]);
                return null;
            }   
        }

        // player não tem 100% de preferencia
        if (this.positions.containsValue(playerPrefs[0])) {
            if (this.positions.containsValue(playerPrefs[1])) {
                if (this.positions.containsValue(playerPrefs[2])) {
                    // player retorna para o topo da fila
                    return "Todas as posições preenchidas";
                } else {
                    positions.put(player, playerPrefs[2]);
                    return null;
                }   
            } else {
                positions.put(player, playerPrefs[1]);
                return null;
            }
        } else {
            positions.put(player, playerPrefs[0]);
            return null;
        }
    }

    public void removeFromTeam(Player player) {
        if (this.positions.containsKey(player)) {
            this.positions.remove(player);
        }
    }

    public boolean isComplete() {
        if (this.positions.size() == 3) {
            this.teamStatus = TeamStatus.COMPLETE;
            return true;
        }
        return false;
    }
}
