import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[]args){


        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe a diagonal maior do losango");
        int maior = entrada.nextInt();

        System.out.println("Informe a diagonal menor do losango");
        int menor = entrada.nextInt();

          int conta =  menor * maior / 2;
          //ou: System.out.println(base * altura)

        System.out.println(" o resultado eh " +  conta);


    }

}