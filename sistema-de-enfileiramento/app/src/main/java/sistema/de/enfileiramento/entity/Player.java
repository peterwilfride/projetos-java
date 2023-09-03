package sistema.de.enfileiramento.entity;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import sistema.de.enfileiramento.enums.Position;

public class Player {
    
    private String id;
    private Boolean isOnline;
    private Boolean isInQueue;
    private Map<Position, Float> positionPriority;
    private List<Match> matchHistory;
    private Position[] positionPermutation;
    private Double hasPreference;

    public Player(String id, Boolean isOnline) {
        this.id = id;
        this.isOnline = isOnline;
        this.positionPriority = buildPositionPriority();
        this.matchHistory = new ArrayList<>();
        this.positionPermutation = new Position[3];
        this.initPositionPermutation();
        this.hasPreference = 0.8;
    }

    public void initPositionPermutation() {
        this.positionPermutation[0] = Position.WARRIOR;
        this.positionPermutation[1] = Position.ARCHER;
        this.positionPermutation[2] = Position.MAGE;
    }

    public void changePositionPermutation(Position p1, Position p2, Position p3) {
        this.positionPermutation[0] = p1;
        this.positionPermutation[1] = p2;
        this.positionPermutation[2] = p3;
    }

    public Position[] gePositionsPermutation() {
        return this.positionPermutation;
    }

    public String printPositions() {
        return this.getId() + 
         " " + this.gePositionsPermutation()[0] + 
         " " + this.gePositionsPermutation()[1] + 
         " " + this.gePositionsPermutation()[2];
    }

    /*
     * se um jogador joga na posição que ele pede, ele perde 0.1 no valor de prioridade
     * para aquela posição
     */
    public void decreasePriority(Position position) {
        this.positionPriority.compute(position, (key,val) -> (val == 1.0f) ? 1.0f : val - 0.1f);
    }

    /*
     * se um jogador não joga na posição que ele pede, ele ganha 0.1 no valor de prioridade
     * para aquela posição
     */
    public void increasePriority(Position position) {
        this.positionPriority.compute(position, (key,val) -> (val == 1.0f) ? 1.0f : val + 0.1f);
    }

    private Map<Position, Float> buildPositionPriority() {
        Map<Position, Float> positionPriority = new HashMap<>();
        positionPriority.put(Position.WARRIOR, 0.8f);
        positionPriority.put(Position.MAGE, 1.0f);
        positionPriority.put(Position.ARCHER, 0.9f);
        return positionPriority;
    }

    public void addToHistory(Match match) {
        matchHistory.add(match);
    }

    public String getId() {
        return id;
    }

    public Double getHasPreference() {
        return hasPreference;
    }

    public void setHasPreference(Double hasPreference) {
        this.hasPreference = hasPreference;
    }

    public boolean hasPreference() {
        return this.hasPreference == 1.0;
    }

    public void increasePreference() {
        if (this.hasPreference > 0.95) {
            this.hasPreference = 1.0;
        }
        this.hasPreference += 0.5;
    }

    public void decreasePreference() {
        this.hasPreference -= 0.5;
    }

    public void enterQueue() {
        this.isInQueue = true;
    }

    public void getOutQueue() {
        this.isInQueue = false;
    }
}
