import java.util.LinkedHashMap;
import java.util.HashMap;
import java.util.Map;

class LinkedHashMapDemo{
	public static void main(String[] arg) {
		Map<String,String> lhm = new LinkedHashMap<>();
		// in maintain order
		lhm.put("bat man", "bruce wayne");
		lhm.put("super man", "clark");
		lhm.put("Atmen", "str");

		System.out.println(lhm);


		// it not maintains insertion order
		Map<String,String> hm = new HashMap<>();
		hm.put("bat man", "bruce wayne");
		hm.put("super man", "clark");
		hm.put("Atmen", "str");

		System.out.println(hm);

	}
}