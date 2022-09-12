package tSystem;

public class electrodomestico {
	//Atributos de la clase
	private double precioBase;
	private String[] consumoEnergetico= {"A","B","C","D","F"};
	private String consumo;
	private double peso;
	private String[] colores= {"blanco","negro","rojo","azul","gris"};
	private String color;
	
	public electrodomestico() {//contructor atributos por defecto
		this.precioBase = 100;
		this.color = colores[0];
		this.consumo = consumoEnergetico[4];
		this.peso = 5;
	}
	
	public electrodomestico(double precioBase, double peso) {//contructor precio y peso, resto por defecto
		this.precioBase = precioBase;
		this.peso = peso;	
	}
	
	//Constructor todos atributos
	public electrodomestico(double precioBase, int color, double peso, int consumo) {
		this.precioBase = precioBase;
		this.color = colores[color];
		this.consumo = consumoEnergetico[consumo];
		this.peso = peso;
	}
	
	public double getPrecioBase() {return precioBase;}
	public String getColor() {return color;}
	public String getConsumoEnergetico() {return consumo;}
	public double getPeso() {return peso;}
	
	
	public void mostrarDatos() { //mostramos el default
		System.out.println("Precio Base: "+ getPrecioBase()+
				"\nColor: "+getColor()+
				"\nConsumo Energetico: "+getConsumoEnergetico()+
				"\nPeso: "+getPeso());
	}
	
	public static void main(String[] args) {
		//generamos un electordomestico default
		electrodomestico defecto = new electrodomestico();
		defecto.mostrarDatos();
		System.out.println();
		
		electrodomestico kilian = new electrodomestico(700,4,12.3,3); //creamos un electrodomestico con mi nombre y caracteristicas
		//para elejir el color/consumo como está limitado a Blanco-Gris/A-F etc lo he puesto en un Vector y el blanco está asociado 
		//al 0, negro al 1 etc...
		kilian.mostrarDatos();//mostramos los datos del nuevoi electrodomestico
	 }
}
