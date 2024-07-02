package coffee;

public class Tea extends Coffee {
    @Override
    public String getName() {
        return CoffeeType.TEA.getMenuName();
    }

}
