package org.ddd.dddtest;

import org.springframework.stereotype.Service;

@Service
public class CreatePersonUseCase {

    private final PersonRepositoy repositoy;


    public CreatePersonUseCase(PersonRepositoy repositoy) {
        this.repositoy = repositoy;
    }

    public void execute(Person person) {
        this.repositoy.save(person);
    }
}
