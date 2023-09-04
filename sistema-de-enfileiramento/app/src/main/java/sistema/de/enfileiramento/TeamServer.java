package sistema.de.enfileiramento;

import java.util.NoSuchElementException;

import sistema.de.enfileiramento.datasource.TeamQueueComplete;
import sistema.de.enfileiramento.datasource.TeamQueueImcomplete;
import sistema.de.enfileiramento.entity.Player;
import sistema.de.enfileiramento.entity.Team;
import sistema.de.enfileiramento.service.PlayerService;

public class TeamServer implements Runnable {

    private final PlayerService playerService;

    public TeamServer(PlayerService playerService) {
        this.playerService = playerService;
    }

    @Override
    public void run() {
        while (true) {
            try {
                // puxa player da fila de players e tenta
                Player player = playerService.choose();
    
                // se fila de times imcompletos for vazio, cria um novo time
                // e adiciona na fila de imcompletos
                if (TeamQueueImcomplete.getQueue().isEmpty()) {
                    Team team = new Team();
                    TeamQueueImcomplete.getQueue().add(team);
                }
                
                // puxa o proxima time imcompleto da fila de times e adiciona
                // o jogador nesse time
                Team team = TeamQueueImcomplete.getQueue().peekFirst();
                if (team.addToTeam(player)) {
                    playerService.returnQueue(player);
                }
    
                // se o time ficar completo remove da fila de imcompletos
                // e coloca na fila de completos
                if (team.isComplete()) {
                    TeamQueueImcomplete.getQueue().remove(team);
                    TeamQueueComplete.getQueue().addLast(team);
                }
            } catch(NoSuchElementException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
    
}
