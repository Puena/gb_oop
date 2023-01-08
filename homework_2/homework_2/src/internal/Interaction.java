package internal;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Interaction {
    FamilyController familyController;

    public Interaction() {
        familyController = new FamilyController();
        System.out.println("Загружено дерево по умолчанию: 'default.tree'");
    }

    public void startMainMenu(){
        Map<Integer, Option> mainMenu = new HashMap<>();
        mainMenu.put(2, new CreateNewTree());
        mainMenu.put(3, new LoadTree());
        mainMenu.put(1, new ResearchMenu());
        mainMenu.put(4, new CloseAndSave());
        mainMenu.put(5, new Close());
        Scanner scanner = new Scanner(System.in);
        int result = 0;
        while(result != 5){
            for (Map.Entry<Integer, Option> el: mainMenu.entrySet()) {
                System.out.println(el.getKey() + " " + el.getValue().displayHelpInfo());
            }
            if (scanner.hasNextInt()){
                if (mainMenu.containsKey(result = scanner.nextInt())) {
                    mainMenu.get(result).executeAction(familyController);
                    if (result == 1) researchMenu(familyController);
                }
            }else scanner.next();
        }
        scanner.close();
    }
    public void researchMenu(FamilyController familyController) {
        Map<Integer, Option> researchMap = new HashMap<>();
        researchMap.put(1, new ShowFullTree());
        researchMap.put(2, new AddNewMember());
        researchMap.put(3, new AddRelationship());
        researchMap.put(4, new FindInTree());
        researchMap.put(5, new Close());
        Scanner scanner = new Scanner(System.in);
        int result = 0;
        while (result != 5) {
            System.out.println("1. Показать древо");
            System.out.println("2. Добавить человека");
            System.out.println("3. Добавить связь");
            System.out.println("4. Поиск по древу");
            System.out.println("5. Назад");
            if (scanner.hasNextInt()) {
                if (researchMap.containsKey(result = scanner.nextInt())) {
                    researchMap.get(result).executeAction(familyController);
                }
            } else scanner.next();
        }
    }
}
