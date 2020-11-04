/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo02;

import java.util.Scanner;


/**
 *
 * @author macbookair
 */
public class Ejercicio04 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String nombre;
        String apellido;
        String ciudad;
        String país;
        String nacimiento;
        
        System.out.println("Ingrese el nombre por favor del estudiante");
        nombre = entrada.nextLine();
        
        System.out.println("Ingrese el apellido por favor del estudiante");
        apellido = entrada.nextLine();
        
        System.out.println("Ingrese la ciudad por favor del estudiante");
        ciudad = entrada.nextLine();
        
        System.out.println("Ingrese el país por favor del estudiante");
        país = entrada.nextLine();
        
        System.out.println("Ingrese el naciemiento por favor del estudiante");
        nacimiento = entrada.nextLine();
        
        System.out.printf("Datos del estudiante\n%s\n%s\n%s\n%s\n%s\n",   
        nombre,
        apellido,
        ciudad,
        país,
        nacimiento);
        
        
        
   
    }
    
}
