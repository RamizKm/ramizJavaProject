package ramizJavaProject;

import java.io.File;

import org.apache.xmlgraphics.image.loader.cache.ImageKey;

import net.sourceforge.tess4j.ITesseract;
import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.util.LoadLibs;

public class ImgReader {
	
	
	public static void main(String[] args) throws Exception{
		System.out.println("ImgReader.main()");
		File f=new File("G:/skm_questiopapper/png_imag1.png");
		System.out.println("ImgReader.main() f="+f);
	
		ITesseract instance = new Tesseract();  
		instance.setDatapath(f.getPath());
		
	//	File fd=LoadLibs.extractTessResources("G:/ramiz_work/gitprojects/ramizJavaProject/tessdata");
		instance.setDatapath(f.getPath());
		System.out.println("ImgReader.main() after getting path fdpath="+f.getPath());
		try {
		String result=instance.doOCR(f);
		
		}catch(Exception e) {
			e.printStackTrace();
			
			
			
			
		}
	}
	
	
	

}
