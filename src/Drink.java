
public class Drink implements MenuItem {
    private final int coffee;
    private final int water;
    private final int milk;
    private final String name;
    private Container container; //usunąć z tej klasy- contorl panel obsługuje pojemniki i jego zawartość
// v2.0 dodać klasę Składnik z polami: nazwa i ilość. Drink ma kolekcję (Listę) składników ustawianą w konstruktorze.
    // Kontener ma mapę składników, jedna pętla przeszukuję mapę za składnikami, druga pomniejsza ilość składników jak robi drinka,
    // Jeżeli kontener nie ma danego składnika to powinien zwracać 0.
    public Drink(String nazwa, int coffee, int water, int milk) {
        this.name = nazwa;
        this.coffee = coffee;
        this.water = water;
        this.milk = milk;
        this.container = null;
    }


    @Override
    public void setContainer(Container expressContainer) {
        this.container = expressContainer;
    }

    @Override
    public String createMenuItem() {
        return "Przygotowanie " + name;
    }

    @Override
    public boolean run() {
        if(container.coffeeLevel< coffee || container.milkLevel < milk || container.waterLevel < water){
            System.out.println("Za mało składników, uzupełnij składniki");
            return true;
        }
        System.out.println("Tworzę drinka + " + name);
        container.coffeeLevel -= coffee;
        container.waterLevel -= water;
        container.milkLevel -= milk;
        return true;


    }
}
