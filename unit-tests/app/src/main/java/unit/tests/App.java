/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package unit.tests;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import com.sun.net.httpserver.*;

public class App {

    public static void main(String[] args)throws IOException {
        int serverPort = 8080;
        String contextPath = "/api/hello";

        HttpServer server = HttpServer.create(new InetSocketAddress(serverPort), 0);

        HttpContext context = server.createContext(contextPath, (exchange -> {
            if ("GET".equals(exchange.getRequestMethod())) {
                String params = exchange.getRequestURI().getRawQuery();
                String[] paramsArray = params.split("&"); 
                
                for (String value : paramsArray) {
                    System.out.println(value);
                }

                String respText = "Hello!";
                exchange.sendResponseHeaders(200, respText.getBytes().length);
                OutputStream output = exchange.getResponseBody();
                output.write(respText.getBytes());
                output.flush();
            } else {
                exchange.sendResponseHeaders(405, -1);// 405 Method Not Allowed
            }
            exchange.close();
        }));
        context.setAuthenticator(new BasicAuthenticator() {
            
        });
            

        server.setExecutor(null); // creates a default executor
        System.out.println("Iniciando server na port " + serverPort);
        System.out.println("context path: " + contextPath);
        server.start();
    }

    // public static Map<String, List<String>> splitQuery(String query) {
    //     if (query == null || "".equals(query)) {
    //         return Collections.emptyMap();
    //     }

    //     return Pattern.compile("&").splitAsStream(query)
    //         .map(s -> Arrays.copyOf(s.split("="), 2))
    //         .collect(groupingBy(s -> decode(s[0]), mapping(s -> decode(s[1]), toList())));
    // }
}