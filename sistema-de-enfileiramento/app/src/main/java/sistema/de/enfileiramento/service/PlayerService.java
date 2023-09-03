package sistema.de.enfileiramento.service;

import sistema.de.enfileiramento.datasource.QueueFactory;
import sistema.de.enfileiramento.entity.Player;

/*
* Fila = Deque
* entra na fila - add player ao fim da fila
* sair da fila - remover da player da fila
* escolher player - remover player do topo da fila
* devolver para fila - add player ao topo da fila
*/
public class PlayerService {
    
    public void enterQueue(Player player) {
        player.enterQueue();
        QueueFactory.getQueue().addLast(player);
    }

    public void returnQueue(Player player) {
        player.enterQueue();
        QueueFactory.getQueue().addFirst(player);
    }

    public void getOutQueue(Player player) {
        player.getOutQueue();
        QueueFactory.getQueue().remove(player);
    }

    public Player choose() {
        return QueueFactory.getQueue().removeFirst();
    }
}
