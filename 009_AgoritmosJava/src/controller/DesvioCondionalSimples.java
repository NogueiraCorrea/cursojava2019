package controller;
import util.Teclado;
public class DesvioCondionalSimples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a, b, x;
		a = Teclado.lerInt("informe o primeiro numero");
		a = Teclado.
		b = Teclado.lerInt("informe o segundo numero");
		x = a + b;
		if (x > 10)
		{
			System.out.println("O valor da soma é" + x);
		}
	}

}
