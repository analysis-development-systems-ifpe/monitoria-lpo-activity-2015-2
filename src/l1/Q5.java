package l1;

public class Q5 {

	public static boolean ehPrimo(int numero) {
		int contPrimo = 0;
		for (int i = 1; i <= numero; i++) {

			if (numero % i == 0) {
				contPrimo++;
			}
		}
		if (contPrimo > 2) {
			// System.out.println("O numero " + numero + "NÃO é primo!");
			return false;
		} else {
			// System.out.println("O numero " + numero + "É primo!!!");
			return true;
		}

	}

	public static int[] fatoraValor(int valor) {

		int cont = 2;
		int fatoresAux[] = null;
		int fatores[] = null;
		int tamanho = 1;

		if (valor > 2) {
			while (true) {

				if(tamanho == 4){
					System.out.println();
				}
				
				if (valor % cont == 0 && ehPrimo(cont)) {
					valor = valor / cont;

					fatoresAux = new int[tamanho];

					if (tamanho == 1) {
						fatoresAux[tamanho - 1] = cont;
						
					} else {

						if (fatores != null) {
							for (int i = 0; i < fatores.length; i++) {
								fatoresAux[i] = fatores[i];
							}
						}

					}

					
					fatores = new int[tamanho];
					

					for (int i = 0; i < fatoresAux.length; i++) {
						fatores[i] = fatoresAux[i];
					}
					
					fatores[tamanho - 1] = cont;
					
					tamanho++;
					// fatoresAux = null;
					cont = 2;

					if (valor == 1) {

						break;

					}

				} else {
					cont++;
				}
				System.out.println(imprimirNumeroFatorados(fatores));

			}

		} else {
			System.out.println("O número " + valor
					+ " NÃO pode ser FATORADO!!!");
		}

		return fatores;
	}

	public static String imprimirNumeroFatorados(int[] numFatorados) {

		StringBuilder builder = new StringBuilder();
		builder.append("[");
		if (numFatorados != null) {
			for (int i = 0; i < numFatorados.length; i++) {

				builder.append(numFatorados[i]);
				if ((i + 1 != numFatorados.length)
						&& i < numFatorados.length - 1) {
					builder.append(",");
				}

			}
		}
		builder.append("]");
		return builder.toString();
	}

	public static void main(String[] args) {

		// System.out.println(imprimirNumeroFatorados(fatoraValor(80)));
		System.out.println(imprimirNumeroFatorados(fatoraValor(60)));
		// System.out.println(imprimirNumeroFatorados(fatoraValor(1)));
		// /System.out.println(imprimirNumeroFatorados(fatoraValor(-1)));

	}

}
