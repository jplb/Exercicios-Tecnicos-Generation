package Case4;

/*
 1) Crie uma classe cliente e apresente os atributos 
 e métodos referentes esta classe, em seguida crie 
 um objeto cliente, defina as instancias deste objeto
 e apresente as informações deste objeto no console.
 */

public class Cliente {
	
	//declaração dos atributos
	
	private String nome;
	private String genero;
	private String  cpf;
	private String email;
	private String telefone;
	
	//método construtor
	
	public Cliente (String nome, String genero, String cpf,
			String email, String telefone)
	{
		this.nome = nome;
		this.genero = genero;
		this.cpf = cpf;
		this.email = email;
		this.telefone = telefone;
		
	}
	
	//criação dos demais métodos
	
	public void imprimirInfo()
	{
		System.out.println("***Dados do cliente***");
		System.out.println("Nome: "+ nome + "\nGênero: "+
		genero + "\nCPF: " + cpf + "\nEmail: " + email +
		"\nTelefone: " + telefone);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	
}
