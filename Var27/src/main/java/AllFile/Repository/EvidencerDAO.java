package AllFile.Repository;

import AllFile.Model.Person;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

@Repository
public class EvidencerDAO {
    private final List<Person> persons = new ArrayList<>();
    public List<Person> findAllPersons() {
        return persons;
    }

    public Person createPerson(Person person) {
        persons.add(person);
        return person;

    }

    public Person findPersonByEmail(String email) {
        return persons.stream()
                    .filter(element -> element.getEmail().equals(email))
                    .findFirst()
                    .orElse(null);
    }

    public Person updatePerson(Person person) {

        var studentIndex = IntStream.range(0, persons.size())
                .filter(index -> persons.get(index).getEmail().equals(person.getEmail()))
                .findFirst()
                .orElse(-1);
        if (studentIndex > -1){
            persons.set(studentIndex,person);
            return person;

        }
        return null;

    }
    public void deletePerson(String email) {
        var person = findPersonByEmail(email);
        if (person != null){
            persons.remove(person);
        }

    }
}

