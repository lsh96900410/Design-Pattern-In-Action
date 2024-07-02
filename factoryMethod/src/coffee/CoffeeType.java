package coffee;

public enum CoffeeType {

    AMERICANO("AMERICANO", 1),
    LATTE("LATTE", 2),
    TEA("TEA", 3);


    private final String menuName;
    private final int menuCode;


    CoffeeType(String menuName, int menuCode){
        this.menuCode = menuCode;
        this.menuName = menuName;

    }

    public int getMenuCode(){ return menuCode; }

    public String getMenuName(){ return menuName; }


}
