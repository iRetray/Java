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
public class punto4 {
    
       /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double ahorrosMes[]=new double[36];
        double cantActual=0;
        double cantTotal=0;
        for(int i=0;i<ahorrosMes.length;i++)
        {
            cantActual+=ahorrosMes[i];
            System.out.println("La cantidad actual en el mes "+i+" del ahorro es de:"+ cantActual);
            cantTotal=cantActual;
        }
        System.out.println("La cantidad total despues de 3 años es de: "+cantTotal);
    }
    
}
