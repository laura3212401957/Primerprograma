package com.mycompany.primerprograma;
import java.util.Scanner;
public class MULTIPLICACION {
    public static void main(String args[]) 
    {
        int a,b,c;
            a=0;
            b=0;
            c=0;
               Scanner reader = new Scanner(System.in);
               System.out.println("Digite el primer numero");
               a= reader.nextInt();
               System.out.println("Digite el segundo numero");
               b= reader.nextInt();
               c=a*b;
               System.out.println("La multiplicación es " + a + "*" + b + "= " + c);
               reader.close();
    }
}