
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JsonReading {

	public static void main(String[] args) throws IOException, ParseException {
		
		JSONParser jsp = new JSONParser();
		
		FileReader fr = new FileReader("myInfo.json");
		
		Object parseObject = jsp.parse(fr);
		
		JSONObject jsonObject = (JSONObject) parseObject;
		
		String name = (String) jsonObject.get("name");
		long age = (long) jsonObject.get("age");
		JSONArray skils = (JSONArray) jsonObject.get("skills");
		
		System.out.println("Name : "+name);
		System.out.println("Age : "+age);
		System.out.print("Skills are : "+String.join(", ", skils));
		
//		Iterator iter = skils.iterator();
//		while(iter.hasNext()) {
//			System.out.print(iter.next()+" ");
//		}
		
		
	}

}
