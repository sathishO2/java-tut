package anonymousInnerClass;

//anonymous inner class
class InConcreteClass{
	public static void main(String[] arg) {
		// concrete class
		parent child = new parent() {
			@Override
			void marage() {
				System.out.println("Love Marage (from anonymous class) ");
			}
			@Override
			void education() {
				System.out.println("My life My rules (from anonymous class)");
			}
		};
		
		child.assets();
		child.education();
		child.marage();
		
	}
}

class parent{
	void assets(){
		System.out.println("assests from parents");
	}
	void education() {
		System.out.println("Education from parents");
	}
	void marage() {
		System.out.println("Arrang marrage");
	}
}

class child extends parent{
	void marage() {
		System.out.println("Love marrage");
	}
}
