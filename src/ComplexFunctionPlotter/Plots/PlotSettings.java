package ComplexFunctionPlotter.Plots;

import ComplexFunctionPlotter.Complex.Complex;
import ComplexFunctionPlotter.Main;
import ComplexFunctionPlotter.Vectors.vec3;

//this is methods like draw line or grid and etc
public class PlotSettings {
    private static int scale=5;
    private static final double correct=(double) Main.getySize()/(double) Main.getxSize();
    //setting plot background(use before plotting)
    public static void setBackGround(vec3 color){
        for(int i=0;i<Main.getySize()-1;i++){
            for(int j=0;j<Main.getxSize()-1;j++){
                Main.getScreen().setPixel(j, i, color);
            }
        }
    }
    //draws grid
    public static void drawGrip(vec3 color) {
        for (int i = 0; i < scale * 2; i++) {
            for (int j = 0; j < Main.getySize(); j++)
                Main.getScreen().setPixel((int) (i * ((double) Main.getxSize() / ((double) scale * 2))), j,
                        color);

        }
        //this part was made 'cuz imag in "complex point" is not integer and varies depends on y size of screen, so it is impossible to draw it another way
        for (int i = 0; i < scale * correct; i++) {
            for (int j = 0; j < Main.getxSize(); j++)
                Main.getScreen().setPixel(j, (int) (i * ((double) Main.getxSize() / ((double) scale * 2))) + (Main.getySize() >> 1),
                        color);
        }
        for (int i = 0; i > (-1) * scale * correct; i--) {
            for (int j = 0; j < Main.getxSize(); j++)
                Main.getScreen().setPixel(j, (int) (i * ((double) Main.getxSize() / ((double) scale * 2))) + (Main.getySize() >> 1),
                        color);
        }
    }

    //draws line from a point to b point on screen in Main
    public static void drawLine(double ax, double ay, double bx, double by, vec3 color){
        double xDif=bx-ax;
        double yDif=by-ay;
        double len= Math.sqrt(xDif*xDif+yDif*yDif);
        double xStep=xDif/len;
        double yStep=yDif/len;
        for(int i=0;i<len;i++){
            Main.getScreen().setPixel((int)ax, (int)ay, color);
            ax+=xStep;
            ay+=yStep;
        }
    }
    //converts Complex numbers from [-scale; scale] to [0;screen size]
    public static void convertComplexToPoint(Complex c){
        c.setReal((c.getReal()/scale)/2*Main.getxSize()+(Main.getxSize()>>1));
        c.setImag((c.getImag()/((scale*2)*correct))*Main.getySize()+(Main.getySize()>>1));
    }
    //draws line from on "complex point" to other "complex point"
    public static void drawLine(Complex c, Complex z, vec3 color){
        convertComplexToPoint(c);
        convertComplexToPoint(z);
        drawLine(c.getReal(), c.getImag(), z.getReal(), z.getImag(), color);
    }

    public static int getScale(){return scale;}
    public static void setScale(int Scale){scale=Scale;}

}
