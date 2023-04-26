package POO.Exerc1;

public class testaCliente {

	public static void main(String[] args) {
		
		
		PessoaFisica peFis1 = new PessoaFisica("João", 46, "Rua do Celular", "email@gmail.com", "7564563547", "764562378");
		peFis1.visualizar();
		PessoaFisica peFis2 = new PessoaFisica("Carlos", 35, "Rua do Audutorio", "email@gmail.com", "12345678912", "123456789");
		peFis2.visualizar();
		
		
		System.out.println("\n\n");
		PessoaJuridica peJud1 = new PessoaJuridica("Vinicius", 21, "Rua da Rua", "gmail@email.com", "12345678/0001-00");
		peJud1.visualizar();
		PessoaJuridica peJud2 = new PessoaJuridica("Robson", 54, "Rua da Marcenaria", "gmail@email.com", "82736495/0001-00");
		peJud2.visualizar();
		System.out.println("\n\n");

		Cliente cliente1 = new Cliente("Charles", 25, "Rua do mercado", "email@gmail.com");
		cliente1.visualizar();
		
		Cliente cliente2 = new Cliente("Sueli", 25, "Rua do mercado", "email.gmail.com");
		cliente2.visualizar();

	}

}
