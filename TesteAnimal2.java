package Case6;

public class TesteAnimal2 {
	
	public static void main(String[] args) {
		
		Cachorro2 dog = new Cachorro2("Marley", 1);
		Cavalo2 horse = new Cavalo2("Pé de Pano", 10);
		Preguica2 lazyness = new Preguica2 ("Dona Preguiça", 5);
		
		dog.imprimirInfo();
		dog.som("AuAuAu");
		dog.acao("Pegar bolinha");
		System.out.println();
		
		horse.imprimirInfo();
		horse.som("Iiiihihihihihihi");
		horse.acao("Correr na pista");
		System.out.println();
		
		lazyness.imprimirInfo();
		lazyness.som("Balinchada");
		lazyness.acao("Subir em árvores");
		
		
	}

}
