package anonymousInnerClass;

public class InInterfaces {

	public static void main(String[] args) {
		parent child = new parent() {
			public void education(){
				System.out.println("My choice (form aic)");
			}
		};
		
		child.assets();
		child.education();
	}

}

interface parent{
	default void fun() {
		System.out.print("this is default function");
	}
	
	default void assets() {
		System.out.println("Assets from Parents");
	}
	
	void education();
}

class childd implements parent{

	@Override
	public void education() {
		// TODO Auto-generated method stub
		
	}
//	public void fun() {
//		System.out.println("from child");
//	}
}