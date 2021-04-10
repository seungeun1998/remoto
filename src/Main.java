import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sn = new Scanner(System.in);
		//Declaro un array de 10 objetos de tipo cancion.
		ArrayList<Cancion> canciones = new ArrayList<Cancion>();
		
		//Llamo al método que rellena el array de canciones con canciones reales
		Main.rellenarCanciones(canciones);
		
		int opc=0;
		do {
			//Llamo al método que muestra el menú de nuestra aplicación.
			Main.mostrarMenu();
			opc=sn.nextInt();
			switch(opc) {
				case 1:System.out.println(Main.tituloCanciones(canciones));
				case 2:System.out.println(Main.canciones4Min(canciones));
				case 3:System.out.println(Main.mostrarTituloCanciones(canciones));
				case 4:System.out.println(Main.cancionMasLarga(canciones).getDuracion());
				case 5:System.out.println(Main.sumaDuraciones(canciones));
				case 6:System.out.println(Main.todasDuraciones(canciones));
				case 7:
				case 8:
			}		
		}while(opc!=8);
		

	
	}
	
	
	/**
	 * Método que muestra en pantalla el menú de opciones del ejercicio en el que estás.
	 */
	public static void mostrarMenu() {
    System.out.println("1. Mostrar la información de todas las canciones del arrayList(El método devolverá un arrayList con solo los títulos de las canciones).");
    System.out.println("2. Mostrar los títulos de las canciones que su duración no exceda de 4 minutos(El método devolverá un arrayList con solo los títulos de las canciones).");
    System.out.println("3. Mostrar la duración de la canción con mayor longitud en el título(El método devolverá una canción).");
    System.out.println("4. Muestra todos títulos de las canciones separados por comas. (El método devolverá un String).");
    System.out.println("5. Muestra la duración de la suma de todas las canciones. (El método devolverá la duración).");
    System.out.println("6. Muestra todas las duraciones de todas las canciones. (El método devolverá un array de duraciones).");
    System.out.println("7. Salir.");
	}
	
	/**
	 * Método que rellena el array de canciones con 12 canciones del fántastico grupo Indie Izal.
	 * @param canciones (Array de objetos de la clase Cancion)
	 */
	public static void rellenarCanciones(ArrayList<Cancion> canciones) {
		canciones.add(new Cancion("La mujer de verde", 2.1));
		canciones.add(new Cancion("Copacabana", 3.9));
		canciones.add(new Cancion("Pausa", 3));
		canciones.add(new Cancion("Que bién", 3));
		canciones.add(new Cancion("Pánico Práctico", 3.6));
		canciones.add(new Cancion("El pozo", 3));
		canciones.add(new Cancion("La increible historia del hombre que no sabía volar", 3));
		canciones.add(new Cancion("Autoterapia", 4.3));
		canciones.add(new Cancion("Bill Murray", 1));
		canciones.add(new Cancion("El baile", 6));
		canciones.add(new Cancion("Magia y efectos especiales", 4));
		canciones.add(new Cancion("Pequeña gran revolución", 2));
	}
	/**
	 * Método que devuelve un arrayList con los titulos de las canciones.
	 * @param canciones
	 * @return ArrayList con titulo de las canciones
	 */
	public static ArrayList tituloCanciones (ArrayList<Cancion> canciones) {
		ArrayList<String> tituloCanciones = new ArrayList<String>();
		for (int i=0;i<canciones.size();i++) {
			tituloCanciones.add(canciones.get(i).getTitulo());
		}
		return tituloCanciones;	
	}
	/**
	 * Metodo que devuelve los titulos de las canciones de un ArrayList cuya duración es menor a 4 min
	 * @param canciones
	 * @return ArrayList con los titulos de las canciones de un ArrayList.
	 */
	
	public static ArrayList canciones4Min(ArrayList <Cancion> canciones) {
		ArrayList<String> canciones4Min=new ArrayList<String>();
		for (int i=0;i<canciones.size();i++) {
			if (canciones.get(i).getDuracion()<4) {
				canciones4Min.add(canciones.get(i).getTitulo());
			}
		}
		return canciones4Min;
	}
	/**
	 * Metodo que indica cual es la cancion con el titulo mas largo
	 * @param canciones
	 * @return Devuelve una canción
	 */
	public static Cancion cancionMasLarga (ArrayList<Cancion> canciones) {
		int mayorPos=0;
		for (int i=0;i<canciones.size();i++) {
		if (i<=canciones.size()-2) {
			if (canciones.get(i).getTitulo().length()>canciones.get(i+1).getTitulo().length()){
				if	(canciones.get(mayorPos).getTitulo().length()<canciones.get(i).getTitulo().length()){
					mayorPos=i;
			}
			
			}
			if (canciones.get(i+1).getTitulo().length()>canciones.get(i).getTitulo().length()){
				if	(canciones.get(mayorPos).getTitulo().length()<canciones.get(i+1).getTitulo().length()){
					mayorPos=i+1;
				}
			}
			
		}
		
		}
		return canciones.get(mayorPos);
		
	}
	/**
	 * Metodo que suma la duracion de las canciones.
	 * @param canciones
	 * @return Duracion total de las canciones.
	 */
	public static double sumaDuraciones (ArrayList<Cancion> canciones) {
		double sumaDuracionCanciones=0;
		for (int i=0;i<canciones.size();i++) {
			sumaDuracionCanciones=sumaDuracionCanciones+canciones.get(i).getDuracion();
		}
		return sumaDuracionCanciones;
	}
	
/**
 * Metodo que muestra los titulos de las canciones separados por comas.
 * @param canciones
 * @return Un string con todos los titulos.
 */
	public static String mostrarTituloCanciones(ArrayList<Cancion> canciones) {
		String tituloCanciones="";
		for (int i=0;i<canciones.size();i++) {
			if (i==canciones.size()-1) {
				tituloCanciones=tituloCanciones+canciones.get(i).getTitulo()+".";
			}else {
				tituloCanciones=tituloCanciones+canciones.get(i).getTitulo()+",";
		}	
	}
		return tituloCanciones; 
  } 
	/**
	 * Metodo que devuelve todas las duraciones de las canciones
	 * @param canciones
	 * @return Devuelve un arrayList de duraciones.
	 */
	public static ArrayList todasDuraciones(ArrayList<Cancion> canciones) {
		ArrayList<Double> todasDuracionesCanciones=new ArrayList<Double>();
		for (int i=0;i<canciones.size();i++) {
			todasDuracionesCanciones.add(canciones.get(i).getDuracion());
		}
		
		return todasDuracionesCanciones;
	}
	
}