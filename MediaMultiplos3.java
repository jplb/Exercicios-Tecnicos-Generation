package Case2;

import java.util.Scanner;

public class MediaMultiplos3 {
	public static void main(String[] args) {
		
		int numero, somamult3 = 0, contmult3 = 0;
		float mediamult3;
		Scanner leia = new Scanner (System.in);
		
		System.out.println("Entre com um número inteiro: ");
		numero = leia.nextInt();
		
		do
		{
			if (numero % 3 == 0)
			{
				somamult3 = somamult3 + numero;
				contmult3++;
			}
			System.out.println("Entre com um número: ");
			numero = leia.nextInt();
		} while(numero != 0);
		
		mediamult3 = somamult3 / contmult3;
		System.out.println("A média dos números múltiplos de 3 é de: " + mediamult3);;
		
	}

}
