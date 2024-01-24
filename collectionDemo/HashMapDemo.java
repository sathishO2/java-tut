import java.util.HashMap;
import java.util.Map;

class HashMapDemo{
	public static void main(String[] arg) {
		Map<Character,Integer> map = new HashMap<Character, Integer>();

		map.put('c', 3);
		map.put('a', 1);
		map.put('d', 4);
		map.put('b', 2);
		map.put('e', 5);
		System.out.println(map);
		System.out.println(map.entrySet());

		map.remove('e');
		map.replace('b', -2);
		map.replace('b', -2, 2);


		System.out.println(map.keySet());
		System.out.println(map.values());
		System.out.println(map.getOrDefault('l', -1));
		System.out.println(map.containsKey('a'));
		System.out.println(map.containsValue(2));
		System.out.println(map.get('e'));

		for(Character i: map.keySet()) {
			System.out.println(map.get(i));
		}


	}
}