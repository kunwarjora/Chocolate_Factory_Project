import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int inp,ord;
        Scanner sc =new Scanner(System.in);
        Factory factory = new Factory();
        Shape shape= null;
        boolean flag=true;
        while(flag){
        System.out.println("Enter Chocolate shape:\n1. Cone\n2. Cube\n3. Cylinder\n4. Sphere\n5. Star\n");
        inp =sc.nextInt();
        switch (inp){
            case 1:
                shape =factory.getShape("cone");
                System.out.println("Cone shape confirm ? Yes/No");
                if(sc.next().equalsIgnoreCase("yes")){
                    flag=false;
                }
                break;
            case 2:
                shape= factory.getShape("cube");
                System.out.println("Cube shape confirm ? Yes/No");
                if(sc.next().equalsIgnoreCase("yes")){
                    flag=false;
                }
                break;
            case 3:
                shape= factory.getShape("cylinder");
                System.out.println("Cylinder shape confirm ? Yes/No");
                if(sc.next().equalsIgnoreCase("yes")){
                    flag=false;
                }
                break;
            case 4:
                shape= factory.getShape("sphere");
                System.out.println("Sphere shape confirm ? Yes/No");
                if(sc.next().equalsIgnoreCase("yes")){
                    flag=false;
                }
                break;
            case 5:
                shape= factory.getShape("Star");
                System.out.println("Star shape confirm ? Yes/No");
                if(sc.next().equalsIgnoreCase("yes")){
                    flag=false;
                }
                break;
            default:
                System.out.println("Enter valid input");
        }
    }
//        Flavour set
        flag=true;
        while(flag){

        System.out.println("Enter Flavour Type:\n1. Chocolate\n2. Strawberry\n3. Vanilla");
        inp =sc.nextInt();
        switch (inp){
            case 1:
                Shape chocolateShape = new Chocolate(shape);
                chocolateShape.craft();
                flag=false;
                break;
            case 2:
                Shape strawberryShape = new Strawberry(shape);
                strawberryShape.craft();
                flag=false;
                break;
            case 3:
                Shape vanillaShape = new Vanilla(shape);
                vanillaShape.craft();
                flag=false;
                break;
            default:
                System.out.println("Enter valid input");
        }
    }
        Order order = new Order();
        System.out.println("Enter no. of orders: ");
        ord=sc.nextInt();
        order.setNum(ord);
        SmallFactory sf= new SmallFactory();
        MediumFactory mf = new MediumFactory();
        LargeFactory lf = new LargeFactory();
        sf.setNextOrderTaker(mf);
        mf.setNextOrderTaker(lf);

        sf.takeOrder(order);
        System.out.println("Program Ended");
    }
}