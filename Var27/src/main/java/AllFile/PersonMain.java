package AllFile;

import AllFile.Model.Person;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PersonMain {

    public static void main(String[] args) {
        SpringApplication.run(PersonMain.class, args);
    }
    Configuration con = new Configuration().addAnnotatedClass(Person.class);
    StandardServiceRegistryBuilder sBilder = new StandardServiceRegistryBuilder().applySettings(con.getProperties());
    SessionFactory sf = con.buildSessionFactory(sBilder.build());




}
