package ComplexFunctionPlotter.ComplexFunction;

import ComplexFunctionPlotter.Complex.Complex;
//Complex function, you 'wana plot
public class ComplexFunction {
    private static Complex constant=new Complex(2, 1.3);
    public static Complex getFunctionValue(Complex c){
        //example function:c^constant+area-cosecant(c)
        c=c.pow(constant).add(c.arcsc());
        return c;
    }
}
