package collectionsSet;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Exerc3 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		Set<Integer> Numeros = new HashSet<>();

		int i;

		System.out.println("Set :");
		for (i = 0; i < 10; i++) {
			int num = leia.nextInt();
			Numeros.add(num);
		}

		Iterator<Integer> iNumeros = Numeros.iterator();

		System.out.println("\nListar dados do Set: ");
		while (iNumeros.hasNext()) {
			System.out.println(iNumeros.next());
		}

	}

}
