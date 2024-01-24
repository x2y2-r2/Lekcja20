import java.util.HashMap;
import java.util.Map;

public class Container {
    Map<IngredientType,Integer> containerLevel;
    private int maxCoffeeLevel;
    private int maxMilkLevel;
    private int maxWaterLevel;

    public Container() {
        this.containerLevel = new HashMap<>();
        this.maxCoffeeLevel = 10;
        this.maxWaterLevel = 10;
        this.maxMilkLevel = 5;
        refill();
    }

    public String containerStatus() {
        return
                "coffee = " + containerLevel.get(IngredientType.COFFEE) +
                "\nmilk = " + containerLevel.get(IngredientType.MILK) +
                "\nwater = " + containerLevel.get(IngredientType.WATER);
    }

    public int getMaxCoffeeLevel() {
        return maxCoffeeLevel;
    }

    public int getMaxMilkLevel() {
        return maxMilkLevel;
    }

    public int getMaxWaterLevel() {
        return maxWaterLevel;
    }

    public void refill() {
        containerLevel.put(IngredientType.COFFEE, maxCoffeeLevel);
        containerLevel.put(IngredientType.MILK,maxMilkLevel);
        containerLevel.put(IngredientType.WATER, maxCoffeeLevel);
    }
}
