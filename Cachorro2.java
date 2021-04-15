package Case6;

public class Cachorro2 extends Animal2 {
	
	
	public Cachorro2 (String nome, int idade)
	{
		super (nome, idade);
		
	}
	
	@Override //polimorfismo - vai herdar uma classe abstrata da super classe
	public void som (String som)
	{
		System.out.println("O som que o cachorro faz é: " + som);
	}
	
	@Override
	public void acao (String acao)
	{
		System.out.println("A ação que o cachorro faz é: "+ acao);
	}

}
