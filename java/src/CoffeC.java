
public class CoffeC implements Coffe{
    private String Caffeine;
    private String Milk;
    private String Sugar;

    CoffeC(){
        makeCoffe();
    }

    @Override
    public void BuildSugar() {
        // TODO Auto-generated method stub
        setSugar("Doesn't Contain Sugar");
    }

    @Override
    public void buildMilk() {
        // TODO Auto-generated method stub
        setMilk("Contains Milk");

    }

    @Override
    public void buildCaffeine() {
        setCaffeine("Contains Caffein");

    }

    @Override
    public void makeCoffe() {
        // TODO Auto-generated method stub
        buildCaffeine();
        BuildSugar();
        buildMilk();


    }

    public String getSugar() {
        return Sugar;
    }

    public void setSugar(String sugar) {
        Sugar = sugar;
    }

    public String getMilk() {
        return Milk;
    }

    public void setMilk(String milk) {
        Milk = milk;
    }

    public String getCaffeine() {
        return Caffeine;
    }

    public void setCaffeine(String caffeine) {
        Caffeine = caffeine;
    }
    @Override
    public void print() {
        // TODO Auto-generated method stub
        System.out.println(Caffeine);
        System.out.println(Milk);
        System.out.println(Sugar);
    }

}
