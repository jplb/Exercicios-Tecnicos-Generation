package Case2;

import java.util.Scanner;

public class TotalPessoas {
	public static void main(String[] args) {
		
		int idade, MaiorCinquenta = 0, MenorVinteUm = 0;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Maiores de 50 e Menores de 21");
		System.out.println("Entre com a idade:");
		idade = leia.nextInt();
		
		
		while (idade != -99)
		{
			
			if (idade <= 21)
			{
				MenorVinteUm++;
				
			}
			if (idade >= 50)
			{
				MaiorCinquenta++;
				
			}
			System.out.println("Entre com mais uma idade: ");
			idade = leia.nextInt();
		}
		
		System.out.println("O número de pessoas menores de 21 anos é de:" + MenorVinteUm);
		System.out.println("O número de pessoa maiores de 50 anos é de: " + MaiorCinquenta);
			
	}

}
