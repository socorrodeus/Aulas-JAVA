import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[]args){


        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe a base do retangulo");
        int base = entrada.nextInt();

        System.out.println("Agora informe a altura");
        int altura = entrada.nextInt();

          int conta =  base * altura;
          //ou: System.out.println(base * altura)

        System.out.println(" o resultado eh " +  conta);


    }

}