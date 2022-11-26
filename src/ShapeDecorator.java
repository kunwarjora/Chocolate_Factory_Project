public class ShapeDecorator implements Shape{
    protected Shape decorated;
    public ShapeDecorator(Shape decoratedShape)
    {
        this.decorated = decoratedShape;
    }
    @Override
    public void craft() {
        decorated.craft();
    }
}
