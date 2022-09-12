package tSystem;

import java.security.SecureRandom;

public class password {
	//Atributos de la clase
	private int longitud;
	private String contraseña;
	private final String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
	private StringBuilder sb = new StringBuilder();
	private SecureRandom random = new SecureRandom();
	
	public password() {//contraseña por defecto
		this.longitud = 8;
		this.contraseña = "1A3b5C7d";
	}
	
	public String passwordGen(int longitud) {//generamos una contraseña random con valores definidos por nosotros
		for (int i = 0; i < longitud; i++) {
			int randomIndex = random.nextInt(chars.length());
	        sb.append(chars.charAt(randomIndex));
	    }
		return sb.toString();
	}
	
	public int getLongitud() {return longitud;}
	public String getcontraseña() {return contraseña;}
	
	public void mostrarDatos() { //mostramos el default
		System.out.println("Longitud: "+ getLongitud()+
				"\nContraseña: "+getcontraseña());
	}
	
	public static void main(String[] args) {
		//Asignamos los valores que queremos
		int longitud=20;
		String contraseña;
		//generamos una contraseña default
		password kilian = new password();
		kilian.mostrarDatos();
		
		//generamos cotnraseña random
		contraseña=kilian.passwordGen(longitud); //asignamos la contraseña a la generada aleatoriamente
		System.out.println("\n"+contraseña); //mostramos la contraseña
	 }
}
