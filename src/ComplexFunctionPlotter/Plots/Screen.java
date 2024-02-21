package ComplexFunctionPlotter.Plots;

import java.awt.image.BufferedImage;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

import ComplexFunctionPlotter.Vectors.vec3;
import ComplexFunctionPlotter.MathAdditions.Mat;
//a class shell for comfortable work with java.BufferedImage
public class Screen{
	private JFrame frame;
	private int xSize;
	private int ySize;
	private BufferedImage img;
	private boolean closeOnExit;
	public Screen(int xSize, int ySize, boolean closeOnExit){
		this.xSize=xSize;
		this.ySize=ySize;
		this.closeOnExit=closeOnExit;
		frame=new JFrame();
		if(closeOnExit)
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		img = new BufferedImage(xSize, ySize, BufferedImage.TYPE_INT_RGB);
	}
	public void setCloseOnExit(boolean val){
		if(val) frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		else frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}
	//update image
	public void refresh(){
		img = new BufferedImage(xSize, ySize, BufferedImage.TYPE_INT_RGB);
	}

	//convert RGB to int
	private int colorPoint(vec3 color){
		return (int)(Mat.clamp(0, 255, (int)color.x()))<<16 | (int)(Mat.clamp(0, 255, (int)color.y()))<<8 | (int)(Mat.clamp(0, 255, (int)color.z()));
	}

	//set pixel
	public void setPixel(int x, int y, vec3 color){
		img.setRGB(Mat.clamp(0, xSize-1, x), Mat.clamp(0, ySize-1,ySize-y-1), colorPoint(color));
	}
	//show image
	public void show(){
		frame.getContentPane().removeAll();
		frame.repaint();
		frame.getContentPane().add(new JLabel(new ImageIcon(img)));
		frame.pack();
		frame.repaint();
		frame.setVisible(true);
	}
}
