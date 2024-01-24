import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutPutStreamDemo {

	public static void main(String[] args) {
		
		// FileOutputStream -> to write raw byte array information
		
		// needs
		String location = "demoFOS.txt";
		String content = "Happy New Year!";
		
		try {
			
			FileOutputStream fos = new FileOutputStream(location);
			byte[] content_bytes = content.getBytes();
			fos.write(content_bytes);
			fos.close();
			
		}catch(IOException e) {
			e.printStackTrace();
		}
		
	}

}
