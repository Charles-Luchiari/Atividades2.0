package collectionsSet;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Exerc4 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		int i;
		Set<Integer> Num = new HashSet<Integer>();
		
		Num.add(2);
		Num.add(5);
		Num.add(1);
		Num.add(3);
		Num.add(4);
		Num.add(9);
		Num.add(7);
		Num.add(8);
		Num.add(10);
		Num.add(6);
		
		Iterator<Integer> iNum = Num.iterator();
		
		System.out.println("Digite o numero que deseja encontrar: ");
		i = leia.nextInt();
		
		if(Num.contains(i)) {
			System.out.println("O numero "+i+" foi encontrado!!");
		} else {
			System.out.println("O numero "+i+" não foi encontrado!!");
		}


	}

}
