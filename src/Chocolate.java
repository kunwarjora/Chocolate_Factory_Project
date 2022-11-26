public class Chocolate extends FlavourDecorator{
    public Chocolate(Shape decorated){
        super(decorated);
    }

    @Override
    public void craft() {
        decorated.craft();
        setFlavour(decorated);
    }
    private void setFlavour(Shape decorated){
        System.out.println("Flavour: Chocolate");
    }
}
