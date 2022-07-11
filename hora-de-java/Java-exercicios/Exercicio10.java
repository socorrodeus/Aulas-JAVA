import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[]args){


        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe o raio do circulo");
        int raio = entrada.nextInt();

        System.out.println("Informe o pi do circulo");
        int pi = entrada.nextInt();


          int conta =  pi * raio;
          //ou: System.out.println(base * altura)

        System.out.println(" o resultado eh " +  conta);


    }

}