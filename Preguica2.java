package Case6;

public class Preguica2 extends Animal2 {
	
	

	public Preguica2() {
	}

	public Preguica2(String nome, int idade) {
		super(nome, idade);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void som(String som) {
		
		System.out.println("O som da preguiça é: " + som);
		// TODO Auto-generated method stub
		
	}

	@Override
	public void acao(String acao) {
		
		System.out.println("A ação da preguiça é: "+ acao);
		// TODO Auto-generated method stub
		
	}
	


}
