package AllFile.Service;

import AllFile.Model.Person;
import AllFile.Repository.EvidencerDAO;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class Evidencer implements PersonService {
   public EvidencerDAO repository;

    @Override
    public List<Person> findAllPersons() {
        return repository.findAllPersons();
    }

    @Override
    public Person createPerson(Person person) {
        return repository.createPerson(person);
    }

    @Override
    public Person findPersonByEmail(String email) {
        return repository.findPersonByEmail(email);
    }

    @Override
    public Person updatePerson(Person person) {
        return repository.updatePerson(person);
    }

    @Override
    public void deletePerson(String email) {
        repository.deletePerson(email);


    }



}