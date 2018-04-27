public class Main {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Coffe coffe;
        CoffeFactory factory = new CoffeFactory();

        System.out.println("This is a coffe of Type A");
        coffe = factory.ProduceCoffe("A");
        coffe.print();

        System.out.println("");
        System.out.println("This is a coffe of Type B");
        coffe = factory.ProduceCoffe("B");
        coffe.print();

        System.out.println("");
        System.out.println("This is a coffe of Type C");
        coffe = factory.ProduceCoffe("C");
        coffe.print();

    }
}
