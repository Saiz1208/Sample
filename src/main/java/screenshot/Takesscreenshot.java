package screenshot;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.concurrent.TimeUnit;
import javax.imageio.ImageIO;
import org.apache.poi.util.Units;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFRun;
  
public class Takesscreenshot {

	
	    public static void capture() throws FileNotFoundException {
	    
			try {

	            XWPFDocument docx = new XWPFDocument();
	            XWPFRun run = docx.createParagraph().createRun();
	            FileOutputStream out = new FileOutputStream("C:/Users/SATHISH KUMAR S/eclipse-workspace/Sample/Capture/Test"+System.currentTimeMillis()+".docx");
	            captureScreenShot(docx, run, out);
	            TimeUnit.SECONDS.sleep(1);
	            docx.write(out);
	            out.flush();
	            out.close();
	            docx.close();
	            System.out.println("Screenshot taken=>");
	            }

	         catch (Exception e) {
	            e.printStackTrace();
	        }}
	    

	    public static void captureScreenShot(XWPFDocument docx, XWPFRun run, FileOutputStream out) throws Exception {

	        String screenshot_name = System.currentTimeMillis() + ".jpeg";
	        BufferedImage image = new Robot()
	                .createScreenCapture(new Rectangle(Toolkit.getDefaultToolkit().getScreenSize()));
	        File file = new File("C:/Users/SATHISH KUMAR S/eclipse-workspace/Sample/Capture/" + screenshot_name);
	        ImageIO.write(image, "jpeg", file);
	        InputStream pic = new FileInputStream("C:/Users/SATHISH KUMAR S/eclipse-workspace/Sample/Capture/" + screenshot_name);
	        run.addBreak();
	        run.addPicture(pic, XWPFDocument.PICTURE_TYPE_PNG, screenshot_name, Units.toEMU(500), Units.toEMU(280));
	        pic.close();
	        file.delete();
	    }
	    }
