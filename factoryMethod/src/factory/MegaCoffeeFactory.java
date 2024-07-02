package factory;

import cafe.CafeType;
import coffee.*;

public class MegaCoffeeFactory implements CoffeeFactory{

    public static final int MEGA_COFFEE_AMERICANO = 1000;
    public static final int MEGA_COFFEE_LATTE = 1500;
    public static final int MEGA_COFFEE_TEA = 2000;
    public static final int NOT_EXIST_MENU = 0;

    public Coffee create(CoffeeType coffeeType, CafeType cafeType) {
        Coffee coffee = createCoffee(coffeeType);

        System.out.println("---- 메가 커피 제조중 ----");
        System.out.println("가게 : 메가커피");
        System.out.println("메뉴 : " + coffee.getName());
        System.out.println("가격 : " + price(coffee.getName()));
        System.out.println("---- 메가 커피 제조중 ----");

        return coffee;
    }


    public String getFactoryName() {
        return " Factory : 메가 커피";
    }

    private Coffee createCoffee(CoffeeType coffeeType){
        switch (coffeeType.getMenuCode()){
            case 1 : return new Americano();

            case 2 : return new Latte();

            case 3 : return new Tea();

            default: throw new IllegalArgumentException("NOT EXIST Coffee Type : "+ coffeeType.getMenuName());
        }
    }

    private int price(String menuName){
        switch (menuName){
            case "AMERICANO" : return MEGA_COFFEE_AMERICANO;
            case "LATTE" : return MEGA_COFFEE_LATTE;
            case "TEA" : return MEGA_COFFEE_TEA;

            default: return NOT_EXIST_MENU;
        }

    }
}
