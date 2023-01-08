package internal;

public class CreateNewTree implements Option {
    @Override
    public String displayHelpInfo() {
        return "Создать новое дерево";
    }

    @Override
    public void executeAction(FamilyController controller) {
        controller.createNewTree();
        System.out.println("Создано новое дерево!");
    }

}