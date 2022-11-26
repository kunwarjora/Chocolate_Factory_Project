public class Strawberry extends FlavourDecorator{
    public Strawberry(Shape decorated){
        super(decorated);
    }

    @Override
    public void craft() {
        decorated.craft();
        setFlavour(decorated);
    }
    private void setFlavour(Shape decorated){
        System.out.println("Flavour: Strawberry");
    }
}
