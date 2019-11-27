package es.studium.TallerTabla3;

import java.util.Scanner;

public class Intercambio
{

	public static void main(String[] args)
	{
		Scanner teclado = new Scanner(System.in);
		int array[] = new int[10];
		int i, j, aux;

		for (i = 0; i < 9; i++)
		{

			System.out.println("Dame un número entero");
			array[i] = teclado.nextInt();

		}
		for (i = 0; i < 8; i++)
		{
			for (j = i+1; j <= 9; j++)
			{
				if (array[i] < array[j])
				{
					aux= array[i];
					array[i]=array[j];
					array[j]=aux;
				}
			}
		}
		System.out.println("La tabla ordenada queda así");
		
		for(i=0;i<9;i++) {

			System.out.println(array[i]);
		}
		teclado.close();
	}

}
