package org.ddd.dddtest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.text.ParseException;

@SpringBootApplication
public class DddTestApplication {

    public static void main(String[] args) throws ParseException {
        ConfigurableApplicationContext ctx = SpringApplication.run(DddTestApplication.class, args);
        CreatePersonUseCase usecase = ctx.getBean(CreatePersonUseCase.class);
        PersonRepositoy repo = ctx.getBean(PersonRepositoy.class);

        Person person = new Person("Pedro");
        Post post1 = new Post("new day");
        Post post2 = new Post("celebrating!");

        person.add_post(post1);

        usecase.execute(person);

        person.add_post(post2);

        usecase.execute(person);

//        person.remove_post(post2);
//
//        usecase.execute(person);

        Person person1 = repo.findById(1).orElseThrow();
        person1.remove_post(post2);

        usecase.execute(person);
    }
}
