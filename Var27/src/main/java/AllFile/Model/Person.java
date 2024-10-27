package AllFile.Model;

import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@Table

public class Person {
    @Id
    @GeneratedValue
    private long id;
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String email;

}

