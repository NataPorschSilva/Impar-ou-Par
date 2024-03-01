//Fazer um programa para ler um número inteiro e dizer se este número é par ou impar. if(N % 2 == 0) {} 

package com.mycompany.exe2imparpar;

import java.util.Scanner;

public class ImparPar {

    public static void main(String[] args) {
        
        Scanner ParImpar = new Scanner(System.in);
        
        int número;
                
        System.out.println("Par ou Impar:");
        número = ParImpar.nextInt();
        
        if (número% 2 == 0){
        
            System.out.println("Esse número é par");
            
                } else { 
            System.out.println("Esse número é Impar");
        }
        
    }
}
