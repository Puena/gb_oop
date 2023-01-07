package internal;

public class ShowFullTree implements Option{
    @Override
    public void executeAction(FamilyController controller) {
        controller.showTree();
    }
}
