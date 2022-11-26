public abstract class OrderTaker {
    protected OrderTaker nextOrderTaker;
    public void takeOrder(Order o){
        nextOrderTaker.takeOrder(o);
    }
    public void setNextOrderTaker(OrderTaker o){
        this.nextOrderTaker= o;
    }
}
