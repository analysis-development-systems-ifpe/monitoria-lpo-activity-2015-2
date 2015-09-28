package l1;

public class Q8 {
	
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

	

	

	public static long[] calculaUniaoDeArrays(long[] primeiro, long[] segundo) {

														
		long uniaoArrays[] = null;
		if (primeiro != null && segundo != null) {
			if (primeiro.length > 0 && segundo.length > 0) {
				uniaoArrays = new long[segundo.length + primeiro.length];
				int contTamSeg = 0;
				for (int i = 0; i < uniaoArrays.length; i++) {

					if (i < primeiro.length) {
						uniaoArrays[i] = primeiro[i];
					} else {

						uniaoArrays[i] = segundo[contTamSeg];
						contTamSeg++;
					}

				}

			

			}
		} else if (primeiro != null && segundo == null) {
			if (primeiro.length > 0) {
				uniaoArrays = new long[primeiro.length];

				for (int i = 0; i < uniaoArrays.length; i++) {

					uniaoArrays[i] = primeiro[i];

				}

			}

		} else if (segundo != null && primeiro == null) {
			if (segundo.length > 0) {
				uniaoArrays = new long[segundo.length];
				for (int i = 0; i < uniaoArrays.length; i++) {

					uniaoArrays[i] = segundo[i];

				}

			}

		}
		
		if(uniaoArrays != null){
		uniaoArrays = ordenarCrescente(uniaoArrays);
		}
		return uniaoArrays;

	}

	public static long[] ordenarCrescente(long[] uniaoArrays) {
		// TODO Auto-generated method stub
		
		for (int i = 0; i < uniaoArrays.length; i++) {
			if (i + 1 < uniaoArrays.length) {
				if (uniaoArrays[i + 1] < uniaoArrays[i]) {
					long aux = uniaoArrays[i];
					uniaoArrays[i] = uniaoArrays[i + 1];
					uniaoArrays[i + 1] = aux;

				}
			}

		}
		
		return uniaoArrays;
	}

	
	
	public static String imprimirUniaoArraysPrimos(long[] numPrimos) {

		StringBuilder builder = new StringBuilder();
		builder.append("[");
		if (numPrimos != null) {
			for (int i = 0; i < numPrimos.length; i++) {

				builder.append(numPrimos[i]);
				if ((i + 1 != numPrimos.length)
						&& i < numPrimos.length - 1) {
					builder.append(",");
				}

			}
		}
		builder.append("]");
		return builder.toString();
	}
	
	public static long[] calculaMaisPrimos(long quantidade, long []primos){
		long quantPrimos [] = calculaPrimos(quantidade);
	
		long uniaoArrays [] =  calculaUniaoDeArrays(quantPrimos, primos);
		
		long uniaoArraysOrdenadosCrescentes [] =  ordenarCrescente(uniaoArrays);
		
		return uniaoArraysOrdenadosCrescentes;
		
	}

	public static void main(String[] args) {
	
	 long primos[] = { 97,53, 89, 59, 83, 61, 79, 67, 73, 71 };
		long quantidade = 15;
		
		System.out.println(imprimirUniaoArraysPrimos(calculaMaisPrimos(quantidade, primos)));
		
	}
}
