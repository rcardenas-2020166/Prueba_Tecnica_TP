
package org.rodrigocardenas.view;

import java.util.Scanner;
import org.rodrigocardenas.model.Datos;

public class PrincipalView 
{
    Scanner sc = new Scanner(System.in);
    Datos data = new Datos();
    
    public double velocidadInicial;
    public double angulo;
    
    public void menu()
    {
        System.out.println(" Bienvenido al Sistema");
        System.out.println(" ------------------------\n");
        System.out.println(" Ingrese sus Datos");
        System.out.println(" ------------------------\n");

        System.out.println(" Velocidad Inicial");
        System.out.print(" ");
        velocidadInicial = sc.nextDouble();
        
        System.out.println(" Ángulo");
        System.out.print(" ");
        angulo = sc.nextDouble();
        
        data.setAlcance(data.calculoAlcance(velocidadInicial, angulo));
        System.out.println(data.getAlcance());
        
        data.setAltura(data.calculoAltura(velocidadInicial, angulo));
        System.out.println(data.getAltura());
        
        System.out.println("\n CÁLCULOS");
        System.out.println(" ------------------------\n");
        
        System.out.println(" Alcance : " + data.getAlcance());
        System.out.println(" Altura : " + data.getAltura());
        System.out.println("Gráfica \n");
        
        int grafica = (int) (data.getAltura());
        
       
        for(int altura = 1; altura <= grafica; altura++)
        {
            //Espacios en blanco
            for(int blancos = 1; blancos<=grafica-altura; blancos++){
                System.out.print(" ");
            }
 
            //Asteriscos
            for(int asteriscos=1; asteriscos<=(altura*2)-1; asteriscos++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    } 
}
