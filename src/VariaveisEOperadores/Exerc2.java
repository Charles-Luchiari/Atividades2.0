package VariaveisEOperadores;

import java.util.Scanner;

public class Exerc2 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		float n1, n2, n3, n4, media;

		System.out.println("Digite suas notas");
		System.out.println("Nota 1: ");
		n1 = leia.nextFloat();
		System.out.println("Nota 2: ");
		n2 = leia.nextFloat();
		System.out.println("Nota 3: ");
		n3 = leia.nextFloat();
		System.out.println("Nota 4: ");
		n4 = leia.nextFloat();

		media = (n1 + n2 + n3 + n4) / 4;
		System.out.printf("\nMedia: %.1f", media);

	}

}
