package collectionsSet;

import java.util.ArrayList;
import java.util.Scanner;

public class Exerc2 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		int i;
		ArrayList<Integer> num = new ArrayList();

		num.add(2);
		num.add(5);
		num.add(1);
		num.add(3);
		num.add(4);
		num.add(9);
		num.add(7);
		num.add(8);
		num.add(10);
		num.add(6);

		System.out.println("Digite o numero que queira encontrar: ");
		i = leia.nextInt();

		if (num.contains(i)) {
			System.out.println("O numero " + i + " está localizado na posicao: " + (num.indexOf(i) + 1));
		} else {
			System.out.println("O numero " + i + " não foi encontrado");
		}

	}

}
