package Password;

import java.util.Scanner;

public class Out {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		Methods metodo = new Methods();

		System.out.println("Qual a quantidade de letras maiúsculas? ");
		int Mai = entrada.nextInt();
		
		System.out.println("Qual a quantidade de letras minúsculas? ");
		int Min = entrada.nextInt();
		
		System.out.println("Qual a quantidade de números? ");
		int Num = entrada.nextInt();
		
		System.out.println("Qual a quantidade de caracteres especiais? ");
		int Char = entrada.nextInt();
		
		entrada.close();
		
		
		System.out.print("Sua senha é: ");
		
		metodo.senhaCompleta(Mai, Min, Num, Char);
	}
}
