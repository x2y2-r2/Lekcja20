public class MenuItemQuit implements MenuItem{
    @Override
    public void setContainer(Container container) {

    }

    @Override
    public String createMenuItem() {
        return "Wyłącz express";
    }

    @Override
    public boolean run() {
        return false;
    }
}
