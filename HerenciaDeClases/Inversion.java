
public class Inversion {

    public CasaInversionista casaDeInversion;
    public double nivelDeRiesgo;

    public Inversion(CasaInversionista casaDeInversion, double nivelDeRiesgo) {
        this.casaDeInversion = casaDeInversion;
        this.nivelDeRiesgo = nivelDeRiesgo;
    }

    public String reportarInversion(){
        String reporte = "Inversion en la casa de inversion "+casaDeInversion.nombre+" con un nivel de riesgo de "+nivelDeRiesgo;
        return reporte;
    }

}
