package estrutura_decisao;

import java.util.Scanner;

public class ExempoIf {

	public static void main(String[] args) {
		
			// variaveis
			float media;
		
			Scanner leia = new Scanner(System.in);
		
			// Entrada
			System.out.println("Digite a sua média: ");
			media = leia.nextFloat();
		
			// Processamento
			if(media >= 6) {
				System.out.println("Parabéns você foi aprovade! ");
		}

		leia.close();
		
	}
}