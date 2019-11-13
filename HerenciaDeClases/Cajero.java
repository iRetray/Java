import java.util.ArrayList;

public class Cajero extends Empleado{

    public String cajaAsignada;
    public double salario;

    public Cajero(String nombre, int cedula, ArrayList<CuentaBancaria> cuentasBancarias, ArrayList<Inversion> inversiones, String IDEmpleado, double añosTrabajados, String cajaAsignada, double salario) {
        super(nombre, cedula, cuentasBancarias, inversiones, IDEmpleado, añosTrabajados);
        this.cajaAsignada = cajaAsignada;
        this.salario = salario;
    }

    public double darVacaciones(){
        return 0.0;
    }
}
