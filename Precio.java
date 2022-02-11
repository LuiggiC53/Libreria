	import java.util.Comparator;
	
	public class Precio implements Comparator<Libros> {
		@Override
		public int compare(Libros l1, Libros l2) {
			if(l1.getPrecio()>l2.getPrecio()) {
				return -1;
			}
			if(l1.getPrecio()<l2.getPrecio()) {
				return 1;
			} else {
				return 0;
			}
		}
	
	}
