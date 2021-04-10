import java.util.ArrayList;
import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sn = new Scanner(System.in);
		Scanner sc = new Scanner(System.in);
		String tituloDisco=""; int añoPublicacion=0; int codigoDisco=0; String productor="";
		String tituloCancion=""; double duracionCancion=0;
		ArrayList <Cancion> cancionesPrincipal=new ArrayList<Cancion>();
		Main2.rellenarCanciones(cancionesPrincipal);
		
		ArrayList<Disco> discos=new ArrayList<Disco>();
		ArrayList<Cancion> cancionesDisco1=new ArrayList<Cancion>();
		ArrayList<Cancion> cancionesDisco2=new ArrayList<Cancion>();
		ArrayList<Cancion> cancionesDisco3=new ArrayList<Cancion>();
		
	
	
		int opc=0;
		do {
			//Llamo al método que muestra el menú de nuestra aplicación.
			Main2.mostrarMenu();
			opc=sn.nextInt();
			switch(opc) {
				case 1:
					    //Creacion Disco 1
						System.out.println("Introduzca el titulo del disco:");
						tituloDisco=sc.nextLine();
						System.out.println("Introduzca el año de publicación:");
						añoPublicacion=sn.nextInt();
						System.out.println("Introduzca el codigo del disco:");
						codigoDisco=sn.nextInt();
						System.out.println("Introduzca el productor del disco:");
						productor=sc.nextLine();
						for (int k=0;k<3;k++) {
							System.out.println("Seleccione una de las siguientes canciones:");
							for (int j=0;j<cancionesPrincipal.size();j++) {
								cancionesPrincipal.get(j).mostrarDatos();
							}
							System.out.println("Introduzca el titulo de la canción a seleccionar:");
							tituloCancion=sc.nextLine();
							System.out.println("Introduzca su duración:");
							duracionCancion=sn.nextDouble();
							cancionesDisco1.add(new Cancion(tituloCancion,duracionCancion));	
						}
						discos.add(new Disco(tituloDisco,añoPublicacion,codigoDisco,productor,cancionesDisco1));	
						
					    //Creacion Disco 2
						System.out.println("Introduzca el titulo del disco:");
						tituloDisco=sc.nextLine();
						System.out.println("Introduzca el año de publicación:");
						añoPublicacion=sn.nextInt();
						System.out.println("Introduzca el codigo del disco:");
						codigoDisco=sn.nextInt();
						System.out.println("Introduzca el productor del disco:");
						productor=sc.nextLine();
						for (int k=0;k<3;k++) {
							System.out.println("Seleccione una de las siguientes canciones:");
							for (int j=0;j<cancionesPrincipal.size();j++) {
								cancionesPrincipal.get(j).mostrarDatos();
							}
							System.out.println("Introduzca el titulo de la canción a seleccionar:");
							tituloCancion=sc.nextLine();
							System.out.println("Introduzca su duración:");
							duracionCancion=sn.nextDouble();
							cancionesDisco2.add(new Cancion(tituloCancion,duracionCancion));	
						}
						discos.add(new Disco(tituloDisco,añoPublicacion,codigoDisco,productor,cancionesDisco2));
						
						//Creacion Disco 3
						System.out.println("Introduzca el titulo del disco:");
						tituloDisco=sc.nextLine();
						System.out.println("Introduzca el año de publicación:");
						añoPublicacion=sn.nextInt();
						System.out.println("Introduzca el codigo del disco:");
						codigoDisco=sn.nextInt();
						System.out.println("Introduzca el productor del disco:");
						productor=sc.nextLine();
						for (int k=0;k<3;k++) {
							System.out.println("Seleccione una de las siguientes canciones:");
							for (int j=0;j<cancionesPrincipal.size();j++) {
								cancionesPrincipal.get(j).mostrarDatos();
							}
							System.out.println("Introduzca el titulo de la canción a seleccionar:");
							tituloCancion=sc.nextLine();
							System.out.println("Introduzca su duración:");
							duracionCancion=sn.nextDouble();
							cancionesDisco3.add(new Cancion(tituloCancion,duracionCancion));	
						}
						discos.add(new Disco(tituloDisco,añoPublicacion,codigoDisco,productor,cancionesDisco3));	
					
					
					break;
				case 2:
					String tituloDelDisco="";
					System.out.println("Introduzca el titulo el disco:");
					tituloDelDisco=sc.nextLine();
					Main2.mostrarDisco(discos, tituloDelDisco);
					break;
				case 3:
					String titulo="";
					System.out.println("Introduzca el titulo de la cancion:");
					titulo=sc.nextLine();
					Main2.tituloDisco(discos, titulo);
				
				break;
				case 4:
					String letra="";
					System.out.println("Introduzca una letra:");
					letra=sc.nextLine();
					Main2.tituloDiscoLetraUsuario(discos, letra);
					break;
				case 5:
					
				case 6:
				case 7:
				case 8:
			}		
		}while(opc!=8);
		

	
	}
		
	

	
	
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
	
	public static void mostrarMenu() {
	    System.out.println("1. Crear disco 1, 2, 3 y meterlo en el arrayList.");
	    System.out.println("2. Mostrar los datos y las canciones del disco que quiera el usuario.");
	    System.out.println("3. Mostrar el título del disco donde se encuentre la canción pedida al usuario.(El método devolverá un String con el título del disco)");
	    System.out.println("4. Mostrar todos los títulos de los discos que empiezan por una letra pedida al usuario.(El método devolverá un arrayList con los títulos de los discos)");
	    System.out.println("5. Mostrar los datos del disco con mayor duración.(El método devolverá el disco con mayor duración)");
	    System.out.println("6. Salir.");
		}
	/**
	 * Metodo para mostrar todas las canciones de un disco pedido por usuario.
	 * @param discos
	 * @param tituloDelDisco
	 */
	public static void mostrarDisco(ArrayList <Disco> discos,String tituloDelDisco) {
		int entra=0; int cont=0;
		for (int i=0;i<discos.size();i++) {
			if (discos.get(i).getTitulo().equalsIgnoreCase(tituloDelDisco)) {
				entra++;
				for (int j=0;j<3;j++) {
					discos.get(i).getCanciones().get(cont).mostrarDatos();
					cont++;
				}
					
				}
						
		}
		if (entra==0) {
			System.out.println("El titulo que ha introducido no existe en ningún disco.");
		}
		
	}
	/**
	 * Metodo que recibe un titulo de una cancion y nos dice el titulo del disco al que pertenece.
	 * @param discos
	 * @param titulo
	 */
	public static void tituloDisco (ArrayList <Disco> discos,String titulo) {
		
		for (int i=0;i<discos.size();i++) {
			for (int j=0;j<discos.get(i).getCanciones().size();j++) {
				if(discos.get(i).getCanciones().get(j).getTitulo().equalsIgnoreCase(titulo)){
					System.out.println(discos.get(i).getTitulo());
				}
			}
		}
		
	}
	/**
	 * Metodo que pide al usuario una letra y muestra todos los titulos de los discos que empiezan por esa letra.
	 * @param discos
	 * @param letra
	 * @return
	 */
	public static ArrayList <String> tituloDiscoLetraUsuario (ArrayList <Disco> discos,String letra){
		
		ArrayList <String> titulosDiscos=new ArrayList<String>();
		for (int i=0;i<discos.size();i++) {
			if (discos.get(i).getTitulo().startsWith(letra)) {
				titulosDiscos.add(discos.get(i).getTitulo());
			}
		}
		return titulosDiscos;
		
	}
	
	



}
