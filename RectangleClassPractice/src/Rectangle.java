// Atif Mahmud 
// 31st May 2017
// Trying out the Rectangle class from the Big Java Book, quite similar to the online Honda Accord example

import java.util.*;
import java.lang.Object;
import java.awt.geom.Rectangle2D;

public class Rectangle {
	int x;
	int y;
	int height;
	int width;
	
	// Constructor for a rectangle
	public Rectangle(int x, int y, int height, int width){
		this.x = x;
		this.y = y;
		this.height = height;
		this.width = width; 
	}
	
	// Prints the fields of the Object: It was changed from private to public after moving
	// the main method to a different class
	public static void printRect(Rectangle box){
		System.out.printf("x coordinate is: %d\ny coordinate is: %d\nHeight is: %d\nWidth is: %d\n\n", box.x, box.y, box.height, box.width);
	}
	
	// MAIN METHOD
	public static void main(String [] args){
		Rectangle box = new Rectangle(5,5,10,10);
		printRect(box);
	}

}
