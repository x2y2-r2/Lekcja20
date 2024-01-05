public class ServiceRefill extends Service{
    public ServiceRefill(String nameOfService) {
        super(nameOfService);
    }

    @Override
    public boolean run(Container container) {
        System.out.println("Uzupełniono poziom kawy w pojemniku");


        int refillCoffeeLevel = container.getMaxCoffeeLevel() - container.containerLevel.get(IngredientType.COFFEE);
        int refillWaterLevel = container.getMaxWaterLevel() - container.containerLevel.get(IngredientType.WATER);
        int refillMilkLevel = container.getMaxMilkLevel() - container.containerLevel.get(IngredientType.MILK);

        System.out.println("refill " + refillCoffeeLevel + " coffee unit " +
                "\nrefill " + refillMilkLevel + " milk unit" +
                "\nrefill " + refillWaterLevel +" water unit");

        container.refill();
        return true;
    }
}
