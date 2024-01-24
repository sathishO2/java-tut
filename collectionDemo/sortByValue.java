import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

class sortByValue{
	public static void main(String[] arg) {
		HashMap<Character,Integer> map = new HashMap<>();
		map.put('c', 3);
		map.put('d', 2);
		map.put('a', 5);
		map.put('b', 4);
		map.put('e', 1);
		
		System.out.println(map);
		
		List<Entry<Character,Integer>> temp = new ArrayList<>();
		
		for(Entry<Character,Integer> e:map.entrySet()) {
			temp.add(e);
		}
		
		Comparator<Entry<Character, Integer>> c = new Comparator<Entry<Character,Integer>>() {

			@Override
			public int compare(Entry<Character, Integer> o1, Entry<Character, Integer> o2) {
				// TODO Auto-generated method stub
				return o1.getValue().compareTo(o2.getValue());
			}
			
		};
		
		Collections.sort(temp,c);
		//Collections.sort(temp,new Comparator());
		Map<Character,Integer> sortmap = new LinkedHashMap<>();
		for(Entry<Character,Integer> e:temp) {
			sortmap.put(e.getKey(),e.getValue());
		}
		System.out.println(temp);
		
		
		
		
	}
}