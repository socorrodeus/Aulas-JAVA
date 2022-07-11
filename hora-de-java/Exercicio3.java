import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[]args){


        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite seu nome");
        String nomeUsuario = entrada.nextLine();

        System.out.println("Digite sua idade");
        String idade = entrada.nextLine();


        System.out.println(" ola " + nomeUsuario + " sua idade e " + idade );


    }

}