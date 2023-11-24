import java.util.HashMap;
import java.util.Map;

public class Container {
    Map<Ingredient, Integer> containersCapacity;


    public Container() {
    this.containersCapacity = new HashMap<>();
    initialize();
    }

    private void initialize() {
        containersCapacity.put(Ingredient.COFFEE, 10);
        containersCapacity.put(Ingredient.WATER, 10);
        containersCapacity.put(Ingredient.MILK, 5);
        currentCoffeeLevel = containersCapacity.get(Ingredient.COFFEE);
        currentWaterLevel = containersCapacity.get(Ingredient.WATER);
        currentMilkLevel = containersCapacity.get(Ingredient.MILK);
    }

    public int currentCoffeeLevel;
    public int currentWaterLevel;
    public int currentMilkLevel;
//
    public boolean isEmpty(Container container, Drink drink) {
        return container.currentCoffeeLevel <= drink.getCoffeeUnit() &&
                container.currentWaterLevel <= drink.getWaterUnit() &&
                container.currentMilkLevel <= drink.getMilkUnit();
    }

    public void containerRefill (Container container) {
        int coffeeRefill = 10 - container.currentCoffeeLevel;
        int waterRefill = 10 - container.currentWaterLevel;
        int milkRefill = 5 - container.currentMilkLevel;
        this.containersCapacity.put(Ingredient.COFFEE, 10);
        this.containersCapacity.put(Ingredient.WATER, 10);
        this.containersCapacity.put(Ingredient.MILK, 5);
        System.out.println("Uzupełnianie składników... /n" +
        "Uzupełniono " + coffeeRefill + " jednostki kawy /n" +
        "Uzupełniono " + milkRefill + " jednostki mleka /n" +
        "Uzupełniono " + waterRefill + " jednostki wody");
    }

    // wzorzec projektowy strategii
}
