package factory;

import cafe.CafeType;
import coffee.*;

public class StarbucksFactory implements CoffeeFactory{

    public static final int STAR_BUCKS_AMERICANO = 5000;
    public static final int STAR_BUCKS_LATTE = 6000;
    public static final int STAR_BUCKS_TEA = 7000;
    public static final int NOT_EXIST_MENU = 0;

    public Coffee create(CoffeeType coffeeType, CafeType cafeType) {
        Coffee coffee = createCoffee(coffeeType);

        System.out.println("---- 스타벅스 제조중 ----");
        System.out.println("가게 : 스타벅스");
        System.out.println("메뉴 : " + coffee.getName());
        System.out.println("가격 : " + price(coffee.getName()));
        System.out.println("---- 스타벅스 제조중 ----");

        return coffee;
    }


    public String getFactoryName() {
        return " Factory : 스타벅스 커피";
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
            case "AMERICANO" : return STAR_BUCKS_AMERICANO;
            case "LATTE" : return STAR_BUCKS_LATTE;
            case "TEA" : return STAR_BUCKS_TEA;

            default: return NOT_EXIST_MENU;
        }

    }
}
