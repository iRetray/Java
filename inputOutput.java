import java.util.Scanner;


public class kilometros {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	int edad;
	System.out.println("�Cual es la edad del paciente?");
	edad = input.nextInt();
	if(edad<=2) {
		System.out.print("El paciente es un beb�");
	}
	if(edad>2 && edad<=12) {
		System.out.print("El paciente es un ni�o");
	}
	if(edad>12 && edad<=19) {
		System.out.print("El paciente es un adolescente");
	}
	if(edad>19 && edad<=60) {
		System.out.print("El paciente es un adulto");
	}
	if(edad>60) {
		System.out.print("El paciente es un adulto mayor");
	}
	}
}