package by.tc.task01.t03;

public class InscribedSquareArea {
    public static double getArea(double circumscribedSquareArea) throws NonPositiveAreaException {
        if (circumscribedSquareArea <= 0)
            throw new NonPositiveAreaException();
        double inscribedSquareArea = circumscribedSquareArea / 2;
        return inscribedSquareArea;
    }
}
