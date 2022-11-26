public class SmallFactory extends OrderTaker {
    @Override
    public void takeOrder(Order o) {
        if(o.getNum()<=50){
            System.out.println("Order Approved for "+o.getNum()+" by Small Factory");
        }
        else
            super.takeOrder(o);
    }
}
