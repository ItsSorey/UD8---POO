package tSystem;

public class serie {
	//Atributos de la clase
	private String titulo;
	private int numeroTemporadas;
	private boolean entregado;
	private String genero;
	private String creador;
		
	public serie() {//contructor atributos por defecto
		this.titulo = "";
		this.numeroTemporadas = 3;
		this.entregado = false;
		this.genero = "";
		this.creador = "";
	}
	
	public serie(String titulo, String creador) {//contructor titulo y creador, resto por defecto
		this.titulo = titulo;
		this.creador = creador;
	}
		
	//Constructor todos atributos
	public serie(String titulo, int numeroTemporadas, boolean entregado, String genero, String creador) {
		this.titulo = titulo;
		this.numeroTemporadas = numeroTemporadas;
		this.entregado = entregado;
		this.genero = genero;
		this.creador = creador;
	}
	
	public String getTitulo() {return titulo;}
	public int getNumeroTemporadas() {return numeroTemporadas;}
	public boolean getEntregado() {return entregado;}
	public String getGenero() {return genero;}
	public String getCreador() {return creador;}
	
	
	public void mostrarDatos() { //mostramos
		System.out.println("Titulo: "+ getTitulo()+
			"\nNumero de Temporadas: "+getNumeroTemporadas()+
			"\nEntregado: "+getEntregado()+
			"\nGenero: "+getGenero()+
			"\nCreador: "+getCreador());
		}
		
	public static void main(String[] args) {
		//generamos una serie default
		serie defecto = new serie();
		defecto.mostrarDatos();
		System.out.println();
		
		serie kilian = new serie("T-Systems",6,true,"Acción","Kilian Martin Segura"); 
		kilian.mostrarDatos();//mostramos los datos de la nueva serie
	 }
}

