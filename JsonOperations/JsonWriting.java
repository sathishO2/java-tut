import org.json.simple.JSONObject;
import org.json.simple.JSONArray;

import java.io.FileWriter;
import java.io.IOException;

public class JsonWriting {
	public static void main(String[] args) throws IOException {
		// Create a JSON object
		JSONObject jso = new JSONObject();

		// Add key-value pairs to the JSON object
		jso.put("name", "sash");
		jso.put("age", 22);

		// Create a JSON array for skills
		JSONArray jarr = new JSONArray();
		jarr.add("JAVA");
		jarr.add("Python");
		jarr.add("MySql");

		// Add the array to the JSON object
		jso.put("skills", jarr);

		// Write the JSON object to a file named "myInfo.json"
		FileWriter fw = new FileWriter("myInfo.json");
		fw.write(jso.toJSONString());
		fw.close();
	}
}
