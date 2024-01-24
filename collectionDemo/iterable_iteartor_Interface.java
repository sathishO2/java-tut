import java.util.Iterator;

class Main{
	public static void main(String[] arg) {
		GenericList<Integer> gl = new GenericList<Integer>();
		
		gl.add(1);
		gl.add(2);
		gl.add(3);
		gl.add(4);
		gl.add(5);
		
		for(var i: gl) {
			var d = i;
			System.out.println(d);
		}
	}
}

class GenericList<T> implements Iterable {
	private T[] items = (T[]) new Object[10];
	private int cou = 0;
	
	public void add(T value) {
		items[cou++] = value;
	}

	@Override
	public Iterator<T> iterator() {
		// TODO Auto-generated method stub
		return new ListIterator(this);
	}
	
	private class ListIterator implements Iterator<T>{
		private GenericList<T> list;
		private int c=0;
		
		public ListIterator(GenericList<T> list) {
			this.list = list;
		}
		
		@Override
		public boolean hasNext() {
			return c < list.cou;
		}
		
		@Override
		public T next() {
			return this.list.items[c++];
		}
		
	}
	
}