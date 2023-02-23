package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		
		//Argentina
		StdDraw.setPenColor(Color.BLACK);
		StdDraw.filledRectangle(0.5, 0.5, 0.45, 0.25);
		
		Color lightBlue = new Color(116, 172, 223);
		StdDraw.setPenColor(lightBlue);
		StdDraw.filledRectangle(0.23, 0.63, 0.13333333,0.06666666);
		
		StdDraw.setPenColor(Color.WHITE);	
		StdDraw.filledRectangle(0.23, 0.5, 0.13333333,0.06666666);
		
		StdDraw.setPenColor(lightBlue);
		StdDraw.filledRectangle(0.23, 0.3666666, 0.13333333,0.06666666);
		
		Color argentinaYellow = new Color(246, 180, 14);
		StdDraw.setPenColor(argentinaYellow);
		StdDraw.filledCircle(0.23, 0.5, 0.05);

		
		//Poland
		StdDraw.setPenColor(Color.WHITE);
		StdDraw.filledRectangle(0.77, 0.59, 0.132, 0.107);
		
		StdDraw.setPenColor(Color.RED);
		StdDraw.filledRectangle(0.77, 0.4, 0.1333333, 0.1);
		
		
		
		//Croatia
		StdDraw.setPenColor(Color.RED);
		StdDraw.filledRectangle(0.5, 0.63, 0.13333333,0.06666666);
		
		StdDraw.setPenColor(Color.WHITE);	
		StdDraw.filledRectangle(0.5, 0.5, 0.13333333,0.06666666);
		
		Color darkBlue = new Color(23, 23, 150);
		StdDraw.setPenColor(darkBlue);
		StdDraw.filledRectangle(0.5, 0.3666666, 0.13333333,0.06666666);
		
		StdDraw.setPenColor(Color.RED);
		//middle row
		StdDraw.filledRectangle(0.5, 0.5, 0.01, 0.01);
		StdDraw.filledRectangle(0.54, 0.5, 0.01, 0.01);
		StdDraw.filledRectangle(0.46, 0.5, 0.01, 0.01);
		
		//top row
		StdDraw.filledRectangle(0.52, 0.52, 0.01, 0.01);
		StdDraw.filledRectangle(0.48, 0.52, 0.01, 0.01);
		
		//bottom row
		StdDraw.filledRectangle(0.52, 0.48, 0.01, 0.01);
		StdDraw.filledRectangle(0.48, 0.48, 0.01, 0.01);

		//bottom bottom
		StdDraw.filledRectangle(0.5, 0.46, 0.01, 0.01);


	}
}