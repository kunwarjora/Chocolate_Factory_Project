public abstract class FlavourDecorator implements Shape{
    protected Shape decorated;
    public FlavourDecorator(Shape decoratedShape)
    {
        this.decorated = decoratedShape;
    }
    @Override
    public void craft() {
        decorated.craft();
    }
}
