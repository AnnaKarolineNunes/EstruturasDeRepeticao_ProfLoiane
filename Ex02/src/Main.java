import java.util.Scanner;

// Link de acesso dos exercicios: https://github.com/loiane/curso-java-basico/blob/master/exercicios/Exercicios%20Aulas%2016%2017.pdf
// personalizado por : Anna Karoline Nunes.

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        //2. Faça um programa que leia um nome de usuário e a sua senha e não
        //aceite a senha igual ao nome do usuário, mostrando uma mensagem
        //de erro e voltando a pedir as informações.


        boolean infoValidas = false;
        String nome;
        String senha;

        do {

            System.out.println("Digite um userName: ");
            nome = scanner.next();
            System.out.println("Digite uma senha de letras:");
            senha = scanner.next();
            if (nome.equalsIgnoreCase(senha)) {
                System.out.println("Senha igual ao nome, digite novamente.");
            } else {
                System.out.println("Senha e usuario válidos ");
                infoValidas = true;
            }
        }while (!infoValidas) ;

    }
}