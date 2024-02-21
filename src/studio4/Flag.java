package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		StdDraw.setPenColor(255, 0, 0);
		StdDraw.filledRectangle(0.5, 0.7, 0.7, 0.1);
		StdDraw.setPenColor(0,200,0);
		StdDraw.filledRectangle(0.5,0.5,0.7,0.1);
		StdDraw.setPenColor(0,0,255);
		StdDraw.filledRectangle(0.5,0.3,0.7,0.1);
	}
}