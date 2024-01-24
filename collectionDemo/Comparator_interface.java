import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Comparator_interface{
	public static void main(String[] arg) {
		List<User> cu = new ArrayList<>();
		cu.add(new User("b","e3"));
		cu.add(new User("c","e2"));
		cu.add(new User("a","e1"));
		
		System.out.println(cu);
		
		// Collections.sort(cu);
		
		Collections.sort(cu, new compareEmail());
		
		System.out.println(cu);
		
	}
}

class compareEmail implements Comparator<User>{

	@Override
	public int compare(User u1, User u2) {
		// TODO Auto-generated method stub
		return u1.email.compareTo(u2.email);
	}
	
	
	
}

class User implements Comparable<User>{
	String name;
	int id;
	String email;
	
	User(String name,String email){
		this.name = name;
		this.email = email;
	}

	@Override
	public int compareTo(User o) {
		// TODO Auto-generated method stub
		return this.name.compareTo(o.name);
	}
	
	@Override
	public String toString() {
		return this.name+"("+this.email+")";
	}
	
	
}