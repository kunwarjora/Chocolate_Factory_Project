public class LargeFactory extends OrderTaker{
    @Override
    public void takeOrder(Order o) {
        if(o.getNum()>250){
            System.out.println("Order Approved for "+o.getNum()+" by Large Factory");
        }
        else
            super.takeOrder(o);
    }
}
