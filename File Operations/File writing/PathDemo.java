import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PathDemo {

	public static void main(String[] args) {
		// needs
		String location = "demoPath.txt";
		String content = "make a good path";
		
		Path p = Paths.get(location);
		
		try {
			Files.write(p,content.getBytes());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
