package internal;

import java.util.Scanner;

public class LoadTree implements Option {
    @Override
    public String displayHelpInfo() {
        return "Загрузить генеалогические древо";
    }

    @Override
    public void executeAction(FamilyController controller) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Файл для загрузки:");
        controller.loadFromFile(scanner.nextLine());
    }
}
