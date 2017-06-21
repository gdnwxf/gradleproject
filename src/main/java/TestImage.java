import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;

import org.junit.Test;

import net.coobird.thumbnailator.Thumbnails;
import net.coobird.thumbnailator.geometry.Positions;

/**
 * 
 */

/**
 * @author wch
 * @date 2017年6月21日 下午11:19:50
 */
public class TestImage {
	
	@Test
	public void testImage1() throws Exception {
		
		BufferedImage bi = new BufferedImage(64, 64, BufferedImage.TYPE_INT_RGB);
		Graphics2D g = bi.createGraphics();
		g.setColor(Color.LIGHT_GRAY);
		g.drawRect(0, 0, 64, 64);
		char[] data = "野马红尘".toCharArray();
		g.drawChars(data, 0, data.length, 5, 32);
		Thumbnails.of(new File("/Users/wch/common/test1.png")).scale(1f)
		.watermark(Positions.BOTTOM_RIGHT, bi, 1f)
		.toFile(new File("/Users/wch/common/test2.png"));
		
		MatrixToImageWriter.writeToFile(new  MultiFormatWriter().encode(contents,
                BarcodeFormat.QR_CODE, 450, 450, hints), "png", temp);
		
		
	}

	 @Test
	public void testImage() throws Exception {
		 
		 BufferedImage bi = new BufferedImage(64, 64, BufferedImage.TYPE_INT_RGB);
	        Graphics2D g = bi.createGraphics();
	        g.setColor(Color.LIGHT_GRAY);
	        g.drawRect(0, 0, 64, 64);
	        char[] data = "野马红尘".toCharArray();
	        g.drawChars(data, 0, data.length, 5, 32);
	        Thumbnails.of(new File("/Users/wch/common/test1.png")).scale(1f)
	                .watermark(Positions.BOTTOM_RIGHT, bi, 1f)
	                .toFile(new File("/Users/wch/common/test2.png"));
	        
	         
		
	}
	
}
