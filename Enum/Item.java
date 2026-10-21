package Enum;

public enum Item {
    OXYGENTANK(1),
    KEYCARD(4),
    MEDKIT(6),
    FOOD(5);

    private final int value;

    private Item(int value) {
        this.value = value;
    }
}
