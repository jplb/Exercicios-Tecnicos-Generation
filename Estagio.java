package Case;

import java.util.Scanner;

public class Estagio {
	
	public static void main(String[] args) {
		
		int idade;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Estagio da vida");
		System.out.println("Entre com a sua idade: ");
		idade = leia.nextInt();
		
		if (idade >= 10 && idade <= 14)
		{
			System.out.println("Você tem " + idade + " anos. E está "
					+ "na fase infantil da vida. Aproveite!" );
		}
		else if (idade >= 15 && idade <= 17 )
		{
			System.out.println("Você tem " + idade + " anos. E está "
					+ "na fase juvenil da vida. Aproveite!" );
		}
		else if (idade >= 18 && idade <= 25)
		{
			System.out.println("Você tem " + idade + " anos. E está "
					+ "na fase adulta da vida. É hora de ser mais responsável!" );
		}
		else
		{
			System.out.println("Você inseriu um valor não válido");
		}
	}

}
