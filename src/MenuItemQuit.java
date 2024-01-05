public class MenuItemQuit implements MenuItem{

    @Override
    public String createMenuItem() {
        return "Wyłącz express";
    }

    @Override
    public boolean run(Container container) {
        return false;
    }
}
