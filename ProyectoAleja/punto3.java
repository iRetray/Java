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
public class punto3 {
       /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        senador senadores[];
        senadores = new senador[10];
        int favor=0;
        int contra=0;
        for(int i =0;i<senadores.length;i++)
        {
            if(senadores[i].voto)
                favor++;
            else if(!senadores[i].voto)
                contra++;
            
        }
        System.out.println("El porcentaje a favor es de: "+(favor/senadores.length));
        System.out.println("El porcentaje en contra es de: "+(contra/senadores.length));
        System.out.println("El porcentaje indeferente es de: "+(favor+contra-senadores.length)/senadores.length);
    }
    public class senador
    {
        boolean voto;
        public senador(boolean voto)
        {
            this.voto=voto;
        }
    }
}
