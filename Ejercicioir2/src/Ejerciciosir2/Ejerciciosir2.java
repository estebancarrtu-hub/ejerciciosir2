package Ejerciciosir2;

import java.util.Scanner;

public class Ejerciciosir2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner (System.in);
		
		System.out.println("Ingresa cadena de varias palabras: ");
		String cadena = teclado.nextLine();
		
		String sinEspacios = cadena .replace(" ", " ");
		
		System.out.println("la frase es  : " + cadena);
		System.out.println("la frase sin espacios es  : " + sinEspacios);
		System.out.println("la frase es: " + sinEspacios.length());
		
		
		
		

		teclado.close();		
		
		
		
		
		
		
		
		
		
	}

}
