import java.util.ArrayList;

public class Recepcionista extends Empleado{

    public String puertaAsignada;
    public double salario;

    public Recepcionista(String nombre, int cedula, ArrayList<CuentaBancaria> cuentasBancarias, ArrayList<Inversion> inversiones, String IDEmpleado, double añosTrabajados, String puertaAsignada, double salario) {
        super(nombre, cedula, cuentasBancarias, inversiones, IDEmpleado, añosTrabajados);
        this.puertaAsignada = puertaAsignada;
        this.salario = salario;
    }

    public double darVacaciones(){
        return 0.0;
    }
}
