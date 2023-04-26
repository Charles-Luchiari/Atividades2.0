package POO.Exerc1;

public class PessoaJuridica extends Cliente{

	private String cnpj;

	//constructor
	public PessoaJuridica(String nomeCliente, int idadeCliente, String enderecoCliente, String emailCliente,
			String cnpj) {
		super(nomeCliente, idadeCliente, enderecoCliente, emailCliente);
		this.cnpj = cnpj;
	}
	
	//Getters e Setters
	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	
	public void visualizar() {
		System.out.println("O "+getNomeCliente()+" com idade de "+getIdadeCliente()+" possui o CPF "+getCnpj());
	}
	
}
