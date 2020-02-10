package controller;
import util.Teclado;

public class Operadores {
	//private static final double Teclado = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nome;
		nome = Teclado.lerTexto("Digite o nome do aluno");
		double nota1,nota2,nota3,nota4,media,media_total,media_resto;
		
		nota1 = Teclado.lerDouble("Digite a nota 01:");
		nota2 = Teclado.lerDouble("Digite a nota 02:");
		nota3 = Teclado.lerDouble("Digite a nota 03:");
		nota4 = Teclado.lerDouble("Digite a nota 04:");
		
		media_total =nota1+nota2+nota3+nota4;
		media =media_total / 4;
				
	
	media_resto = media_total % 4;
	System.out.println("Nome:"+nome);
	System.out.println("Media:"+ media);
	System.out.println("Fim");	
	}

	
	}


