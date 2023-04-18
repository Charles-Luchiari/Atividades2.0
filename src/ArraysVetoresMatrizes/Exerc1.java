package ArraysVetoresMatrizes;

import java.util.Scanner;

public class Exerc1 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		int[] vetor = { 2, 5, 1, 3, 4, 9, 7, 8, 10, 6 };
		int posicao, busca;

		System.out.println("Qual numero você deseja encontrar? ");
		busca = leia.nextInt();
		posicao = -1;
		
		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i] == busca) {
				posicao = i;
			}
		}

		if (posicao == -1) {
			System.out.println("O numero " + busca + " não foi encontrado");
		} else {
			System.out.println("O número " + busca + " está na posicao " + posicao);
		}
	}
}
