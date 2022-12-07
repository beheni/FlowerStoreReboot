package apps.ucu.edu.ua.user;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;

import javax.persistence.GeneratedValue;
import javax.persistence.Transient;
import java.time.LocalDate;
import java.time.Period;
@Getter
@Setter
public class AppUser {
    @Id
    @GeneratedValue
    private int id;
    private String email;
    private LocalDate dob;
    @Transient
    private int age;

    public int getAge() {
        return Period.between(dob, LocalDate.now()).getYears();
    }
}
