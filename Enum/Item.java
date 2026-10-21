package Enum;

public enum Item {
    OXYGENTANK(2, "Oxygentank"),
    KEYCARD(4, "Keycard"),
    MEDKIT(5, "Medkit"),
    FOOD(6, "Food");

    private final int point;
    private final String name;

    private Item(int point, String name) {
        this.point = point;
        this.name = name;
    }

    public int getPoint() {
        return point;
    }

    public String getName() {
        return name;
    }

    


}
