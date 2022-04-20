

package fr.afpa.testSpring.service;

import fr.afpa.testSpring.model.Person;
import fr.afpa.testSpring.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {
    // Auto wired se lance automatiquement à vérifier sur la documentation pour plus de détaIl

    @Autowired
    private PersonRepository personRepository;

    public List <Person> getAllPerson(){
        return personRepository.findAll();
    }
    public List<Person> getAllMail(){
        return personRepository.findMail();
    }
}
