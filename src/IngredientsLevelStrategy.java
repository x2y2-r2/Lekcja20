public class IngredientsLevelStrategy implements OrderStrategy {

    @Override
    public void executeOptionFromMenu(Container container) {
        int coffeeRefill = 10 - container.currentCoffeeLevel;
        int waterRefill = 10 - container.currentWaterLevel;
        int milkRefill = 5 - container.currentMilkLevel;
        System.out.println(
                "Poziom składników... /n" +
                coffeeRefill + " jednostki kawy /n" +
                milkRefill + " jednostki mleka /n" +
                waterRefill + " jednostki wody");
    }
}
