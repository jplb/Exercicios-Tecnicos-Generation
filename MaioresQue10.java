package Case3;

import java.util.Scanner;

//3- Leia uma matriz 3 x 3, conte e escreva quantos valores maiores que 10 ela possui.

public class MaioresQue10 {
	public static void main(String[] args) {
		
		int[][] Matriz = new int[3][3];
		int linha, coluna, contador = 0;
		Scanner leia = new Scanner(System.in);
		
		for (linha = 0; linha < 3; linha++)
		{
			for (coluna = 0; coluna < 3; coluna++)
			{
				System.out.println("Entre com um valor para a matriz 3x3: ");
				Matriz[linha][coluna] = leia.nextInt();
				if (Matriz[linha][coluna] > 10)
				{
					contador++;
				}
			}
		}
		for (linha = 0; linha < 3; linha++)
		{
			for (coluna = 0; coluna < 3; coluna++)
			{
				System.out.println(Matriz[linha][coluna]);
			}
		}
		System.out.println("Foram lançados " + contador + " valores maiores que 10");
	}

}
