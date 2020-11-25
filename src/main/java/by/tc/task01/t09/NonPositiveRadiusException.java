package by.tc.task01.t09;

public class NonPositiveRadiusException extends Exception{
    public NonPositiveRadiusException(){
        super("Incorrect radius value: must be positive");
    }
    
}
