package Controller;

public class Continuação {
	int idade;
	String nome;

	public static void main(String[] args) {
   SobrecargaMetodo scm = new SobrecargaMetodo();
    scm.cadastrarPessoa("Michael Ferreira");
    scm.cadastrarPessoa( 35,"Fabricio Gomes");
	}

	public void cadastrarPessoas(int valor) {
		idade = valor;
	System.out.println("Nome:"+nome);

	

	}

	public void cadastrarPessoas(int valor1, String valor2) {

	}
}
