/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.rodrigocardenas.model;

import static java.lang.Math.pow;
import static java.lang.Math.sin;

public class Datos 
{
    public double gravedad = 9.8;
    public double altura;
    public double alcance;

    public Datos() 
    {
        
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getAlcance() {
        return alcance;
    }

    public void setAlcance(double alcance) {
        this.alcance = alcance;
    }

    public double calculoAlcance (double velocidad, double angulo)
    {
        double calculo = pow(velocidad, 2) * sin(2 * angulo) / gravedad;
        return calculo;
    }
    
    public double calculoAltura(double velocidad, double angulo)
    {
        double calculo = pow(velocidad,2) * pow(sin(angulo),2)/2*gravedad;
        return calculo;
    }
    
}
