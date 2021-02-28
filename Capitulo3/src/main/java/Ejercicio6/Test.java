/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio6;

import java.util.Scanner;

/**
 *
 * @author jairo
 */
public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrse su numero");
        int x = sc.nextInt();
        
        MetricConversion a = new MetricConversion(x);
        System.out.println(a.inchToCm());
        System.out.println(a.galToLt());
        
    }
}
