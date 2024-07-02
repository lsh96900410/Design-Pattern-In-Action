package factory;

import cafe.*;

public class CafeFactory {

    public static Cafe choiceCafe(CafeType cafeType){
        switch (cafeType.getCafeCode()){
            case 1 : return new MegaCoffee();

            case 2 : return new ComposeCoffee();

            case 3 : return new Starbucks();

            default: throw new IllegalArgumentException("NOT EXIST CAFE " + cafeType.getCafeName());
        }
    }




}
