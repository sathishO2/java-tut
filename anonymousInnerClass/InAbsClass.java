package anonymousInnerClass;

public class InAbsClass {

	public static void main(String[] args) {
		Parent child = new Parent() {
			@Override
			void education(){
				System.out.print("Education is my choice! (from anonymous inner class)");
			}
		};
		
		child.assets();
		child.education();
	}

}

abstract class Parent{
	abstract void education();
	void assets() {
		System.out.println("Assets from Parent");
	}
}