import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        var rootPerson = new FamilyPerson("Mihail", "Fedorovich", LocalDate.of(1613, 1, 1));
        var rootPartner = new Partner("Evdokia", "Lukianovna", LocalDate.of(1614, 1, 1));
        var rootHair = new FamilyPerson("Aleksei", "Mikhailovich", LocalDate.of(1645, 1, 1));



        var tree = new FamilyTree(rootPerson);
        tree.addPartner(rootPerson, rootPartner);
        tree.addHairs(rootPerson, rootPartner, rootHair);

        tree.addPartner(
                rootHair,
                new Partner("Nataly", "Kirillovna", LocalDate.of(1645, 1, 1))
        );

        tree.addPartner(
                rootHair,
                new Partner("Mary", "Ilinichna", LocalDate.of(1655, 1, 1))
        );

        tree.addHairs(
                rootHair,
                new Partner("Nataly", "Kirillovna", LocalDate.of(1645, 1, 1)),
                new FamilyPerson("Petr 1", "Alekseevich", LocalDate.of(1682, 1, 1))
        );
        tree.addHairs(
                rootHair,
                new Partner("Mary", "Ilinichna", LocalDate.of(1655, 1, 1)),
                new FamilyPerson("Ioaan V", "Alekseevich", LocalDate.of(1655, 1,1))
        );
        tree.addHairs(
                rootHair,
                new Partner("Mary", "Ilinichna", LocalDate.of(1655, 1, 1)),
                new FamilyPerson("Fedor", "Alekseevich", LocalDate.of(1655, 1,1))
        );
        System.out.print("abrakadabra");
    }
}
