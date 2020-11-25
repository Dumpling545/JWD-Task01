package by.tc.task01.t03;

public class NonPositiveAreaException extends Exception{
    public NonPositiveAreaException(){
        super("Area of square is not positive");
    }
}
