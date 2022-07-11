import java.util.Scanner;
public class Exercicio3
{
	public static void main(String[] args) {
	    Scanner entrada = new Scanner(System.in);
	    
	    System.out.println("Digite um numero");
	    double num1 = entrada.nextDouble();
	    System.out.println("Digite um numero");
	    double num2 = entrada.nextDouble();
        System.out.println("Digite um numero");
	    double num3 = entrada.nextDouble();

	    
	    if(num1 && num2 > num3 ){
	        System.out.println(" A soma dos dois maiores eh "  + num1 + num2);
	    }

        else if(num1 && num3 > num2 ){
	        System.out.println(" A soma dos dois maiores eh "  + num1 + num3);
	        
	    }

        else if(num2 && num3 > num1 ){
	        System.out.println(" A soma dos dois maiores eh "  + num2 + num3);
	        
	    }

        
	    entrada.close();
	}
}