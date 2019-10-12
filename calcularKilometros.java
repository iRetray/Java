import java.util.Scanner;

public class kilometros {
	@SuppressWarnings({ "unused", "resource" })
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	double kilometros;
	double valorKm;
	double costo;
	System.out.println("¿Cuantos kilometros se van a recorrer?");
	kilometros = input.nextDouble();
	System.out.println("¿Cual es el costo por kilometro?");
	valorKm = input.nextDouble();
	costo = kilometros * valorKm;
	System.out.println("El valor del pasaje es de: $"+costo);

	}
}
