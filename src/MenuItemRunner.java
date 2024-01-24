import java.util.List;
import java.util.Scanner;

public class MenuItemRunner {
    Scanner scanner = new Scanner(System.in);
    public boolean runSelectedOption(List<MenuItem> menuItems, Container container) {
        System.out.println("Wybierz opcje z menu");
        int selectedIndex = scanner.nextInt();
        scanner.nextLine();
        MenuItem selectedItem = menuItems.get(selectedIndex - 1);
       if (!selectedItem.run(container)) {
           return false;
       }
        scanner.nextLine();
        return true;
    }
}
