import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Partner extends Human{
    private List<FamilyPerson> hairs;

    public Partner(String name, String lastname, LocalDate birthdate) {
        super(name, lastname, birthdate);
        this.hairs = new ArrayList<>();
    }

    public List<FamilyPerson> getHairs() {
        return hairs;
    }

    public void setHairs(FamilyPerson hair) {
        this.hairs.add(hair);
    }
}

