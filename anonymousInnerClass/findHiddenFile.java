import java.io.File;
import java.io.FileFilter;
import java.util.Arrays;

class findHiddenFile{
	public static void main(String[] arg) {
		FileFilter ff;
		File[] hf = new File("/home/sash/Desktop").listFiles(new FileFilter() {

			@Override
			public boolean accept(File file) {
				return file.isHidden();
			}
			
		});
		
		for(File i:hf) {
			System.out.println(i.getName());
		}
		//System.out.println(Arrays.toString(hf.listFiles()));
	}
}
