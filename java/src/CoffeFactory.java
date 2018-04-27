public class CoffeFactory {
    public Coffe ProduceCoffe(String Type) {
        Coffe coffe = null;
        if(Type.equals("A")){
            coffe = new CoffeA();
        }
        else if(Type.equals("B")){
            coffe = new CoffeB();
        }
        else if(Type.equals("C")){
            coffe = new CoffeC();
        }

        return coffe;
    }
}
