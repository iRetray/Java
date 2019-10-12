import java.util.Scanner;


public class kilometros {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		double kmsTotales = 0;
		double kmsDiarios;
		double kmsPromedio = 0;
		System.out.println("Kilometros semanales (7 dias)");
		for (int i = 1 ; i <= 7 ; i++) {
			System.out.println("Kilometros recorridos hoy: ");
			kmsDiarios = entrada.nextDouble();
			kmsTotales = kmsTotales + kmsDiarios;
		}
		System.out.println("Resultados");
		kmsPromedio = kmsTotales/7;
		System.out.println("Kilometros totales: "+kmsTotales);
		System.out.println("Kilometros promedio por dia: "+kmsPromedio);
	}
}