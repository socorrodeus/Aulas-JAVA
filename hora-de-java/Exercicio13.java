import java.util.Scanner;
public class Exercicio13
{
	public static void main(String[] args) {
	    Scanner entrada = new Scanner(System.in);
	    
	    System.out.println("Digite um numero");
	    double num1 = entrada.nextDouble();
	    System.out.println("Digite um numero");
	    double num2 = entrada.nextDouble();
	    
	    if(num2 <= 0 ){
	        System.out.println("Digite um numero");
	        num2 = entrada.nextDouble();
	    }
	    
	    double resultado = num1 / num2;
	    
	    System.out.println("O resultado eh: " + resultado);
	    
	    entrada.close();
	}
}
