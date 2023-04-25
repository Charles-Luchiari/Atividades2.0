package POO.Exerc1;

public class Cliente {
	
	//declaração dos atributos da classe
	private String nomeCliente;
	private int idadeCliente;
	private String enderecoCliente;
	private String emailCliente;
	
	//metodo constructor
	public Cliente(String nomeCliente, int idadeCliente, String enderecoCliente, String emailCliente) {
		super();
		this.nomeCliente = nomeCliente;
		this.idadeCliente = idadeCliente;
		this.enderecoCliente = enderecoCliente;
		this.emailCliente = emailCliente;
	}

	//criando Getters e Setters
	public String getNomeCliente() {
		return nomeCliente;
	}


	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}


	public int getIdadeCliente() {
		return idadeCliente;
	}


	public void setIdadeCliente(int idadeCliente) {
		this.idadeCliente = idadeCliente;
	}


	public String getEnderecoCliente() {
		return enderecoCliente;
	}


	public void setEnderecoCliente(String enderecoCliente) {
		this.enderecoCliente = enderecoCliente;
	}


	public String getEmailCliente() {
		return emailCliente;
	}


	public void setEmailCliente(String emailCliente) {
		this.emailCliente = emailCliente;
	}
	
	//metodo para visualizar
	public void visualizar() {
		System.out.println("O cliente "+nomeCliente+" com idade "+idadeCliente+" anos, "
		+ "residente "+enderecoCliente+" possui o contato: "+emailCliente);
	}
	
	
	
}
