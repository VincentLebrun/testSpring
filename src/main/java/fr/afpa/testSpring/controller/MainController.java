

package fr.afpa.testSpring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
//important pour spring toujours indiquer ce que le composant fait
public class MainController {

    /**
     * Controller de la page d'accueil
     * AFFICHE INDEX.jsp
     */
    @GetMapping("/")
    public String Home(Model model) {


        return "index";
    }

    @GetMapping("/contact")
    public String Contact() {
        return "contact";
    }


    @GetMapping("/person")
    public String personne(Model model) {

        return "person";
    }


}
