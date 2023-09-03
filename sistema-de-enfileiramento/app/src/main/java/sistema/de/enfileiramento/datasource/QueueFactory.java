package sistema.de.enfileiramento.datasource;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;

import sistema.de.enfileiramento.entity.Player;

public class QueueFactory {
    
    public static Queue<Player> queue;

    public static Deque<Player> deque;

    public static Deque<Player> getQueue() {
        if (deque == null) {
            deque = new ArrayDeque<>();
        }
        return deque;
    }
}
