package fr.afpa.testSpring.repository;
//Import du model
import fr.afpa.testSpring.model.Person;
//import des outils
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long> {
    @Query(nativeQuery = true , value = "SELECT * FROM person ")
   public List<Person>findAll();

    @Query(nativeQuery = true, value = "SELECT * FROM person WHERE email LIKE '%gmail%'")
    public  List<Person> findAllGmailPerson();

}
