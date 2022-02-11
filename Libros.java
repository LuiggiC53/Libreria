
	public class Libros {
		private String isbn;
		private String titulo;
		private double precio;
		private int cantidad;
		
		public Libros(String isbn, String titulo, double precio, int cantidad) {
			this.isbn = isbn;
			this.titulo = titulo;
			this.precio = precio;
			this.cantidad = cantidad;
		}
		
		
		public String getIsbn() {
			return isbn;
		}
		public void setIsbn(String isbn) {
			this.isbn = isbn;
		}
		public String getTitulo() {
			return titulo;
		}
		public void setTitulo(String titulo) {
			this.titulo = titulo;
		}
		public double getPrecio() {
			return precio;
		}
		public void setPrecio(double precio) {
			this.precio = precio;
		}
		public int getCantidad() {
			return cantidad;
		}
		public void setCantidad(int cantidad) {
			this.cantidad = cantidad;
		}
		
		
		@Override
		public boolean equals(Object obj) {
			Libros l = (Libros)obj;
			return this.isbn.equals(l.isbn);
			
		}
		@Override
		public String toString() {
			return "ISBN: "+ this.isbn + "\t  Título: " + this.titulo + "\tCantidad: " + this.cantidad + "\tPrecio: " + this.precio;
		}
	}
