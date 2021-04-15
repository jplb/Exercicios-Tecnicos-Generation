package Case6;

public abstract class Animal2 {
	
	private String nome;
	private int idade;
	
public Animal2()
{
	
}

public Animal2(String nome, int idade)
	{
	this.nome = nome;
	this.idade = idade;
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

public abstract void som(String som);

public abstract void acao(String acao);


public void imprimirInfo()
{
	System.out.println("O nome do animal é: "+ nome + "\nA idade do animal é: " + idade + " ano(s)");
}

}
