import java.time.LocalDate;
import java.util.Objects;

public class Human {
    private String name;
    private String lastname;
    private LocalDate birthdate;
    private LocalDate deadDate;

    public Human(String name, String lastname, LocalDate birthdate, LocalDate deadDate) {
        this.name = name;
        this.lastname = lastname;
        this.birthdate = birthdate;
        this.deadDate = deadDate;
    }

    public Human(String name, String lastname, LocalDate birthdate) {
        this(name, lastname, birthdate, null);
    }

    public String getName() {
        return name;
    }

    public String getLastname() {
        return lastname;
    }

    public LocalDate getBirthdate() {
        return birthdate;
    }

    public LocalDate getDeadDate() {
        return deadDate;
    }

    public void setDeadDate(LocalDate date) {
        this.deadDate = date;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Human human = (Human) o;
        return Objects.equals(name, human.name) && Objects.equals(lastname, human.lastname) && Objects.equals(birthdate, human.birthdate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, lastname, birthdate);
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", lastname='" + lastname + '\'' +
                ", birthdate=" + birthdate +
                ", deadDate=" + deadDate +
                '}';
    }
}
