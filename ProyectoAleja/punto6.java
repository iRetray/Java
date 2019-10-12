/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package aleja;

/**
 *
 * @author mateo
 */
public class punto6 {
       /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        paciente pacientes[]= new paciente[10];
        double menor=pacientes[0].getPeso();
        double mayor=pacientes[0].getPeso();
        double promedio=0;
        for(int i=1;i<pacientes.length;i++)
        {
            if(pacientes[i].getPeso()<menor)
                menor= pacientes[i].getPeso();
            if(pacientes[i].getPeso()>mayor)
                mayor= pacientes[i].getPeso();
            promedio+=pacientes[i].getPeso();
        }
        System.out.println("El mayor peso es de: "+mayor);
        
        System.out.println("El menor peso es de: "+menor);
        
        System.out.println("E peso promedio es de: "+promedio/pacientes.length);
    }
    public class paciente
    {
        double peso;
        public paciente(double peso)
        {
            this.peso=peso;
        }
        public double getPeso()
        {
            return peso;
        }
    }
}
