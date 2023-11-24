public class IsEmptyStrategy implements OrderStrategy{

    public IsEmptyStrategy() {
    }

    @Override
    public void executeOptionFromMenu(Container container) {
        int coffeeRefill = 10 - container.currentCoffeeLevel;
        int waterRefill = 10 - container.currentWaterLevel;
        int milkRefill = 5 - container.currentMilkLevel;

        System.out.println("Uzupełnianie składników...\n" +
                "Uzupełniono " + coffeeRefill + " jednostki kawy\n" +
                "Uzupełniono " + milkRefill + " jednostki mleka\n" +
                "Uzupełniono " + waterRefill + " jednostki wody");
        container.containerRefill(container);

        }

    }
