package co.mz.keomasoftware.xinghufujavaapi.controllers;

import co.mz.keomasoftware.xinghufujavaapi.entities.Person;
import co.mz.keomasoftware.xinghufujavaapi.services.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PersonController {

    @Autowired
    private PersonService personService;

    @GetMapping("/people")
    public List<Person> getAllPeople(){
        return personService.getPeople();
    }

}
