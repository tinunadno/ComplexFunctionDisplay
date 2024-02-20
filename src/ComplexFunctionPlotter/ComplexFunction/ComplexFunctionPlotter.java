package ComplexFunctionPlotter.ComplexFunction;

import ComplexFunctionPlotter.Complex.Complex;
import ComplexFunctionPlotter.Plots.PlotSettings;
import ComplexFunctionPlotter.Vectors.vec3;

//iterates over integer points on complex plane and plotting it on main screen
//accepts the line color and its length as input
public class ComplexFunctionPlotter {
    public static void plotFunction(vec3 color, double len){
        for(int i = ((-1)* PlotSettings.getScale()); i< PlotSettings.getScale(); i++){
            for(int j = ((-1)* PlotSettings.getScale()); j< PlotSettings.getScale(); j++) {
                Complex pnt = new Complex(j, i);
                Complex funcValue=ComplexFunction.getFunctionValue(pnt).normalize().mult(len);
                PlotSettings.drawLine(pnt, pnt.add(funcValue), color);
            }
        }
    }

}
