package Case5;

public class TesteAnimal {

	public static void main(String[] args) {
		
		//Scanner leia = new Scanner (System.in);
		
		AnimalCavalo cavalo1 = new AnimalCavalo();
		AnimalCachorro cachorro1 = new AnimalCachorro();
		AnimalPreguica preguica1 = new AnimalPreguica();
		
		cavalo1.setNome("José");
		cavalo1.setIdade(20);
		cavalo1.setBarulho("relinche");
		cavalo1.setAcao("correr");
		
		cachorro1.setNome("Bob");
		cachorro1.setIdade(7);
		cachorro1.setBarulho("latido");
		cachorro1.setAcao("correr");
		
		preguica1.setNome("Kerlaine");
		preguica1.setIdade(5);
		preguica1.setBarulho(null);
		preguica1.setAcao("subir em árvores");
		
		System.out.println
		(
				"\nNome do cachorro: " + cachorro1.getNome() +
				"\nIdade do cachorro: " + cachorro1.getIdade()+
				"\nO barulho que o cachorro faz é o: "+ cachorro1.getBarulho()+
				"\nA ação do cachorro é: "+ cachorro1.getAcao()
		);
		System.out.println
		(
				"\nNome do cavalo: " + cavalo1.getNome() +
				"\nIdade do cavalo: " + cavalo1.getIdade()+
				"\nO barulho que o cavalo faz é o: "+ cavalo1.getBarulho()+
				"\nA ação do cavalo é: "+ cavalo1.getAcao()
		);
		System.out.println
		(
				"\nNome da preguiça é: " + preguica1.getNome() +
				"\nIdade da preguiça: " + preguica1.getIdade()+
				"\nO barulho que a preguiça faz é o: "+ preguica1.getBarulho()+
				"\nA ação da preguiça é: "+ preguica1.getAcao()
		);
	}
}
