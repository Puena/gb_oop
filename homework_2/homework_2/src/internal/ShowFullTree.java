package internal;

public class ShowFullTree implements Option{
    @Override
    public String displayHelpInfo() {
        return "показать всё дерево";
    }

    @Override
    public void executeAction(FamilyController controller) {
        controller.showTree();
    }
}
