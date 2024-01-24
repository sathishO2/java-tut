
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;


public class BufferedWriterDemo {
	public static void main(String[] args) {
		// BufferedWriter:
		//	-> Easiest way
		//  -> better performance and wildly used
		
		// important things
		String location = "demoBufferedWriter.txt";
		String content = "B.Tech Artificial Intelligence";
		
		try{
			FileWriter fw = new FileWriter(location);
			BufferedWriter bfw = new BufferedWriter(fw);
			
			bfw.write(content);
			bfw.close();
			
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}
