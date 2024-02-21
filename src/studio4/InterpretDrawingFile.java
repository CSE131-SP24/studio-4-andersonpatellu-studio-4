package studio4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JFileChooser;
import javax.swing.SwingUtilities;

import edu.princeton.cs.introcs.StdDraw;

/**
 * @author Dennis Cosgrove (http://www.cse.wustl.edu/~cosgroved/)
 */
public class InterpretDrawingFile {

	public static void main(String[] args) throws FileNotFoundException {
		JFileChooser chooser = new JFileChooser("resources");
		chooser.showOpenDialog(null);
		File f = new File(chooser.getSelectedFile().getPath());
		Scanner in = new Scanner(f); // making Scanner with a File
		String shape = in.next();
		int red = in.nextInt();
		int green = in.nextInt();
		int blue = in.nextInt();
		boolean filled = in.nextBoolean();
		double p1 = in.nextDouble();
		double p2 = in.nextDouble();
		double p3 = in.nextDouble();
		double p4 = in.nextDouble();
		
		StdDraw.setPenColor(red, green, blue);
		if (shape.equals("rectangle")) {
			if (filled) {
				StdDraw.filledRectangle(p1,p2,p3,p4);
			}
			else {
				StdDraw.rectangle(p1,p2,p3,p4);
			}
			

		}
		if (shape.equals("ellipse")) {
			if (filled) {
				StdDraw.filledEllipse(p1,p2,p3,p4);
			}
			else {
				StdDraw.ellipse(p1, p2, p3, p4);
			}
		}
		if (shape.equals("triangle")) {
			double p5 = in.nextDouble();
			double p6 = in.nextDouble();
			double xvalues [] = new double[3];
			xvalues[0]=p1;
			xvalues[1]=p3;
			xvalues[2]=p5;
			double yvalues [] = new double[3];
			yvalues[0]=p2;
			yvalues[1]=p4;
			yvalues[2]=p6;
			if (filled) {
				StdDraw.filledPolygon(xvalues,yvalues);
			
				
			}
			else {
				StdDraw.polygon(xvalues, yvalues);
			}
			}
					
	}
			
			

	}

