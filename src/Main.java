
// Link de acesso dos exercicios: https://github.com/loiane/curso-java-basico/blob/master/exercicios/Exercicios%20Aulas%2016%2017.pdf
// personalizado por : Anna Karoline Nunes

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //1. Faça um programa que peça uma nota, entre zero e dez. Mostre uma
        //mensagem caso o valor seja inválido e continue pedindo até que o
        //usuário informe um valor válido.


        Double nota = 0.0;
        while (true){
            System.out.println("Digite uma nota entre 0 e 10 : ");
            nota= scanner.nextDouble();
            if (nota > 0 && nota <= 10){
                System.out.println("voce digitou uma nota válida.");
                System.out.println("fim.");
                break;
            } else {
                System.out.println("nota inválida, tente novamente");
                continue;
            }
        }

    }
}