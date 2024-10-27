package AllFile.Service;

import AllFile.Model.Person;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface PersonService {
 List<Person> findAllPersons();
 Person createPerson(Person person);
 Person findPersonByEmail(String email);
 Person updatePerson(Person person);
void  deletePerson(String email);



}
