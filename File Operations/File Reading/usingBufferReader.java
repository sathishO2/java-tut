import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class usingBufferReader {

	public static void main(String[] args) {
		
		String location = "demoBufferedReader.txt";
		
		try {
			
			FileReader fr = new FileReader(location);
			BufferedReader bfr = new BufferedReader(fr);
			
			String op;
			// System.out.println(op);
			
			while((op = bfr.readLine()) != null) {
				System.out.println(op);
			}
			
			bfr.close();
		}catch(IOException e) {
			e.printStackTrace();
		}

	}

}
