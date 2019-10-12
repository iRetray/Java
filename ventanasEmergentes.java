import java.util.Scanner;

import javax.swing.JOptionPane;

public class kilometros {
	@SuppressWarnings({ "unused", "resource" })
	public static void main(String[] args) {
		/* Ejemplo de un commentario */
		String nombre;
		int edad;
		/* Scanner entradaDatos = new Scanner(System.in);
		System.out.println("Hola, Todo funciona correctamente :D");
		System.out.println("Ingresa tu nombre: ");
		nombre = entradaDatos.nextLine();
		System.out.println("Ingresa tu edad: ");
		edad = entradaDatos.nextInt();
		System.out.println("Bienvenido al sistema "+nombre+", joven apuesto de "+edad+" años."); */
		
		nombre = JOptionPane.showInputDialog("¿Cual es tu nombre?");
		System.out.println("Vale, te llamas Julian");
		
		/* Convertir la entrada por JOption a un valor */
		 edad = Integer.parseInt(JOptionPane.showInputDialog("¿Cual es tu edad?"));
		 
		 JOptionPane.showMessageDialog(null,"Tu nombre es: "+nombre+" y tu edad es: "+edad);
		 
		 int[] numeros = new int[3]; /* arreglo de 3 espacios */
	}
}