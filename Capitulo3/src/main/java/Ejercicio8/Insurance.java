/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio8;

/**
 *
 * @author jairo
 */
public class Insurance {

    void calcular(int nacimiento, int actual) {
        int edad = actual - nacimiento;
        int decada = (int) (edad / 10);
        System.out.println("La cotización para el cliente es de: " + ((decada + 15) * 20));

    }

}
