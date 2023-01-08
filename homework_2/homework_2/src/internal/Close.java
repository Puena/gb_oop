package internal;


public class Close implements Option {
    @Override
    public String displayHelpInfo() {
        return "закрыть";
    }

    @Override
    public void executeAction(FamilyController controller) {
    }
}