package lacosDesicao;

import java.util.Scanner;

public class Exer1 {

	public static void main(String[] args) {
		int a, b, c, soma;

		try (Scanner ler = new Scanner(System.in)) {
			System.out.println("Digite o número A: ");
			a = ler.nextInt();
			System.out.println("Digite o número B: ");
			b = ler.nextInt();
			System.out.println("Digite o número C: ");
			c = ler.nextInt();
		}

		soma = a + b;
		
		if(soma>c) {
			System.out.println(a+" + "+b+" = "+soma+" > "+c);
			System.out.println("A soma de A + B é maior que C");
		}else if(soma<c){
			System.out.println(a+" + "+b+" = "+soma+" < "+c);
			System.out.println("A soma de A + B é menor que C");
		} else if(soma==c) {
			System.out.println(a+" + "+b+" = "+soma+" = "+c);
			System.out.println("A soma de A + B é igual a C");
		}
	}

}
