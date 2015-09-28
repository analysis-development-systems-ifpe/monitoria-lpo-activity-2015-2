package l1;

public class Q10 {

	public static long calculaMMCPorFatoracao(long valor1, long valor2) {

		long numFatoresVal1[] = fatoraValor(valor1);
		long numFatoresVal2[] = fatoraValor(valor2);
		long[] uniaoFatores = Q9.calculaUniaoDeFatores(numFatoresVal1,
				numFatoresVal2);
		long resultaMMC = calculaMMC(uniaoFatores);

		return resultaMMC;
	}

	public static long calculaMMC(long[] numFatoresVal1) {
		// TODO Auto-generated method stub
		long cont = 1;
		for (int i = 0; i < numFatoresVal1.length; i++) {
			cont = numFatoresVal1[i] * cont;

		}
		return cont;
	}

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

	public static long[] fatoraValor(long valor) {

		int cont = 2;
		long fatoresAux[] = null;
		long fatores[] = null;
		int tamanho = 1;

		if (valor > 2) {
			while (true) {

				if (valor % cont == 0 && ehPrimo(cont)) {
					valor = valor / cont;

					fatoresAux = new long[tamanho];

					if (tamanho == 1) {
						fatoresAux[tamanho - 1] = cont;
					} else {

						if (fatores != null) {
							for (int i = 0; i < fatores.length; i++) {
								fatoresAux[i] = fatores[i];
							}
						}

					}

				
					fatores = new long[tamanho];
				

					for (int i = 0; i < fatoresAux.length; i++) {
						fatores[i] = fatoresAux[i];
					}
					// fatoresAux = null;

					fatores[tamanho - 1] = cont;

					tamanho++;
					cont = 2;

					if (valor == 1) {

						break;

					}

				} else {
					cont++;
				}

			}

		} else {
			System.out.println("O número " + valor
					+ " NÃO pode ser FATORADO!!!");
		}

		return fatores;
	}

	public static String imprimirMMC(long numFatorado) {

		StringBuilder builder = new StringBuilder();
		builder.append("[");

		builder.append(numFatorado);
		builder.append("]");
		return builder.toString();
	}

	public static void main(String[] args) {

		System.out.println(imprimirMMC(calculaMMCPorFatoracao(60, 80)));

	}

}
