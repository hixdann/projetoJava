package metodos;

public class ExemploMetodos {

	public static void main(String[] args) {

		/* Para pedir para o usuário digitar o valor seria assim: 
		 * num1 = leia.nextInt()
		 * num2 = leianextInt() 
		 * somar(num1, num2);
		 */

		int resultado = somar(2, 5);
		System.out.println("O primeiro resultado é: " + resultado);

		System.out.println("O segundo resultado é: " + somar(8,3));
		
		falar("Pode ser, Bom dia");
		falar("O gato amarelo");
		
		falar("O primeiro resultado é " + resultado);
		
		ExemploMetodoExterno.mensagem();
		
	}

	// Definição do Método Somar - Método Com Retorno e Com Parametro (Static necessita de um valor para retorno)
	public static int somar(int x, int y) {
		return x + y; // 2 + 5
	}
	
	// Definição do Método Falar - Método Sem Retorno e Com Parametro (Void não precisa de valor; Como se fosse o Vacuo mesmo)
	public static void falar(String mensagem) {
		System.out.println(mensagem);
	}

}
