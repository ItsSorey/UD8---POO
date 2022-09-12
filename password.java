package tSystem;

import java.security.SecureRandom;

public class password {
	//Atributos de la clase
	private int longitud;
	private String contrase�a;
	private final String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
	private StringBuilder sb = new StringBuilder();
	private SecureRandom random = new SecureRandom();
	
	public password() {//contrase�a por defecto
		this.longitud = 8;
		this.contrase�a = "1A3b5C7d";
	}
	
	public String passwordGen(int longitud) {//generamos una contrase�a random con valores definidos por nosotros
		for (int i = 0; i < longitud; i++) {
			int randomIndex = random.nextInt(chars.length());
	        sb.append(chars.charAt(randomIndex));
	    }
		return sb.toString();
	}
	
	public int getLongitud() {return longitud;}
	public String getcontrase�a() {return contrase�a;}
	
	public void mostrarDatos() { //mostramos el default
		System.out.println("Longitud: "+ getLongitud()+
				"\nContrase�a: "+getcontrase�a());
	}
	
	public static void main(String[] args) {
		//Asignamos los valores que queremos
		int longitud=20;
		String contrase�a;
		//generamos una contrase�a default
		password kilian = new password();
		kilian.mostrarDatos();
		
		//generamos cotnrase�a random
		contrase�a=kilian.passwordGen(longitud); //asignamos la contrase�a a la generada aleatoriamente
		System.out.println("\n"+contrase�a); //mostramos la contrase�a
	 }
}
