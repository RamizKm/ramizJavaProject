import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Date;


public class FileCloseCHeck {
	
	public static void main(String[] args) throws IOException {
		
		
		File ff=new File("c:\\personal\\check.txt");
		ff.createNewFile();
		
		FileOutputStream fos=new FileOutputStream(ff);
		ObjectOutputStream os=new ObjectOutputStream(fos);
		
		os.writeChars("text msg");
		
		fos.close();
		os.close();
		
		
		
	}

}
