package local.hello;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KersonController {

  
  @GetMapping("/Kerson")
  public List<Kerson> getAllPersons(){
    //Returns hardcoded data, a real world application would return from the database
    List<Kerson> personList = new ArrayList<Kerson>();
    personList.add(new Kerson(1,"Mickey Mouse", 30));
    personList.add(new Kerson(2,"Donald Duck", 35));
    personList.add(new Kerson(3,"Peppa Pig", 15));
    return personList;
  } 
  
  @GetMapping("/Kerson/{personId}")
  public Kerson getPersonWithId(@PathVariable Integer personId){
    //Returns hardcoded data, a real world application would return from the database
    return new Kerson(3,"Peppa Pig", 15);
  } 
  
  
  @PostMapping("/Kerson/newperson")
  public void addPerson(@RequestBody Kerson person){
    System.out.println("Saving person information");
    
  }

}