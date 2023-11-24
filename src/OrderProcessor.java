public class OrderProcessor {
    private OrderStrategy orderStrategy;


    public OrderProcessor(OrderStrategy orderStrategy) {
        this.orderStrategy = orderStrategy;
    }

    public void executeOptionFromMenu(Container container) {
        this.orderStrategy.executeOptionFromMenu(container);
    }
}
