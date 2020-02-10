package Controller;

public class ChamadaMetodo {

	public static void main(String[] args) {
		System.out.println("Iniciando Programa ");
		primeiro();
		System.out.println("Continuando Programa ");
		terceiro();
		System.out.println("terminando  Programa ");
	}

	public static void primeiro () {
		System.out.println("Iniciando método 1") ;
		segundo();		
		System.out.println	("Terminando método 1 ");
    }
	

	public static void segundo() {
		System.out.println("Iniciando método 2");
		segundo();
		System.out.println("Terminando método 2");

	}
	public static void terceiro () {
		System.out.println	("Iniciando método 3 ");
		segundo();
		System.out.println	("Terminando método 3");
	}	

}
