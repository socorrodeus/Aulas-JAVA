import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[]args){


        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe a base maior do trapezio");
        int maior = entrada.nextInt();

        System.out.println("Informe a base menor do trapezio");
        int menor = entrada.nextInt();

        System.out.println("Informe a altura");
        int altura = entrada.nextInt();

          int conta =  menor + maior * altura / 2;
          //ou: System.out.println(base * altura)

        System.out.println(" o resultado eh " +  conta);


    }

}