import java.util.List;

public class Drink implements MenuItem{

    List<Ingredient> drinkIngredients;

    private final String name;

    public Drink(String name, int coffee, int water, int milk ) {
        this.name = name;
        this.drinkIngredients = List.of(
                new Ingredient(IngredientType.COFFEE, coffee),
                new Ingredient(IngredientType.WATER, water),
                new Ingredient(IngredientType.MILK, milk)
        );
    }

    @Override
    public String createMenuItem() {
        return "Przygotowanie " + name;
    }

    @Override
    public boolean run(Container container) {
        int coffee = 0;
        int water = 0;
        int milk = 0;
        for (Ingredient ingredient : drinkIngredients) {
            switch (ingredient.ingredientType) {
                case COFFEE -> coffee = ingredient.amount;
                case WATER -> water = ingredient.amount;
                case MILK -> milk = ingredient.amount;
                }
            }

        if(container.containerLevel.get(IngredientType.COFFEE) < coffee
                || container.containerLevel.get(IngredientType.MILK) < milk
                || container.containerLevel.get(IngredientType.WATER) < water){
            System.out.println("Za mało składników, uzupełnij składniki");
            System.out.println(container.containerStatus());
            return true;
        }
        System.out.println("Tworzę drinka + " + name);
        int newCoffeeLevel = container.containerLevel.get(IngredientType.COFFEE) - coffee;
        int newWaterLevel = container.containerLevel.get(IngredientType.WATER) - water;
        int newMilkLevel = container.containerLevel.get(IngredientType.MILK) - milk;
        container.containerLevel.put(IngredientType.COFFEE , newCoffeeLevel );
        container.containerLevel.put(IngredientType.WATER, newWaterLevel );
        container.containerLevel.put( IngredientType.MILK , newMilkLevel );

        return true;
    }
}
