/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package resources;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.List;
import java.util.Map;

import org.yaml.snakeyaml.Yaml;

public class App {

    public static void main(String[] args)  {
        // URL url = ClassLoader.getSystemClassLoader().getResource("file.txt");

        // if (url == null) {
        //     throw new IllegalArgumentException("file not found! ");
        // } else {
        //     System.out.println(url);

        //     File file = new File(url.toURI());

        //     System.out.println(file.getName());

        //     System.out.println(file.length());

        //     List<String> lines = Files.readAllLines(file.toPath(), StandardCharsets.UTF_8);
        //     lines.forEach(System.out::println);
        // }

        //URL url = ClassLoader.getSystemClassLoader().getResource("data.yml");
        //InputStream inputStream = new FileInputStream(new File(url.toURI()));

        InputStream inputStream = ClassLoader.getSystemResourceAsStream("data.yml");
        
        Yaml yaml = new Yaml();
        Map<String, Object> data = yaml.load(inputStream);
        System.out.println(data.get("id"));
        System.out.println(data.get("name"));
    }
}
