package l1;

public class Q6 {


	
	public static void main(String[] args) {

		
		System.out.println("Sequencia -1 Numeros Primos Naturais:\n"
				+ imprimirNumerosPrimos(calculaPrimos(-1)));
		System.out.println("Sequencia  0 Numeros Primos Naturais:\n"
				+ imprimirNumerosPrimos(calculaPrimos(0)));
		System.out.println("Sequencia  1 Numeros Primos Naturais:\n"
				+ imprimirNumerosPrimos(calculaPrimos(1)));
		System.out.println("Sequencia  2 Numeros Primos Naturais:\n"
				+ imprimirNumerosPrimos(calculaPrimos(2)));
		
		System.out.println("Sequencia  3 Numeros Primos Naturais:\n"
		+ imprimirNumerosPrimos(calculaPrimos(3)));
		System.out.println("Sequencia  4 Numeros Primos Naturais:\n"
		+ imprimirNumerosPrimos(calculaPrimos(4)));

		System.out.println("Sequencia  5 Numeros Primos Naturais:\n"
		+ imprimirNumerosPrimos(calculaPrimos(5)));

		System.out.println("Sequencia  6 Numeros Primos Naturais:\n"
		+ imprimirNumerosPrimos(calculaPrimos(6)));
		System.out.println("Sequencia  7 Numeros Primos Naturais:\n"
				+ imprimirNumerosPrimos(calculaPrimos(7)));

		System.out.println("Sequencia  8 Numeros Primos Naturais:\n"
				+ ""				+ imprimirNumerosPrimos(calculaPrimos(8)));

		System.out.println("Sequencia  9 Numeros Primos Naturais:\n"
		+ imprimirNumerosPrimos(calculaPrimos(9)));
		System.out.println("Sequencia 10 Numeros Primos Naturais:\n"
		+ imprimirNumerosPrimos(calculaPrimos(10)));
		System.out.println("Sequencia 11 Numeros Primos Naturais:\n"
		+ imprimirNumerosPrimos(calculaPrimos(11)));

	}

	public static long[] calculaPrimos(long quantidade) {

		long numerosPrimos[] = null;
		int contPrimos = 0;
		long numerosPrimosAux[] = null;
		int tam = 0;
		for (int i = 2; tam != quantidade && quantidade >0 ; i++) {
			int primo = 0;

			for (int j = 1; j <= i; j++) {

				if (i % j == 0) {
					primo++;

				}

			}

			if (primo == 2) {

				contPrimos++;
			
				if(contPrimos== 1){
					numerosPrimos = new long[contPrimos];
					numerosPrimos[contPrimos - 1] = i;		
				}else{
					
					
					numerosPrimosAux = new long[numerosPrimos.length];	
				for (int k = 0; k < numerosPrimos.length; k++) {
					numerosPrimosAux[k] = numerosPrimos[k];
				}
				numerosPrimos = new long[contPrimos];
				numerosPrimos[contPrimos - 1] = i;

				for (int k = 0; k < numerosPrimosAux.length; k++) {
					numerosPrimos[k] = numerosPrimosAux[k];
				}
				}

			}
			
			tam = numerosPrimos.length;
		}

		return numerosPrimos;
		// TODO Auto-generated method stub

	}

	public static String imprimirNumerosPrimos(long[] numPrimos) {

		StringBuilder builder = new StringBuilder();
		builder.append("[");
		if (numPrimos != null) {
			for (int i = 0; i < numPrimos.length; i++) {

				builder.append(numPrimos[i]);
				if ((i + 1 != numPrimos.length) && i < numPrimos.length - 1) {
					builder.append(",");
				}

			}
		}
		builder.append("]");
		return builder.toString();
	}

}
