package by.tc.task01.t08;

public class ComputeFunction {
    public static final double DELTA = 1e-6;
    public static double function(float x) throws FunctionUndefinedAtPointException {
        if(Math.abs(1.*x*x*x - 6) < DELTA){
            throw new FunctionUndefinedAtPointException();
        }
        double result = 0;
        if(x >= 3){
            result = -1.*x*x + 3.*x + 9;
        } else {
            result = 1/(1.*x*x*x - 6);
        }
        return result;
    }
}
