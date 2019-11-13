
public class CuentaBancaria {

    public double dineroDisponible;
    public double creditoDisponible;

    public CuentaBancaria(double dineroDisponible, double creditoDisponible) {
        this.dineroDisponible = dineroDisponible;
        this.creditoDisponible = creditoDisponible;
    }

    public void depositar(double cantidadDinero){  }
    public void retirar(double cantidadDiner){  }
    public boolean hayDineroSuficiente(){
        return false;
    }


}
