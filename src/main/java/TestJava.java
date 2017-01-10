import org.bytedeco.javacpp.opencv_core.IplImage;
import org.bytedeco.javacv.*;
import static org.bytedeco.javacpp.opencv_core.cvFlip;


public class TestJava {
	

	public static void main(String[] args) {
		CanvasFrame canvas = new CanvasFrame("Webcam Test");
		canvas.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE); 
		
		
		OpenCVFrameConverter.ToIplImage frameToIplConverter = new OpenCVFrameConverter.ToIplImage();
		
		FrameGrabber grabber = new OpenCVFrameGrabber(""); 
		try {
			grabber.start();
			Frame frame;
			
			while (true) {
				frame = grabber.grab();
				IplImage image = frameToIplConverter.convert(frame);
				
				
				
				canvas.showImage(frame);
			}
			
		} catch (Exception e) {
			System.out.println("Error occured");
		}
		 
	}
}
