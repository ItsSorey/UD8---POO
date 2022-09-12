package tSystem;


public class persona {
	//Atributos de la clase
	private String nombre;
	private int edad;
	private String DNI;
	private String sexo;
	private double peso;
	private double altura;
	
	//Constructor por defecto
	public persona() {
		this.nombre = "";
		this.edad = 0;	
		this.sexo = "H";
		this.peso = 0;
		this.altura = 0;
	}
	
	//Constructor por nombre edad y sexo, resto por defecto
	public persona(String nombre, int edad, String sexo) {
		this.nombre = nombre;
		this.edad = edad;	
		this.sexo = sexo;
	}
	
	//Constructor todos atributos
	public persona(String nombre, int edad, String sexo, String DNI, double peso, double altura) {
		this.nombre = nombre;
		this.edad = edad;
		this.DNI = DNI;
		this.sexo = sexo;
		this.peso = peso;
		this.altura = altura;
	}
	
	//hacemos get ya que es privado
	public String getNombre() {return nombre;}
	public int getEdad() {return edad;}
	public String getDNI() {return DNI;}
	public String getSexo() {return sexo;}
	public double getPeso() {return peso;}
	public double getAltura() {return altura;}
	
	public void mostrarDatos() {
		System.out.println("Nombre: "+ getNombre()+
		"\nEdad: "+getEdad()+
		"\nSexo: "+ getSexo()+
		"\nDNI: "+getDNI()+
		"\nPeso: "+ getPeso()+
		"\nAltura: "+ getAltura()+"\n");
	}
	public static void main(String[] args) {
		persona Kilian = new persona();
		//persona Kilian = new persona("Kilian",21,"H","39945339C",60,176);
		Kilian.mostrarDatos();
	 }
}