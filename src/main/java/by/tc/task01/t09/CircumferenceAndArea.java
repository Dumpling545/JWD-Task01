package by.tc.task01.t09;

public class CircumferenceAndArea {
    public static final double DELTA = 1e-10;
    public static double[] getCircumferenceAndArea(double radius) throws NonPositiveRadiusException {
        if(radius <= 0){
            throw new NonPositiveRadiusException();
        }
        double circumference = 2 * Math.PI * radius;
        double area =  Math.PI * radius * radius;
        return new double[]{circumference, area};
    }
}
