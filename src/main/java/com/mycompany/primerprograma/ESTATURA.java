package com.mycompany.primerprograma;
import java.util.Scanner;
public class ESTATURA {
    public static void main (String args[])
    {
        int altura;
        
        Scanner reader = new Scanner(System.in);
        System.out.print("Digite su altura: ");
        altura = reader.nextInt();
        
            if (altura<=150){
                System.out.println("Su estatura es: "+altura+"CM");
                System.out.println("Estatura Baja");
            }else if (altura<=170) {
                System.out.println("Su estatura es: "+altura+"CM");
                System.out.println("Estatura Media");
            }else if (altura<=200){
                    System.out.println("Su estatura es: "+altura+"CM");
                    System.out.println("Estatura Alta");
                    } else{
                System.out.println("ERROR");
            }
            reader.close();
    }
}
