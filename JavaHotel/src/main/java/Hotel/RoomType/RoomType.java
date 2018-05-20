package Hotel.RoomType;

public enum RoomType {
    SINGLE(1,2),
    DOUBLE(2,3),
    FAMILY(3,5);


    private final int min;
    private final int max;

    RoomType(int min, int max){
        this.min = min;
        this.max = max;
    }
}
