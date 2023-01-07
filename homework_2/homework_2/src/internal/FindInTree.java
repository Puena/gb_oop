package internal;

import java.util.Scanner;

public class FindInTree implements Option{
    @Override
    public void executeAction(FamilyController controller) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя:");
        String firstName = scanner.nextLine();
        System.out.println("Введите фамилию:");
        String secondName = scanner.nextLine();
        controller.findInTree(firstName, secondName);

    }
}
