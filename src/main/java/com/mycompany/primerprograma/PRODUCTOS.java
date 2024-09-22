package com.mycompany.primerprograma;
//Autor Laura
import java.util.Scanner;

public class PRODUCTOS {
    
    public static void main (String args[])
    {
        double precio1,precio2,precio3,precio4;
        precio1=0;
        precio2=0;
        precio3=0;
        precio4=0;
                
        Scanner reader = new Scanner(System.in);
        System.out.print("Ingrese el precio del primer producto");
        precio1 = reader.nextDouble();
        System.out.print("Ingrese el precio del segundo producto");
        precio2 = reader.nextDouble();
        System.out.print("Ingrese el precio del tercer producto");
        precio3 = reader.nextDouble();
        System.out.print("Ingrese el precio del cuarto producto");
        precio4 = reader.nextDouble();
        
        //Realiza operaciones
        double suma= sumar(precio1, precio2, precio3,precio4);
        
        //muestra resultados
        System.out.println("Total a pagar:"+suma);
        
        reader.close();
    }
        //Operaciones
        public static double sumar(double precio1, double precio2, double precio3, double precio4)
        {
        return precio1 + precio2 + precio3 + precio4;
        }
}
