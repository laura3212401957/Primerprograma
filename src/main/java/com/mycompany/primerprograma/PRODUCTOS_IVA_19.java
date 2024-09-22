package com.mycompany.primerprograma;
import java.util.Scanner;
public class PRODUCTOS_IVA_19 {
public static void main(String [] args){
 double precio1,precio2,precio3,precio4,precio5;
                
        Scanner reader = new Scanner(System.in);
        System.out.print("Ingrese el precio del primer producto");
        precio1 = reader.nextDouble();
        System.out.print("Ingrese el precio del segundo producto");
        precio2 = reader.nextDouble();
        System.out.print("Ingrese el precio del tercer producto");
        precio3 = reader.nextDouble();
        System.out.print("Ingrese el precio del cuarto producto");
        precio4 = reader.nextDouble();
        System.out.print("Ingrese el precio del quinto producto");
        precio5 = reader.nextDouble();
        
        double suma= sumar(precio1, precio2, precio3,precio4, precio5);
        double iva = calcularIVA(suma,0.19);

        double totalConIVA = suma + iva;

        // Muestra el resultado
        System.out.println("El total sin IVA es: $" + suma);
        System.out.println("El IVA es: $" + iva);
        System.out.println("El total a pagar con IVA es: $" + totalConIVA);
        
        reader.close();
    }

    public static double sumar(double precio1, double precio2, double precio3, double precio4, double precio5) 
    {
        return precio1 + precio2 + precio3 + precio4 + precio5;
    }

    public static double calcularIVA(double suma, double tasaIVA) 
    {
        return suma * tasaIVA;
    }
}
