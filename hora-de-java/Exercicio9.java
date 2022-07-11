import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[]args){


        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe a base do triangulo");
        int base = entrada.nextInt();

        System.out.println("Informe a altura do triangulo");
        int altura = entrada.nextInt();

          int conta =  base * altura / 2;
          //ou: System.out.println(base * altura)

        System.out.println(" o resultado eh " +  conta);


    }

}