// Link de acesso dos exercicios: https://github.com/loiane/curso-java-basico/blob/master/exercicios/Exercicios%20Aulas%2016%2017.pdf
// personalizado por : Anna Karoline Nunes.
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //3. Faça um programa que leia e valide as seguintes informações:
        //a. Nome: maior que 3 caracteres;
        //b. Idade: entre 0 e 150;
        //c. Salário: maior que zero;
        //d. Sexo: 'f' ou 'm';
        //e. Estado Civil: 's', 'c', 'v', 'd';

        boolean infoValida = false;
        String nome;
        int idade;
        Double salario;
        String sexo;
        String estadoCivil;

        do {
            System.out.println("Digite um nome:");
            nome = scanner.next();
            if (nome.length() >= 3){
                infoValida  = true;
            }else {
                System.out.println(" NOme precisa de no minimo 3 caracteres");
            }
        }while (!infoValida);

        infoValida = false;

        do {
            System.out.println("Digite a idade:");
            idade = scanner.nextInt();
            if (idade >= 0 && idade <= 150){
                infoValida = true;
            }else{
                System.out.println("A idade deve ser entre 0 e 150");
            }
        }while (!infoValida);

        infoValida = false;

        do {
            System.out.println("Digite o salario");
            salario = scanner.nextDouble();
            if (salario > 0 ){
                infoValida = true;
            }else {
                System.out.println("O salario precisa ser maior que 0");
            }
        }while (!infoValida);

        infoValida = false;

        do {
            System.out.println("Qual o sexo?");
            sexo = scanner.next();
            if (sexo.equalsIgnoreCase("f") || sexo.equalsIgnoreCase("m")){
                infoValida =true;
            }else {
                System.out.println("Entre com um genero válido");
            }
        }while (!infoValida);

        infoValida = false;

        do {
            System.out.println("Digite o estado civil:");
            estadoCivil = scanner.next();
            if (estadoCivil.equalsIgnoreCase("s") || estadoCivil.equalsIgnoreCase("c") || estadoCivil.equalsIgnoreCase("v") || estadoCivil.equalsIgnoreCase("d")){
                infoValida = true;
            }else {
                System.out.println("Digite um estado civil válido.");
            }
        }while (!infoValida);

        System.out.println("Nome : " + nome);
        System.out.println("Idade : " + idade);
        System.out.println("Salario : " + salario);
        System.out.println("Genero : " + sexo);
        System.out.println("Estado civil : " + estadoCivil);




    }
}