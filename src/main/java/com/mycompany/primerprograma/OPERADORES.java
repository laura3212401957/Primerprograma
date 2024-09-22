package com.mycompany.primerprograma;
import java.util.Scanner;

public class OPERADORES {

    public static void main(String args[]) {
        Scanner reader = new Scanner(System.in);

        // Solicita al usuario que ingrese dos números
        System.out.print("Digite el primer número ");
        int a = reader.nextInt();

        System.out.print("digite el segundo número ");
        int b = reader.nextInt();

        // Realiza operaciones
        int suma = sumar(a, b);
        int resta = restar(a, b);
        int multiplicacion = multiplicar(a, b);
        int division = dividir(a, b);
        int modulo = modulo(a, b);

        // Mestra los resultados
        System.out.println("Suma: " + suma);
        System.out.println("Resta: " + resta);
        System.out.println("Multiplicación: " + multiplicacion);
        System.out.println("División:"+ division);
        System.out.println("Módulo: " + modulo);

        reader.close();
    }

    // Suma
    public static int sumar(int a, int b) {
        return a + b;
    }

    // Resta
    public static int restar(int a, int b) {
        return a - b;
    }

    // Multiplicar
    public static int multiplicar(int a, int b) {
        return a * b;
    }
    //división
    public static int dividir(int a, int b) {
        if(b == 0) {
            System.out.println("Error: No se puede calcular el divisor por cero");
        }
        return 0;
    }
    // Mod
    public static int modulo(int a, int b) {
        if (b == 0) {
            System.out.println("Error: No se puede dividir por cero.");
            return 0; 
        }
        return a % b;
    }
}
