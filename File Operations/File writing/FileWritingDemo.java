import java.io.FileWriter;
import java.io.IOException;

public class FileWritingDemo {
	public static void main(String[] arg) throws IOException {
	
//  Create a file 
//	Important for FileWriting is 
//		   1.Location 
//		   2.Content
//  FileWriter -> Straight forward, direct interaction with files,less performance
		
		String location = "DemoFileWriter.txt";
		String content = "Java is GOAT Language";
		
		FileWriter fw = new FileWriter(location);
		
		fw.write(content);
		fw.append("\nPython is Grate language");
		fw.close();
		
	}
}
