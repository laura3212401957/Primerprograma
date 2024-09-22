package com.mycompany.primerprograma;
import java.util.Scanner;
public class PRODUCTOS_IVA_COMPRA {
    public static void main (String args[])
    {
        double precio1,precio2,precio3,precio4;
                
        Scanner reader = new Scanner(System.in);
        System.out.print("Ingrese el precio del primer producto");
        precio1 = reader.nextDouble();
        System.out.print("Ingrese el precio del segundo producto");
        precio2 = reader.nextDouble();
        System.out.print("Ingrese el precio del tercer producto");
        precio3 = reader.nextDouble();
        System.out.print("Ingrese el precio del cuarto producto");
        precio4 = reader.nextDouble();
        
        double suma= sumar(precio1, precio2, precio3,precio4);
        double iva = calcularIVA(suma,0.16);
        double totalConIVA = suma + iva;

        // Muestra el resultado
        System.out.println("El total sin IVA es: $" + suma);
        System.out.println("El IVA es: $" + iva);
        System.out.println("El total a pagar con IVA es: $" + totalConIVA);
        
        if(totalConIVA>=1000000){
        System.out.println("Compra Alta");
        } else if (totalConIVA>=800000){
        System.out.println("Compra Media");
        } else if(totalConIVA>=500000){
        System.out.println("Compra Media Baja");
        } else{
        System.out.println("Compra Pequeña");
        }
        reader.close();
    }

    public static double sumar(double precio1, double precio2, double precio3, double precio4) {
        return precio1 + precio2 + precio3 + precio4;
    }

    public static double calcularIVA(double suma, double tasaIVA) {
        return suma * tasaIVA;
    }
}