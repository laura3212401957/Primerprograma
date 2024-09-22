package com.mycompany.primerprograma;
import java.util.Scanner;
public class PAGO {
    public static void main (String args[])
    {
        int salario_D; //dato que se genera por parte del usuario
        int aux_T=162000;
        
        Scanner reader = new Scanner(System.in);
        System.out.println("introduzca el dia de su salario: ");
        salario_D = reader.nextInt();
        
        int salarioporhora= salario_D/8; //Salario hora
        int salariomensual= mensual(salario_D);
        int beneficiario= salariomensual + aux_T;
        
        System.out.println("salario Dia: "+ salario_D);
        System.out.println("Salario hora: " + salarioporhora);
        System.out.println("Salario Mes: " + salariomensual);
        
        if (salariomensual<=2600000){
                System.out.println("Salario + Auxlio de transporte: " + beneficiario );
        }else{
                System.out.println("No Gana Auxilio de Transporte, porque gana más de 2SMLV");
                }
        reader.close();
    }
    public static int mensual(int salario_D) {
        return salario_D * 30;
    }
}