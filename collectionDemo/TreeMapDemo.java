import java.util.Map;
import java.util.TreeMap;

class TreeMapDemo{
	public static void main(String[] arg) {
		Map<String,String> tm = new TreeMap<>();

		// it maintain sorted order by key
		// not allow null key

		tm.put("20btad036","sathish");
		tm.put("20btad041", "supreeth");
		tm.put("20btad008", "dhanush");
		tm.put("20btad039", "vishnu");
		tm.put("20btad001", "arun");

		System.out.println(tm);

	}
}
