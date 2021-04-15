package Case6;

public class Cavalo2 extends Animal2 {
	
	public Cavalo2(String nome, int idade)
	{
		super(nome, idade);
	}

	@Override
	public void som (String som)
	{
		System.out.println("O som do cavalo é: "+ som);
		
	}
	
	@Override
	public void acao (String acao)
	{
		System.out.println("A ação do cavalo é: " + acao);
	}
}
