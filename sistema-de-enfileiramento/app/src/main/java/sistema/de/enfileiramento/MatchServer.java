package sistema.de.enfileiramento;

import java.io.FileWriter;
import java.io.IOException;

import sistema.de.enfileiramento.datasource.TeamQueueComplete;
import sistema.de.enfileiramento.entity.Match;
import sistema.de.enfileiramento.entity.Team;
import sistema.de.enfileiramento.service.TeamService;

public class MatchServer implements Runnable {

    private final TeamService teamService;

    public MatchServer(TeamService teamService) {
        this.teamService = teamService;
    }

    @Override
    public void run() {
        while (true) {

            // consume a lista de times
            // puxa o primeira time fechado da lista
            // puxa o segundo time fechado da lista
            // cria uma nova partida
            // adiciona os times na patida
            // notifica os integrantes das equipes
            try {
                if (TeamQueueComplete.getQueue().size() >= 2) {
                    Team[] teams = teamService.chooseTeams();

                    Match match = new Match();
    
                    match.addTeam1(teams[0]);
                    match.addTeam2(teams[1]);
                    
                    try {
                        appendToFile("matches.txt", match.toString());
                        System.out.println("partida adicionada");
                        System.out.flush();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }                    
                }   
            } catch (Exception e) {
                Thread.currentThread().interrupt();
            } finally {
                try {
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void appendToFile(String fileName, String content) throws IOException {
        FileWriter fileWriter = null;

        try {
            // Abre o arquivo em modo append (adicionar ao final)
            fileWriter = new FileWriter(fileName, true);

            // Escreve a string no arquivo
            fileWriter.write(content + System.lineSeparator());
        } finally {
            // Certifica-se de fechar o arquivo, independentemente do que aconteça
            if (fileWriter != null) {
                fileWriter.close();
            }
        }
    }
    
}
