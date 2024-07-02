package cafe;

import coffee.Coffee;
import coffee.CoffeeType;

import java.time.LocalDateTime;

public abstract class Cafe {

    protected String name ;

    public String getName(){
        return "안녕하세요 " + name + "입니다";
    }
}
