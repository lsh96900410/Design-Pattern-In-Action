package cafe;

import coffee.Coffee;
import coffee.CoffeeType;

import java.time.LocalDateTime;

public class ComposeCoffee extends Cafe {
    public ComposeCoffee() {
        name = CafeType.COMPOSE_COFFEE.getCafeName();
    }
}
