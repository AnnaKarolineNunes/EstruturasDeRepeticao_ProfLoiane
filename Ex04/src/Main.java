// Link de acesso dos exercicios: https://github.com/loiane/curso-java-basico/blob/master/exercicios/Exercicios%20Aulas%2016%2017.pdf
// personalizado por : Anna Karoline Nunes.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //4. Supondo que a população de um país A seja da ordem de 80000
        //habitantes com uma taxa anual de crescimento de 3% e que a
        //população de B seja 200000 habitantes com uma taxa de crescimento
        //de 1.5%.
        // Faça um programa que calcule e escreva o número de anos
        //necessários para que a população do país A ultrapasse ou iguale a
        //população do país B, mantidas as taxas de crescimento.

        // pais A = 80.000 habitantes , taxaAnual = 3%
        // pais B = 200.000 , taxaAnual = 1.5%

        int popA= 80000;
        int popB = 200000;
        int cont =0;

       while (popA <= popB){

           popA += (popA/100) * 3;
           popB += (popB/100) * 1.5;
           cont++;
       }

        System.out.println("População A : " + popA);
        System.out.println("População B : " + popB);
        System.out.println("Qtd anos    : " + cont);







    }
}