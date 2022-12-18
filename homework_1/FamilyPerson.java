import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class FamilyPerson extends Human {
    private List<Partner> families;

    public FamilyPerson(String name, String lastname, LocalDate birthdate) {
        super(name, lastname, birthdate);
        this.families = new ArrayList<>();
    }

    public List<Partner> getFamilies() {
        return families;
    }

    public void setFamilies(Partner partner) {
        this.families.add(partner);
    }

}
