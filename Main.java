	import java.util.Scanner;
	import java.util.ArrayList;
	public class Main {
	public static void main(String[] args) {
			
			Scanner s= new Scanner(System.in);;
			int cantidad;
			String isbn = "", titulo = "";
			double precio;
			boolean control = true;
			OrdenLibros inventario = new OrdenLibros();
			int opc=0;
			
			do {
				System.out.println(" ========MENÚ======== ");
				System.out.println("<1> Ingresar libro");
				System.out.println("<2> Buscar libro por ISBN");
				System.out.println("<3> Vender libro");
				System.out.println("<4> Mostrar los tres libros más caros");
				System.out.println("<5> Mostrar todos los libros");
				System.out.println("<6> Fin del programa");
				System.out.print("Elija una opción: ");
				opc= s.nextInt();
				switch(opc) {
				case 1:
					s= new Scanner(System.in);
					System.out.println();
					System.out.println("Igrese los siguientes datos");
					System.out.print("ISBN: ");
					isbn = s.nextLine();
					System.out.print("Titulo del libro: ");
					titulo = s.nextLine();
					System.out.print("Precio del libro: ");
					precio = s.nextDouble();
					System.out.print("Cantidad: ");
					cantidad = s.nextInt();
					Libros libros = new Libros(isbn, titulo, precio, cantidad);
					if(inventario.getLibrobyIsbn(isbn) == null) {
						inventario.almacenar(libros);
						System.out.println("Los datos han sido ingresados");
					} else {
						System.out.println("ISNB Repitido, vuelva a intentar.");
					}
					break;
				case 2: 
					s= new Scanner(System.in);
					System.out.print("Ingresar el ISBN del libro que desee buscar: ");
					isbn= s.nextLine();
					if(inventario.getLibrobyIsbn(isbn) == null) {
						System.out.println("Lo sentimos, no existe libro con ese ISBN");
					} else {
						System.out.println("=========Información del libro=========");
						System.out.println(inventario.getLibrobyIsbn(isbn)+" ");
					}
					break;
				case 3: 
					s= new Scanner(System.in);
					System.out.print("Ingresar el ISBN del libro a vender: ");
					isbn= s.nextLine();
					System.out.print("Ingresar la cantidad de libros que se venderán: ");
					cantidad= s.nextInt();
					inventario.ventaLibros(isbn, cantidad);
					System.out.println();
					break;
				case 4: 
					System.out.println("========= LIBROS MÁS CAROS =========");
					inventario.OPrecios();
					inventario.getPrecio();
					System.out.println();
					break;
				case 5: 
					System.out.println("=========Información del libro=========");
					inventario.getTlibros();	
					System.out.println();
					break;
				case 6: 
					System.out.println("El programa ha finalizado");
					control=false;
					break;
				default:
					System.out.println("La opción no es correcta, vuelva intentarlo");
				}
			}while(control==true);
			
		}
	
	}
