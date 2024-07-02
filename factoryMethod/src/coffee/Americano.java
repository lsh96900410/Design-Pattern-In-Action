package coffee;

public class Americano extends Coffee {

    @Override
    public String getName(){
        return CoffeeType.AMERICANO.getMenuName();
    }

}
