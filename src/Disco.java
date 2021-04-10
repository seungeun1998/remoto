import java.util.ArrayList;
public class Disco {
	private String titulo;
	private int a�oPublicacion;
	private int codigoDisco;
	private String productor;
	private ArrayList<Cancion> canciones;
	
	public Disco () {
		
	}
	
	public Disco (String titulo,int a�oPublicacion,int codigoDisco,String productor,ArrayList<Cancion> canciones) {
		this.titulo=titulo;
		this.a�oPublicacion=a�oPublicacion;
		this.codigoDisco=codigoDisco;
		this.productor=productor;
		this.canciones=canciones;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getA�oPublicacion() {
		return a�oPublicacion;
	}

	public void setA�oPublicacion(int a�oPublicacion) {
		this.a�oPublicacion = a�oPublicacion;
	}

	public int getCodigoDisco() {
		return codigoDisco;
	}

	public void setCodigoDisco(int codigoDisco) {
		this.codigoDisco = codigoDisco;
	}

	public String getProductor() {
		return productor;
	}

	public void setProductor(String productor) {
		this.productor = productor;
	}

	public ArrayList<Cancion> getCanciones() {
		return canciones;
	}

	public void setCanciones(ArrayList<Cancion> canciones) {
		this.canciones = canciones;
	}
	
	/**
	 * Metodo para mostrar todos los datos.
	 * @return Devuelve un String con los datos.
	 */
	public void mostrarDatos() {
		String datos="";
		datos="Titulo:" +this.titulo+". A�o publicaci�n: "+this.a�oPublicacion+". Codigo de disco: "+this.codigoDisco+". Productor; "+this.productor+". Canciones; "+this.canciones;
		System.out.println(datos);
	}

}
