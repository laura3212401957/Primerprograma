package com.mycompany.primerprograma;
import java.util.Scanner;
public class VERIFICAR_NOTAS {
    public static void main(String[] args) {
        float[] notas = new float[7]; //Array (lista) y creacion de capacidad de iteración 7 valores
        float suma = 0, nota;
        
        Scanner reader = new Scanner(System.in);

        for (int i = 0; i < 7; i++) {
            do {
                System.out.println("Digite la nota " + (i + 1) + " (entre 0 y 5): ");
                nota = reader.nextFloat();
            } while (nota < 0 || nota > 5); // Repetir hasta que la nota sea válida
            notas[i] = nota;
            suma += nota; //el usuario ingresa una nota, esa nota se añade a la variable
        }

        System.out.println("Tu definitiva es: " + (suma / 7));
        reader.close();
    }
}
