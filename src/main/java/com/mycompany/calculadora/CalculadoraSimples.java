
package com.mycompany.calculadora;

import java.util.Scanner;


public class CalculadoraSimples {
    public static void main (String[] args){
    
        double n1, n2, resultado;
                
        Scanner input = new Scanner(System.in);
        
        System.out.println("Insira o primeiro numero: ");
        n1 = input.nextInt();
        System.out.println("Insira o segundo numero: ");
        n2 = input.nextInt();
        
        Operacoes saida = new Operacoes();
        
        resultado = saida.soma(n1, n2);
        System.out.println("Soma: "+ resultado);
        
        resultado = saida.subtracao(n1, n2);
        System.out.println("subtracao: "+ resultado);
        
        resultado = saida.multiplicacao(n1, n2);
        System.out.println("multiplicacao: "+ resultado);
        
        resultado = saida.divisao(n1, n2);
        System.out.println("divisao: "+ resultado);
    
    }
}
