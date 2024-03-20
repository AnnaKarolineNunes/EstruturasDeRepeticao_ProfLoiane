// Link de acesso dos exercicios: https://github.com/loiane/curso-java-basico/blob/master/exercicios/Exercicios%20Aulas%2016%2017.pdf
// personalizado por : Anna Karoline Nunes.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //5. Altere o programa anterior permitindo ao usuário informar as
        //populações e as taxas de crescimento iniciais. Valide a entrada e
        //permita repetir a operação.

        Double pessoasA;
        Double taxaA;
        Double pessoasB;
        Double taxaB;

        boolean valido = false;

        do {
            System.out.println("Insira a quantidade de pessoas do pais A");
            pessoasA = scanner.nextDouble();
            if (pessoasA > 0){
                valido = true;
            }else {
                System.out.println("População a precisa ser maior que zero ");
            }
        }while (!valido);

        valido = false;

        do {
            System.out.println("Insira a taxa de crescimento do pais A");
            taxaA = scanner.nextDouble();
            if (taxaA >0){
                valido = true;
            }else {
                System.out.println("A taxa A precisa ser maior que zero ");
            }
        }while (!valido);

        valido = false;

        do {
            System.out.println("Insira a quantidade de pessoas do pais B");
            pessoasB = scanner.nextDouble();
            if (pessoasB > 0){
                valido = true;
            }else {
                System.out.println("População B precisa ser maior que zero ");
            }
        }while (!valido);

        valido = false;

        do {
            System.out.println("Insira a taxa de crescimento do pais B");
            taxaB = scanner.nextDouble();
            if (taxaB > 0){
                valido = true;
            }else {
                System.out.println("A taxa B precisa ser maior que zero ");
            }
        }while (!valido);

        int cont =0;

        while (pessoasA < pessoasB){

            pessoasA += (pessoasA/100) * taxaA;
            pessoasB += (pessoasB/100) * taxaB;
            cont++;
        }

        System.out.println("População A : " + pessoasA);
        System.out.println("População B : " + pessoasB);
        System.out.println("Qtd anos    : " + cont);




    }
}