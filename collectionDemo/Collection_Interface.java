import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

class Collection_interface{
	public static void main(String[] arg) {
		Collection<Integer> col = new ArrayList<>();
		
		col.add(1);
		col.add(2);
		col.add(3);
		col.add(4);
		col.add(5);
		Collections.addAll(col,6,7,8,9,10);
		col.remove(10);
		
		Collection<Integer> coll = new ArrayList<>();
		coll.addAll(col);
		
//		System.out.println(col);
//		System.out.println(coll);
		
		// to object of array
		var objArr = coll.toArray();
		// to integer of array;
		var intArr = coll.toArray(new Integer[10]);
		
		System.out.println(objArr[0]);
		
		System.out.println(intArr[2]-1);
		
		System.out.println(coll.equals(col));
		
	}
}