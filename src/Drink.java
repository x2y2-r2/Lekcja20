public enum Drink {
    ESPRESSO(2, 1, 0),
    CAPPUCCINO(1,0,2),
    AMERICANO(2,2,0),
    MILK(0,0,3);

    private final int coffeeUnit;
    private final int waterUnit;
    private final int milkUnit;

    Drink(int coffeeUnit, int waterUnit, int milkUnit) {
        this.coffeeUnit = coffeeUnit;
        this.waterUnit = waterUnit;
        this.milkUnit = milkUnit;
    }

    public int getCoffeeUnit() {
        return coffeeUnit;
    }

    public int getWaterUnit() {
        return waterUnit;
    }

    public int getMilkUnit() {
        return milkUnit;
    }



}
