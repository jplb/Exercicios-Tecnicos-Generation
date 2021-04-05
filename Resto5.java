package Case2;

import java.util.Scanner;

public class Resto5 {
	public static void main(String[] args) {
		
		int numero, x;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Resto 5, Imprime");
		
		for (x = 1000; x <= 1999; x++)
		{
			if (x % 11 == 5)
			{
				System.out.println("Número:" + x);
			}
		}
		
	}

}
