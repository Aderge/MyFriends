package AllFile.Controllers;

import AllFile.Model.Person;

import AllFile.Service.PersonService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/api/v27/person")
@AllArgsConstructor
public class PersonController {
    @Autowired
    private final PersonService service;
@GetMapping
    public List<Person> findAllPersons() {
        return service.findAllPersons();

    }
    @PostMapping("create_person")
    public String createPerson(@RequestBody Person person) {
        service.createPerson(person);
        return "Informace se podarilo ulozit";
    }
@GetMapping("/{email}")
    public Person findPersonByEmail(@PathVariable String email) {
        return service.findPersonByEmail(email);
    }
@PutMapping("update_person")
    public Person updatePerson(@RequestBody Person person) {
        return service.updatePerson(person);
    }

@DeleteMapping("delete_person/{email}")
    public void deletePerson(@PathVariable String email) {
        service.deletePerson(email);

    }
}
