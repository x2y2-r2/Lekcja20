public abstract class Service implements MenuItem {
    String nameOfService;

    // klasa abstrakcyjna może mieć metody z ciałem, wtedy te metody są częścią wspólną klas dziedziczących
    public Service(String nameOfService) {
        this.nameOfService = nameOfService;
    }
    @Override
    public String createMenuItem() {
        return nameOfService;
    }
}
