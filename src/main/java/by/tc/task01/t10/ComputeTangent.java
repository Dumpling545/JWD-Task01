package by.tc.task01.t10;

import java.util.NavigableMap;
import java.util.TreeMap;

public class ComputeTangent {
    public static double DELTA = 1e-10;
    public static NavigableMap<Double, Double> tan(double a, double b, double h)
            throws InvalidArgumentException {
        if(a > b ||  h <= DELTA){
            throw new InvalidArgumentException();
        }
        NavigableMap<Double, Double> table = new TreeMap<>();
        double x = a;
        while(x <= b){
            table.put(x, Math.tan(x));
            x+=h;
        }
        return table;
    }
}
