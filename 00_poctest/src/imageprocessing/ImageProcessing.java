package imageprocessing;

import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;

public class ImageProcessing {

	public static void main(String[] args) {
		try {
			 BufferedImage img = ImageIO.read(new File("index.jpg"));    
			 
			    
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
