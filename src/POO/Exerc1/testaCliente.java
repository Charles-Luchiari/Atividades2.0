package POO.Exerc1;

public class testaCliente {

	public static void main(String[] args) {

		Cliente cliente1 = new Cliente("Charles", 25, "Rua do mercado", "email@gmail.com");
		cliente1.visualizar();

		Cliente cliente2 = new Cliente("Sueli", 25, "Rua do mercado", "email.gmail.com");
		cliente2.visualizar();

	}

}
