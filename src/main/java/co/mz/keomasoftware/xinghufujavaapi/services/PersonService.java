package co.mz.keomasoftware.xinghufujavaapi.services;

import co.mz.keomasoftware.xinghufujavaapi.entities.Person;
import co.mz.keomasoftware.xinghufujavaapi.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {

    @Autowired
    private PersonRepository personRepository;

    public List<Person> getPeople(){
        return personRepository.findAll();
    }

    public void savePerson(Person person){
        personRepository.save(person);
    }

    public Person getPerson(long id){
        return personRepository.findById(id).get();
    }

    public void deletePerson(long id){
        personRepository.deleteById(id);
    }

}
