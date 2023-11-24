import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Scanner;

public class ControlPanel {
    private final Map<Integer, String> menuOptions = new HashMap<>();
    private final Scanner scanner = new Scanner(System.in);



    public ControlPanel() {

    }

    public void startInterface() {
    System.out.printf("--------------------------------%n");
    System.out.printf(" Java Express         %n");
    System.out.printf(" Jaką czynność chcesz wykonać?         %n");
    System.out.printf("--------------------------------%n");
    System.out.printf("| %-4s | %-8s | %n", "Product Number", "Czynność");
    System.out.printf("--------------------------------%n");
    int menuOptionNumber = 0;
    for (Drink drink : Drink.values()) {
        menuOptionNumber++;
        System.out.printf("| %-4s | %-8s | %n", "[" + menuOptionNumber +"]", "Przygotowanie " + drink.name());
        menuOptions.put(menuOptionNumber, drink.name());
        if (menuOptionNumber == Drink.values().length) {
            menuOptionNumber++;
            System.out.printf("| %-4s | %-8s | %n", "[" + menuOptionNumber +"]", "Uzupełnienie składników");
            menuOptions.put(menuOptionNumber, "Uzupełnienie składników");
        }
    }

    // metoda do wpisywania i pozycji i opisu czynności
}

public int chooseOptionFromMenu() {
    System.out.println("->   ");
    int menuOption = scanner.nextInt();
    scanner.nextLine();
    return menuOption;
}
public Drink drinkFromMenu(int menuOption) {
       String drink = menuOptions.get(menuOption);
       return Drink.valueOf(drink);
}



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ControlPanel panel = (ControlPanel) o;
        return Objects.equals(menuOptions, panel.menuOptions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(menuOptions);
    }

    public Map<Integer, String> getMenuOptions() {
        return menuOptions;
    }

}
