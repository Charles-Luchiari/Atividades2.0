package ArraysVetoresMatrizes;

import java.util.Scanner;

public class Exerc2 {

	public static void main(String[] args) {

		final int tamVet = 10;

		int vet[] = new int[tamVet];
		int i, par = 0, impar = 0;
		float somaNum = 0;

		Scanner leia = new Scanner(System.in);

		for (i = 0; i < vet.length; i++) {
			System.out.println("Entre com um número: ");
			vet[i] = leia.nextInt();
			somaNum = somaNum + vet[i];
		}

		System.out.println("\nElementos pares: ");
		for (i = 0; i < vet.length; i++) {
			if (vet[i] % 2 == 0) {
				par = vet[i];
				System.out.println(par + " ");
			}
		}

		System.out.println("\nElementos impares: ");
		for (i = 0; i < vet.length; i++) {
			if (vet[i] % 2 != 0) {
				impar = vet[i];
				System.out.print(impar + " ");
			}
		}
		
		System.out.println("\nSoma: " + somaNum);
		float media = somaNum / 10;
		System.out.printf("\nMedia: %.1f" , media);
	}

}
