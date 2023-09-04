package sistema.de.enfileiramento.datasource;

import java.util.ArrayDeque;
import java.util.Deque;

import sistema.de.enfileiramento.entity.Player;

public class PlayerQueue {

    public static Deque<Player> deque;

    public static Deque<Player> getQueue() {
        if (deque == null) {
            deque = new ArrayDeque<>();
        }
        return deque;
    }
}
