/**
	A program that will call methods on ImageManipulator.java
		@author Jennifer J. Cruz Hernandez
**/
public class ImageDriver {
	
	public static void main(String[] args) {
		if(args.length != 1) {					
				System.out.println("Usage: Missing Argument");
				System.exit(1);				
		}
		String inputFile = args[0];
		ImageManipulator imageManipulator = new ImageManipulator();
		imageManipulator.removePhotobomb(inputFile, "nophotobomb.jpg");
		imageManipulator.zoomMiddle("nophotobomb.jpg", "zoomed.jpg");
	}
}
