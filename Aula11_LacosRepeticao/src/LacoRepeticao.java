
public class LacoRepeticao {

	public static void main(String[] args) {
		// Comando WHILE - laço pré-testado
		
		int qtdVezes = 1;
		
		while (qtdVezes <= 10) {
			System.out.println("Estou fazendo a " + qtdVezes + "ª vez");
			qtdVezes++; //equivalente a qtdVezes = qtdVezes + 1
		}
		System.out.println("Saí do laço e executei " + (qtdVezes - 1));
	
	
		//Do While - laço pós-testado
		qtdVezes = 1;
		
		do {
			System.out.println("Estou fazendo a " + qtdVezes + "ª vez");
		} while (qtdVezes <=10);
		System.out.println("Saí do laço e executei " + (qtdVezes - 1));
	
		//For
		for (int qtdVezes1 = 1; qtdVezes1 <= 10; qtdVezes1++) {
			System.out.println("Estou fazendo a " + qtdVezes1 + "ª vez");
			if(qtdVezes1 == 5) {
				System.out.println("Parei na " + qtdVezes1 + "ª vez");
				break;
			}
		}
	
	}
	
}