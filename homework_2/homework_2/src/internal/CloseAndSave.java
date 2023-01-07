package internal;

import java.util.Scanner;

public class CloseAndSave implements Option {
    @Override
    public void executeAction(FamilyController controller) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя файла для сохранения:");
        controller.saveToFile(scanner.nextLine());
    }
}
