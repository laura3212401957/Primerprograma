package com.mycompany.primerprograma;
import java.util.Scanner;
public class EDAD {
    public static void main (String args[]){
        
    int edad; //Edad de la persona
    
    Scanner reader = new Scanner(System.in);
    System.out.print("Ingrese su edad: ");
    edad=reader.nextInt();
    
    reader.close();
    esMayorEdad(edad);//llama al metodo
}
    public static void esMayorEdad(int edad) {
        if (edad>=100) {
            System.out.println("La persona está muerta");
        } else if (edad>=18){
            System.out.println("Es mayor de edad");
        } else {
            System.out.println("Es menor de edad");
        }
    }
}
