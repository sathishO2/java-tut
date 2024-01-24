import java.util.HashMap;
import java.util.Map;

class Map_interface{
	public static void main(String[] arg) {
		Map<String,String> map = new HashMap<>();
		
		map.put("20btad036", "Sathish");
		map.put("20btad008", "Dhanush");
		map.put("20btad032", "Sabari");
		map.put("20btad011", "Hari");
		
		map.remove("20btad011");
		
		map.replace("20btad036", "sash");
		
		System.out.println(map.get("20btad036"));
		System.out.println(map.getOrDefault("20btad037", "Uknown"));
		
		System.out.println(map.keySet());
		System.out.println(map.values());
		System.out.println(map.entrySet());
		
		// entrySet() - can use iteration 
		for(var i: map.entrySet()) {
			System.out.println(i);
		}
		
		System.out.println(map.containsKey("20btad036"));
		System.out.println(map.containsValue("Sabari"));
		
		System.out.println(map);
	}
}