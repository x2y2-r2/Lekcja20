public class Container {
    public int coffeeLevel;
    public int milkLevel;
    public int waterLevel;

// pole zrobić jako Map a nie 3xint,
    public Container() {
        this.coffeeLevel = 10;
        this.milkLevel = 5;
        this.waterLevel = 10;
    }
    // ustawieć maksymalną pojemność kontenera i sprawdzać ile został uzupełniony

    public String containerStatus() {
        return
                "coffee = " +coffeeLevel  +
                "\nmilk = " + milkLevel +
                "\nwater = " + waterLevel;
    }
}
