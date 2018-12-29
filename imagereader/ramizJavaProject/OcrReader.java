package ramizJavaProject;

import java.io.File;

import com.aspose.ocr.ImageStream;
import com.aspose.ocr.OcrEngine;

public class OcrReader {
	
	
	public static void main(String[] args) {
		
		try {
		System.out.println("OcrReader.main()");
		File f=new File("G:/skm_questiopapper/png_imag1.png");
		
OcrEngine ocr=new OcrEngine();

ocr.setImage(ImageStream.fromFile(f.getPath()));
if(ocr.process()) {
	System.out.println("OcrReader.main() process st");
	System.out.println("OcrReader.main() text o="+ocr.getText());
}
//System.out.println("OcrReader.main() text o="+ocr.getText());

	}
	catch(Exception e) {
		e.printStackTrace();
	}

	}
}
