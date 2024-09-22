
package com.mycompany.primerprograma;
//Autor Laura
import java.util.Scanner;

public class NOTAS {
    
    public static void main (String args[])
    {
        int nota1,nota2,nota3;
        nota1=0;
        nota2=0;
        nota3=0;
                
        Scanner reader = new Scanner(System.in);
        System.out.print("Digite el primera nota");
        nota1 = reader.nextInt();
        System.out.print("Digite el segunda nota");
        nota2 = reader.nextInt();
        System.out.print("Digite el tercera nota ");
        nota3 = reader.nextInt();
        
        //Realiza operaciones
        int suma= sumar(nota1,nota2,nota3);
        int Def_notas= suma/3;
        
        //muestra resultados
        System.out.println("Tu definitiva es:"+Def_notas);
        
        reader.close();
    }
        //Operaciones
        public static int sumar(int nota1, int nota2, int nota3) {
        return nota1 + nota2 + nota3;
        }
}
