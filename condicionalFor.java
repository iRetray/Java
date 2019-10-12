import java.util.Scanner;


public class kilometros {
	public static void main(String[] args) {
		double kilosTotales;
		Scanner input = new Scanner(System.in);
		double gramosDiarios;
		double gramosTotales = 0;
		for (int i = 1 ; i <= 10 ; i++) {
			System.out.println("¿Cuantos gramos se ganaron/perdieron hoy?");
			gramosDiarios = input.nextDouble();
			gramosTotales = gramosTotales + gramosDiarios;
		}
		System.out.println("Resultados semanales");
		kilosTotales = gramosTotales/1000;
		System.out.println("Gramos perdidos/ganados: "+gramosTotales);
		System.out.println("Kilos equivalentes: "+kilosTotales);
	}
}