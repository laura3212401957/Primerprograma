package com.mycompany.primerprograma;
//Autor Laura
import java.util.Scanner;
public class NOTAS_DEFINITIVA {
    public static void main (String args[])
    {
        double nota1,nota2,promedio;
        int numeroDeNotas=2;
        
        Scanner reader = new Scanner(System.in);
        System.out.print("Digite el primera nota");
        nota1 = reader.nextDouble();
        System.out.print("Digite el segunda nota");
        nota2 = reader.nextDouble();
        
        //Realiza operaciones
        promedio=(nota1+nota2)/numeroDeNotas;
        
        //muestra resultados
        System.out.println("Tu definitiva es:"+promedio);
        
        //Operaciones
            if (promedio>=30){
                System.out.println("Aprobo");
            }else {
                System.out.println("Reprobo");
            }
            reader.close();
        }
    }
