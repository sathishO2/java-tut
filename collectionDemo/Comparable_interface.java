import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Comparable_interface{
	public static void main(String[] arg) {
		List<User> cu = new ArrayList<>();
		cu.add(new User("b",2));
		cu.add(new User("c",3));
		cu.add(new User("a",1));
		
		System.out.println(cu);
		
		Collections.sort(cu);
		
		System.out.println(cu);
		
	}
}

class User implements Comparable<User>{
	String name;
	int id;
	
	User(String name,int id){
		this.name = name;
		this.id = id;
	}

	@Override
	public int compareTo(User o) {
		// TODO Auto-generated method stub
		return this.name.compareTo(o.name);
	}
	
	@Override
	public String toString() {
		return this.name+"("+this.id+")";
	}
	
	
}