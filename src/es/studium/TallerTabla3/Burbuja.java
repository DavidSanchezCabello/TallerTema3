package es.studium.TallerTabla3;

import java.util.Scanner;

public class Burbuja
{

	public static void main(String[] args)
	{
		Scanner teclado = new Scanner(System.in);
		int tabla[] = new int[10];
		int i, j, aux;
		for (i = 0; i <=9; i++)
		{
			System.out.println("Dame un número");
			tabla[i] = teclado.nextInt();
		}
		for(i=0;i<9;i++) {
		for (j = 0; j <= 9 - i - 1; j++)
		{
			if ((tabla[j]) > (tabla[j + 1]))
			{
				aux = tabla[j];
				tabla[j] = tabla[j + 1];
				tabla[j + 1] = aux;
			}
		}}
		
		System.out.println("La tabla ordenada queda así: ");
			for(i=0;i<=9;i++) {
			System.out.println(tabla[i]);
			}

	}

}
