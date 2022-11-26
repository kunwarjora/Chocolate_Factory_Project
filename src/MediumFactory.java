public class MediumFactory extends OrderTaker{
    @Override
    public void takeOrder(Order o) {
        if(o.getNum()<=250){
            System.out.println("Order Approved for "+o.getNum()+" by Medium Factory");
        }
        else
            super.takeOrder(o);
    }
}
