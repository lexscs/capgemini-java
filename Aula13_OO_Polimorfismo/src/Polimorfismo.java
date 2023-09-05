
public class Polimorfismo {

	public static void main(String[] args) {
		
		Mamifero mamifero1 = new Elefante();
		System.out.println("Cota Diária de Leite de um elefante: " + mamifero1.cotaDiariaLeite() + " litros");
		
		Mamifero mamifero2 = new Rato();
		System.out.println("Cota Diária de Leite de um rato: " + mamifero2.cotaDiariaLeite() + " litros");
	}

}
