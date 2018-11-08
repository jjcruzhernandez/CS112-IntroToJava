/** 
	A program that contains several methods to manipulate a set of images.
		author @ Jennifer J. Cruz Hernandez
**/	 
import java.io.File;
import java.util.Arrays;

public class ImageManipulator {

	public void removePhotobomb(String directory, String outputfile) { 
		File[] files = (new File(directory)).listFiles();
		int numFiles = 0;
		for (File file : files) {
			String filename = file.getName();
			if (filename.contains(".jpg")) {
				numFiles ++;
			}
		}
		Picture[] picArray = new Picture[numFiles];
		int count = 0;
		for (File file : files) {
			String filename = file.getName();
			if (filename.contains(".jpg")) {
				Picture picture = new Picture(file.getAbsolutePath());
				picArray[count] = picture;
				count ++;

			}
		}
		int width = picArray[0].getWidth();
		int height = picArray[0].getHeight();
		Picture newPic = new Picture(width, height);
		int r = 0;
		int b = 0;
		int g = 0;
		for (int w = 0; w < width; w++) {
			for (int h = 0; h < height; h++) {
				int[] red = new int[count];
				int[] green = new int[count];
				int[] blue = new int[count];
				for (int i = 0; i < picArray.length; i++) {
					Pixel pixel = picArray[i].getPixel(w, h);
					red[i] = pixel.getRed();
					green[i] = pixel.getGreen();
					blue[i] = pixel.getBlue();
				}
				Arrays.sort(red);	
				Arrays.sort(green);
				Arrays.sort(blue);
				r = red[(red.length)/2];
				g = green[(green.length)/2];
				b = blue[(blue.length)/2];
				Pixel newPixel = new Pixel(r,g,b);
				newPic.setPixel(w, h, newPixel);
			}		
		}	
	newPic.store(outputfile);
	}
	
	public void zoomMiddle(String inputfile, String outputfile) {
		Picture picture = new Picture(inputfile);
		int width = picture.getWidth();
		int height = picture.getHeight();
		Picture zoomPic = new Picture(width, height);
		int zoomStart = width/4;
		int zoomEnd = width - zoomStart;
		int zoomH = height/4;
		for (int h = 0; h < height-1; h = h+2) {
			int w = 0;
			for (zoomStart = (width/4); zoomStart < zoomEnd; zoomStart++) {		
				Pixel pixel = picture.getPixel(zoomStart,zoomH);
				if (w < width-1) {
					zoomPic.setPixel(w, h, pixel);
					zoomPic.setPixel(w + 1, h, pixel);
					zoomPic.setPixel(w, h + 1, pixel);
					zoomPic.setPixel(w + 1, h + 1, pixel);
					w = w + 2;	
				}
			}
		zoomH ++;	
		}				
	zoomPic.store(outputfile);			
	}
}
