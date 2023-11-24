public class DrinkStrategy implements OrderStrategy {
    Drink drink;

    public DrinkStrategy(Drink drink) {
        this.drink = drink;
    }


    @Override
    public void executeOptionFromMenu(Container container) {
            System.out.println("Przygotowywanie " + drink.name() + "...");
            // procedura pobierania składników z pojemników
        }

    }
