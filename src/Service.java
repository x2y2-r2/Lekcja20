public abstract class Service implements MenuItem {
    String nameOfService;
    Container container;

    // klasa abstrakcyjna może mieć metody z ciałem, wtedy te metody są częścią wspólną klas dziedziczących
    public Service(String nameOfService) {
        this.nameOfService = nameOfService;
        this.container = null;
    }

    @Override
    public void setContainer(Container expressContainer) {
        this.container = expressContainer;
    }

    @Override
    public String createMenuItem() {
        return nameOfService;
    }

    @Override
    public abstract boolean run();

//    https://github.com/boczkas/PAL_bank-zadanie/tree/master/src/main/java/bank

}
