package ComplexFunctionPlotter.MathAdditions;
//I did this to add methods that are not in the java.Math
public class Mat {
    public static int clamp(int min, int max, int value){
        return Math.max(min, Math.min(max, value));
    }
}
