import java.util.ArrayList;
import java.util.List;

public class ControlPanel {
    private final List<MenuItem> menuItems = new ArrayList<>();
    Container expressContainer = new Container();  // czy jest sens robić private i ustawiać setter i getter?

    private void initMenuItems() {
        menuItems.add(new Drink("Espresso",2,1,0));
        menuItems.add(new Drink("Cappuccino",1,0,2));
        menuItems.add(new Drink("Americano",2,2,0));
        menuItems.add(new Drink("Milk",0,0,3));
        menuItems.add(new ServiceCheckLevel("Status pojemnika"));
        menuItems.add(new ServiceRefiller("Uzupełnienie składników"));
        menuItems.add(new MenuItemQuit());

        for (MenuItem item : menuItems) {
            item.setContainer(expressContainer);
        }
    }

    public void initControlPanel() {
        initMenuItems();
        while (true) {
            MenuDisplayer displayMenu = new MenuDisplayer();
            displayMenu.displayMenu(menuItems);
            MenuItemRunner itemRunner = new MenuItemRunner();
            if (!itemRunner.runSelectedOption(menuItems)) {
                break;
            }

        }
    }

}
