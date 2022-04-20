package fr.afpa.testSpring.controller;

import fr.afpa.testSpring.model.Person;
import fr.afpa.testSpring.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

//toujours préciser ce que la class va faire
@Controller
public class PersonCondroller {
     @Autowired
     private PersonService personService;
    @GetMapping("/info")
    public String Info(Model model) {
        // quand on lance la classe personne on affiche toute les personne de la bdd
        List<Person>  people = personService.getAllPerson();
        System.out.println(people);
        model.addAttribute("people" , people);

        return "info";
    }
    @GetMapping("/mail")
    public String Mail(Model model){
        List<Person> email = personService.getAllMail();
        model.addAttribute("email", email);
        System.out.println(email);
        return"mail";

    }

}
