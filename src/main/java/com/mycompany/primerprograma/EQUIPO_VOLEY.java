package com.mycompany.primerprograma;
import java.util.Scanner;
public class EQUIPO_VOLEY {
    public static void main (String args[])
    {
        int peso, estatura, semestre;
        String nombre;
    
        Scanner reader = new Scanner(System.in);
        System.out.print("Ingrese su nombre: ");
        nombre = reader.nextLine();
        System.out.print("Ingrese su peso KG: ");
        peso = reader.nextInt();
        System.out.print("Ingrese su estatura CM: ");
        estatura = reader.nextInt();
        System.out.print("Ingrese su semestre: ");
        
        semestre = reader.nextInt();
        
        if (peso <80 && estatura >180 && semestre <=4){
            System.out.println("Bienvenido(a) "+ nombre +" cumple con los requisitos");
        }else{
            System.out.println(nombre + " No cumple con los requisitos");}
    }
}