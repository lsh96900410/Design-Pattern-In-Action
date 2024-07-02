package cafe;

public enum CafeType {
    MEGA_COFFEE("메가커피",1),
    STAR_BUCKS("스타벅스",2),
    COMPOSE_COFFEE("컴포즈커피",3);

    private final String cafeName;
    private final int cafeCode;

    CafeType(String cafeName, int cafeCode){
        this.cafeName=cafeName;
        this.cafeCode=cafeCode;
    }

    public String getCafeName(){
        return cafeName;
    }

    public int getCafeCode(){
        return cafeCode;
    }
}
