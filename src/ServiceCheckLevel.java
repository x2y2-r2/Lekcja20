public class ServiceCheckLevel extends Service{
    public ServiceCheckLevel(String nameOfService) {
        super(nameOfService);
    }

    @Override
    public boolean run(Container container) {
        System.out.println(container.containerStatus());
        return true;
    }


}
