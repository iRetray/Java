import java.util.ArrayList;

public class Empleado  extends Persona{

    public String IDEmpleado;
    public double añosTrabajados;

    public Empleado(String nombre, int cedula, ArrayList<CuentaBancaria> cuentasBancarias, ArrayList<Inversion> inversiones, String IDEmpleado, double añosTrabajados) {
        super(nombre, cedula, cuentasBancarias, inversiones);
        this.IDEmpleado = IDEmpleado;
        this.añosTrabajados = añosTrabajados;
    }

    public double darSalario() {
        return 0.0;
    }
}
