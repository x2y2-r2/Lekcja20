import java.util.List;

public class MenuDisplayer {
   public void displayMenu (List<MenuItem> menuItems) {
       System.out.printf("--------------------------------%n");
       System.out.printf(" Java Express         %n");
       System.out.printf(" Jaką czynność chcesz wykonać?         %n");
       System.out.printf("--------------------------------%n");
       System.out.printf("| %-4s | %-8s | %n", "Numer produktu", "Czynność");
       System.out.printf("--------------------------------%n");
        int menuOptionNumber = 0;
        for (MenuItem item : menuItems) {
            menuOptionNumber++;
            System.out.printf("| %-4s | %-8s | %n", "[" + menuOptionNumber + "]", item.createMenuItem());
        };
   }
}
