package ComplexFunctionPlotter;

import ComplexFunctionPlotter.ComplexFunction.ComplexFunctionPlotter;
import ComplexFunctionPlotter.Plots.Screen;
import ComplexFunctionPlotter.Plots.PlotSettings;
import ComplexFunctionPlotter.Vectors.vec3;
//PS to edit complex function use ComplexFunction class
public class Main {
    private static final int X_SIZE =1080;
    private static final int Y_SIZE =720;
    private static final Screen SCREEN = new Screen(X_SIZE, Y_SIZE, true);

    public static void main(String[] args) {
        //setting grid scale([-scale; scale])
        PlotSettings.setScale(30);
        //setting plot background
        PlotSettings.setBackGround(new vec3(255));
        //drawing grid
        PlotSettings.drawGrip(new vec3(0));
        //plotting complex function
        ComplexFunctionPlotter.plotFunction(new vec3(255,0,0), 2);
        SCREEN.show();
    }
    public static Screen getScreen(){return SCREEN;}
    public static int getxSize(){return X_SIZE;}
    public static int getySize(){return Y_SIZE;}
}