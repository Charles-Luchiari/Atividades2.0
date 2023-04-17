package lacoRepeticao;

import java.util.Scanner;

public class Exerc5 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		int soma = 0, numero;

		System.out.println("Digite um numero: ");
		numero = leia.nextInt();

		do {
			if (numero > 0) {
				soma = soma + numero;
			}
			System.out.println("Digite um numero: ");
			numero = leia.nextInt();

		} while (numero != 0);

		System.out.println("A soma dos numeros positivos é " + soma);

	}

}
