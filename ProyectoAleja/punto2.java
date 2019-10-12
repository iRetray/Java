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
public class punto2 {
    
       /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        persona personas[];
        personas = new persona[10];
        int contador1=0,contador2=0,contador3=0;
        for(int i=0;i<personas.length;i++)
        {
            if(personas[i].getEdad()<18)
                contador1++;
            else if(personas[i].getEdad()<65 && personas[i].getEdad()>18)
                contador2++;
            else{
                contador3++;
            }
        }
        System.out.println("hay "+contador1+" niños.");
        System.out.println("hay "+contador2+" adultos.");
        System.out.println("hay "+contador3+" adultos mayores.");
    }
    
    public class persona
    {
        private int edad;
        public persona(int edad)
        {
            this.edad=edad;
        }
        public int getEdad()
        {
            return edad;
        }
    }
}
