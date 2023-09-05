
public class Pessoas {

	public static void main(String[] args) {
			
		Fisica fis = new Fisica();
		
		fis.nome = "Alex";
		fis.cpf = "007700900-9";
		fis.identidade = "20999007-8";
		fis.situacaoPessoa = "A";
		
		Juridica jur = new Juridica();
		
		jur.nome = "Felix";
		jur.cnpj = "999000999-99";
		jur.inscEstadual = "123456789";
		jur.situacaoPessoa = "D";
		
		System.out.println("Dados da Pessoa Física:");
		System.out.println(fis.toString());
		
		System.out.println("Dados da Pessoa Jurídica:");
		System.out.println(jur.toString());
		
	}

}