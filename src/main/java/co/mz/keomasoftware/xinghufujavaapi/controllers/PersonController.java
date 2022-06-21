package co.mz.keomasoftware.xinghufujavaapi.controllers;

import co.mz.keomasoftware.xinghufujavaapi.entities.Person;
import co.mz.keomasoftware.xinghufujavaapi.services.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
public class PersonController {

    @Autowired
    private PersonService personService;

    @GetMapping("/people")
    public List<Person> getAllPeople(){
        return personService.getPeople();
    }

    @PostMapping("/person")
    public void addPerson(@RequestBody Person person){
        personService.savePerson(person);
    }

    @GetMapping("/person/{id}")
    public ResponseEntity<Person> getPerson(@PathVariable long id){
        try {
            Person person = personService.getPerson(id);
            return  new ResponseEntity<Person>(person, HttpStatus.OK);
        }catch (NoSuchElementException e){
            return new ResponseEntity<Person>(HttpStatus.NOT_FOUND);
        }
    }

    @PutMapping("/person/{id}")
    public ResponseEntity<?> updatePerson(@RequestBody Person person, @PathVariable long id){
        try {
            Person existPerson = personService.getPerson(id);
            personService.savePerson(person);

            return new ResponseEntity<>(HttpStatus.OK);
        }catch (NoSuchElementException e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

    }

    @DeleteMapping("/person/{id}")
    public ResponseEntity<?> deletePerson(@PathVariable long id){
        try {
            personService.deletePerson(id);
            return new ResponseEntity<>(HttpStatus.OK);
        }catch (NoSuchElementException e){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

}
