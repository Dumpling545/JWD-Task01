package by.tc.task01.t07;

public class ClosestPoint {
    public static final int FIRST_POINT = 0;
    public static final int SECOND_POINT = 1;
    public static final int BOTH_POINTs = 2;
    public static boolean isFirstCloserThanSecond(float x1, float y1, float x2, float y2){
        double difference = (1.*x1*x1 + 1.*y1*y1) - (1.*x2*x2 + 1.*y2*y2);
        return difference < 0.0;
    }
}
