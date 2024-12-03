package introducao;

import java.util.Scanner; // Importando Scanner da biblioteca do java, para dentro da classe.
public class EntradaSaida {

	public static void main(String[] args) {
		
		// Variaveis
		String nome;
		float temp;
		float fahre;
		
		Scanner leia = new Scanner(System.in);
		
		// Entrada de dados - Pedir/Inserir o nome da pessoa usuária e a temperatura.
		System.out.println("Insira o seu nome: ");
		nome = leia.next(); // .nextLine();
		
		System.out.println("Insira a temperatura em célsius: ");
		temp = leia.nextFloat();
		
		// Processamento
		fahre = temp * 1.8f + 32;
		
		
		// Saída dos dados
		System.out.println("Bom dia, " + nome); //  Concatenação
		System.out.println("A temperatura em Fahrenhiet é: " + fahre + "°"); //  Concatenação
		System.out.printf("A temperatura em Fahrenhiet é: %.1f°", fahre); 
		


	}

}
