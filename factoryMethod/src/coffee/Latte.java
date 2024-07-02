package coffee;

public class Latte extends Coffee {
    @Override
    public String getName() {
        return CoffeeType.LATTE.getMenuName();
    }

}
