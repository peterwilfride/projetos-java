package sistema.de.enfileiramento.entity;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import sistema.de.enfileiramento.enums.Position;
import sistema.de.enfileiramento.enums.TeamStatus;

public class Team {
    
    private UUID id;
    private Map<Player, Position> positions;
    private TeamStatus teamStatus;

    public Team() {
        this.id = UUID.randomUUID();
        this.positions = new HashMap<>();
        this.teamStatus = TeamStatus.INCOMPLETE;
    }

    public UUID getId() {
        return this.id;
    }

    public Map<Player, Position> getPositions() {
        return this.positions;
    }

    public boolean addToTeam(Player player) {

        if (this.isComplete()) {
            return false;
        }
        if (this.positions.containsKey(player)) {
            return false;
        }

        Position[] playerPrefs = player.gePositionsPermutation();

        // player tem 100% de preferencia
        if (player.hasPreference()){
            if (this.positions.containsValue(playerPrefs[0])) {
                // player retorna para o topo da fila
                return false;
            } else {
                positions.put(player, playerPrefs[0]);
                return true;
            }   
        }

        // player não tem 100% de preferencia
        for (int i = 0; i < player.gePositionsPermutation().length; i++) {
            if (!this.positions.containsValue(playerPrefs[i])) {
                this.positions.put(player, playerPrefs[i]);
                return true;
            }
        }
        return false;
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

    public String print() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.getId().toString() + "\n");
        for(Map.Entry<Player, Position> p : getPositions().entrySet()) {
            sb.append(p.getKey().getId() + " - " + p.getValue().toString() + "\n");
        }
        return sb.toString();
    }
}
