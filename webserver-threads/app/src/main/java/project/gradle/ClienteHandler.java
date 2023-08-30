package project.gradle;

import java.net.*;
import java.io.*;

public class ClienteHandler implements Runnable {
    private Socket clienteSocket;

    public ClienteHandler(Socket clienteSocket) {
        this.clienteSocket = clienteSocket;
    }

    @Override
    public void run() {
        try {
            // Cria um objeto BufferedReader para ler a requisição do cliente
            BufferedReader input = new BufferedReader(new InputStreamReader(clienteSocket.getInputStream()));

            // Lê a primeira linha da requisição HTTP GET
            String requestLine = input.readLine();

            System.out.println("Requisição recebida: " + requestLine);

            // dalay
            Thread.sleep(5000);

            // Cria um objeto PrintWriter para enviar a resposta ao cliente
            PrintWriter output = new PrintWriter(clienteSocket.getOutputStream());

            // Envia a resposta HTTP para o cliente
            output.println("HTTP/1.1 200 OK");
            output.println("Content-Type: text/html");
            output.println("");
            output.println("<html><body><h1>Olá, mundo!</h1></body></html>");
            output.flush();

            // Fecha as conexões com o cliente
            output.close();
            input.close();
            clienteSocket.close();
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}
