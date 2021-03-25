package Case;
import java.util.Scanner;

public class Maior {
	
	public static void main(String[] args) {
		
		int valor1, valor2, valor3, maior;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Determinando o maior de três valores inteiros");
		System.out.println("Insira o primeiro valor: ");
		valor1 = leia.nextInt();
		System.out.println("Insira o segundo valor: ");
		valor2 = leia.nextInt();
		System.out.println("Insira o terceiro valor");
		valor3 = leia.nextInt();
		
		if (valor1 > valor2 && valor1 > valor3)
		{
			maior = valor1;
			System.out.println("O maior valor é: " + maior);
			
		}
		else if (valor2 > valor1 && valor2 > valor3)
		{
			maior = valor2;
			System.out.println("O maior valor é: " + maior);

		}
		else if (valor3 > valor1 && valor3 > valor2)
		{
			maior = valor3;
			System.out.println("O maior valor é: " + maior);
		}
		else
		{
			System.out.println("Os valores digitados não são válidos!");
		}
		
	}

}
