package internal;

import java.util.Scanner;

public class LoadTree implements Option {
    @Override
    public void executeAction(FamilyController controller) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Файл для загрузки:");
        controller.loadFromFile(scanner.nextLine());
    }
}
