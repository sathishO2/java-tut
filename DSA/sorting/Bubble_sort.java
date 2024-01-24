import java.util.Arrays;

class Bubble_sort{
	public static void bubble(int[] a) {
		for(int i=a.length-1;i>=0;i--) {
			for(int j=0;j<i;j++) {
				if(a[j]>a[j+1]) {
					int t = a[j];
					a[j] = a[j+1];
					a[j+1] = t;
				}
			}
		}
	}
	public static void main(String[] arg) {
		int[] a = {4,2,8,1,5,7,3,9,6};
		bubble(a);
		System.out.println(Arrays.toString(a));
	}
}