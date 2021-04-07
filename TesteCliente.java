package Case4;

/*
1) Crie uma classe cliente e apresente os atributos 
e métodos referentes esta classe, em seguida crie 
um objeto cliente, defina as instancias deste objeto
e apresente as informações deste objeto no console.
*/

public class TesteCliente {
	public static void main(String[] args) {
		
		Cliente cliente1 = new Cliente ("Samira Close",
				"queer", "123.456.789-12",
				"sami_close@gmail.com", "(11) 91234-5678");
		
		cliente1.imprimirInfo();
	}

}
