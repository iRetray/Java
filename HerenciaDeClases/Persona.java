import java.util.ArrayList;

public class Persona {
	
	public String nombre;
	public int cedula;
	ArrayList<CuentaBancaria> cuentasBancarias = new ArrayList<CuentaBancaria>();
	ArrayList<Inversion> inversiones = new ArrayList<Inversion>();
	
	public Persona(String nombre, int cedula, ArrayList<CuentaBancaria> cuentasBancarias,
			ArrayList<Inversion> inversiones) {
		super();
		this.nombre = nombre;
		this.cedula = cedula;
		this.cuentasBancarias = cuentasBancarias;
		this.inversiones = inversiones;
	}
	
	public String darInformeDeUsuario() {
		String informe = "Usuario: "+nombre+", con cedula numero: "+cedula+", tiene "+cuentasBancarias.size()+" cuentas bancarias y "+inversiones.size()+" inversiones.";
		return informe;
	}
	
}
