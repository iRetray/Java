public class CInversion extends CuentaBancaria {

    public double dineroMinimo;
    public double valorPrimerDeposito;
    public double porcentajeDeAhorroAnual;

    public CInversion(double dineroDisponible, double creditoDisponible, double dineroMinimo, double valorPrimerDeposito, double porcentajeDeAhorroAnual) {
        super(dineroDisponible, creditoDisponible);
        this.dineroMinimo = dineroMinimo;
        this.valorPrimerDeposito = valorPrimerDeposito;
        this.porcentajeDeAhorroAnual = porcentajeDeAhorroAnual;
    }

    public boolean hayMasDeQuinientos(){
        return false;
    }

    public  double darInteresMensual(){
        return 0.0;
    }
}
