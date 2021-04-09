package Case5;
/*1-	Crie uma hierarquia de classes conforme abaixo com os seguintes atributos
 * e comportamentos (observe a tabela), utilize os seus conhecimentos e distribua as
 * características de forma que tudo o que for comum a todos os animais fique na classe Animal: 
 */

public class Animal {
	
	private String nome;
	private int idade;
	private String barulho;
	private String acao;
	
	public Animal() //criei o construtor vazio para auto-preenchimento de valores nulos,
	//pois nem todo animal emite um som
	{
		
	}

	public Animal(String nome, int idade, String barulho, String acao)
	{
		this.nome = nome;
		this.idade = idade;
		this.barulho = barulho;
		this.acao = acao;
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getBarulho() {
		return barulho;
	}

	public void setBarulho(String barulho) {
		this.barulho = barulho;
	}

	public String getAcao() {
		return acao;
	}

	public void setAcao(String acao) {
		this.acao = acao;
	}
	
	
	
}
 