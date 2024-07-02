package factory;

import cafe.CafeType;
import coffee.Coffee;
import coffee.CoffeeType;

public interface CoffeeFactory {

    Coffee create(CoffeeType coffeeType, CafeType cafeType);

    String getFactoryName();
}
