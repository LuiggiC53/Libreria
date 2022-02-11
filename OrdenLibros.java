import java.util.ArrayList;
import java.util.Collections;

public class OrdenLibros {
	private ArrayList<Libros> libros = new ArrayList<Libros>();
	private ArrayList<Libros> Precios = new ArrayList<Libros>();
	
	public void almacenar(Libros libro) {
		libros.add(libro);
	}
	
	public Libros getLibrobyIsbn(String isbn) {
		for(Libros l: libros) {
			if(l.getIsbn().equals(isbn)) {
				return l;
			}
		}
		return null;
	}

	public ArrayList<Libros> getLibros() {
		return libros;
	}	
	
	public void ventaLibros(String isbn, int cantidad) {
		if(getLibrobyIsbn(isbn) == null) {
			System.out.println("\nISBN incorrecto\n");}
		else
			if(getLibrobyIsbn(isbn).getCantidad() >= cantidad) {
				System.out.println("\n\t\t-- VENTA--");
				System.out.print("\nISBN: "+ isbn);
				System.out.print("\nTítulo: "+ getLibrobyIsbn(isbn).getTitulo());
				System.out.print("\nPrecio: "+ getLibrobyIsbn(isbn).getPrecio());
				System.out.print("\nCantidad: "+ cantidad);
				System.out.print("\nTotal a pagar: $"+
				getLibrobyIsbn(isbn).getPrecio()*cantidad+"\n");
				getLibrobyIsbn(isbn).setCantidad((getLibrobyIsbn(isbn).getCantidad() - cantidad));
				if(getLibrobyIsbn(isbn).getCantidad() == 0) {
					System.out.println("\nLibro agotado\n");
					libros.remove(libros.indexOf(getLibrobyIsbn(isbn)));
					}
			} else {
				System.out.println("\nLa cantidad requerida sobrepasa la cantidad de este libro");
				System.out.println("\nSolo hay "+getLibrobyIsbn(isbn).getCantidad()+" unidades\n");
			}
	}
	
	public void OPrecios() {
		Precios = new ArrayList<Libros>();
		for(int i=0; i<libros.size(); i++) {
			Precios.add(libros.get(i));
		}
		Collections.sort(Precios, new Precio());
		
	}
	
	public ArrayList<Libros> getPrecio() {
		for(int i=0; i<3; i++) {
			System.out.print(Precios.get(i) + "\n");
		}
		return null;
	}
	
	public String getTlibros() {
		for(int i=0; i<libros.size(); i++){
			System.out.println(libros.get(i));
		}
		return null;	
	}

}

