package anonymousInnerClass;

public class asMethodArg {
	public static void main(String[] args) {
		friend f = new friend();
		IManage me = new IManage() {
			@Override
			public void manage() {
				// TODO Auto-generated method stub
				
			}
		};
		f.canManage(me);
		
		// instead of this ^|
		
		f.canManage(new IManage() {
			public void manage() {
				System.out.print("Yep I can manage this :\\");
			}
		});
		
		// in thread concept 
		new Thread(new Runnable() {
			@Override
			public void run() {
				for(int i=0;i<5;i++) {
					System.out.println("start running");
				}
			}
		}).start();
	}
}

interface IManage{
	public abstract void manage();
}

class friend{
	// method Argument 
	public void canManage(IManage manageable) {
		manageable.manage();
	}
}