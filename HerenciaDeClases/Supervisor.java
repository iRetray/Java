import java.util.ArrayList;

public class Supervisor extends Empleado{

    public String zonaAsignada;
    public double salario;

    public Supervisor(String nombre, int cedula, ArrayList<CuentaBancaria> cuentasBancarias, ArrayList<Inversion> inversiones, String IDEmpleado, double añosTrabajados, String zonaAsignada, double salario) {
        super(nombre, cedula, cuentasBancarias, inversiones, IDEmpleado, añosTrabajados);
        this.zonaAsignada = zonaAsignada;
        this.salario = salario;
    }

    public double darVacaciones(){
        return 0.0;
    }
}
