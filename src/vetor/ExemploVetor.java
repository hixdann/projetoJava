package vetor;

public class ExemploVetor {

	public static void main(String[] args) {

		String cachorros[] = { "Boxer", "Pastor Alemão", "Pinscher", "Husky Siberiano", "Corgi" };
			// Tipo nome_vetor [] = {valore}
		for (int indice = 0; indice < 5; indice++) { // indice = indice(1) + 1
			System.out.println((indice + 1) + "º elemento: " + cachorros[indice]);
			
		}
		
		// nome_vetor [indice ]
		// rua [1] == "João"
		
		// cachorro [0] = "Boxer"
		// cachorro [1] = "Pastor Alemão"
	}

}
