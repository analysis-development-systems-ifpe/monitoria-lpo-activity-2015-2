package l1;

import java.awt.SecondaryLoop;

public class Q9 {

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
	
	public static long [] checarMaiorQuantidadeNumerosFatores(long [] uniaoDeFatores, int contItemArrayA, int contItemArrayB, long numero){
		
		
	
			if (contItemArrayA >= contItemArrayB) {

			
					uniaoDeFatores = atualizaArrayUniao(uniaoDeFatores,
							numero, contItemArrayA);
		

			} else {
			
					uniaoDeFatores = atualizaArrayUniao(uniaoDeFatores,
							numero, contItemArrayB);
			

			}// endElse

		return uniaoDeFatores;
		

		
		
	}

	public static String imprimirUniaoArraysFatores(long[] numFatores) {

		StringBuilder builder = new StringBuilder();
		builder.append("[");
		if (numFatores != null) {
			for (int i = 0; i < numFatores.length; i++) {

				builder.append(numFatores[i]);
				if ((i + 1 != numFatores.length) && i < numFatores.length - 1) {
					builder.append(",");
				}

			}
		}
		builder.append("]");
		return builder.toString();
	}

	public static long[] calculaUniaoDeFatores(long primeiroConjunto[],
			long segundoConjunto[]) {
		long uniaoDeFatores[] = null;

		long ant = primeiroConjunto[0] - 1;

		int contItemArrayA = 1;
		int contItemArrayB = 0;
		int indArrayBequalA = 0;
		boolean flagNumDisjBinA = true;
		boolean flagNovoNum = false;
		boolean flagConfArrayB = false;

		for (int i = 0; i < primeiroConjunto.length; i++) {

			
		
			
			if (primeiroConjunto[i] == ant) {
				// ant = primeiroConjunto[i];
				contItemArrayA++;
				if ((i + 1) == primeiroConjunto.length) {
					//flagNovoNum = true;
					uniaoDeFatores = checarMaiorQuantidadeNumerosFatores(uniaoDeFatores, contItemArrayA, contItemArrayB, ant);
				}	

			} else {
				
				if (i > 0) {
					uniaoDeFatores = checarMaiorQuantidadeNumerosFatores(uniaoDeFatores, contItemArrayA, contItemArrayB, ant);
					
				}
				
				flagConfArrayB = true;
				contItemArrayB = 0;
				contItemArrayA = 1;
				

				
 				

			}
			
		
			
			

			if (flagConfArrayB) {
				for (int j = indArrayBequalA; j < segundoConjunto.length; j++) {

					if (primeiroConjunto[i] == segundoConjunto[j]) {
						contItemArrayB++;
						indArrayBequalA = j;
					}


				}// endIF
				flagNumDisjBinA = false;

				flagConfArrayB = false;
			}// endIf

		
			flagNovoNum = false;
			ant = primeiroConjunto[i];
			
		}
		
		int anterior;
		long temp []  = uniaoDeFatores;
		for (int j = 0; j < segundoConjunto.length; j++) {
			boolean contVerifica= false;
			
				for (int k = 0; k < temp.length; k++) {
					if(segundoConjunto[j] == temp[k]){
						contVerifica = true;
						break;
					}
				}
				if(!contVerifica){
					uniaoDeFatores = atualizaArrayUniao(uniaoDeFatores, segundoConjunto[j], 1);
				}
		}
		uniaoDeFatores = ordenarCrescente(uniaoDeFatores);

		return uniaoDeFatores;

	}

	public static long[] atualizaArrayUniao(long[] uniaoDeFatores, long ant,
			int contItemArrayA) {
		// TODO Auto-generated method stub
		long numerosAux[] = null;
		for (int i = 0; i < contItemArrayA; i++) {

			if (i == 0 && uniaoDeFatores == null) {
				
				uniaoDeFatores = new long[i + 1];
				uniaoDeFatores[i] = ant;
			} else {

				numerosAux = new long[uniaoDeFatores.length];
				for (int k = 0; k < numerosAux.length; k++) {
					numerosAux[k] = uniaoDeFatores[k];
				}
				uniaoDeFatores = new long[numerosAux.length + 1];
				uniaoDeFatores[numerosAux.length] = ant;

				for (int k = 0; k < numerosAux.length; k++) {
					uniaoDeFatores[k] = numerosAux[k];
				}
			}

		}

		return uniaoDeFatores;
	}

	public static void main(String[] args) {

		long primeiorConjunto[] = { 2, 2, 2, 3, 3, 4, 4, 4 };
		long segundoConjunto[] = { 2, 3, 3, 3, 4, 5, 5 };
		long uniaoDeFatore2 [] = null;
		System.out.println(imprimirUniaoArraysFatores(calculaUniaoDeFatores(
				primeiorConjunto, segundoConjunto)));
		System.out.println(imprimirUniaoArraysFatores(calculaUniaoDeFatores(
				segundoConjunto,primeiorConjunto )));
		//System.out.println(imprimirUniaoArraysFatores(atualizaArrayUniao(uniaoDeFatore2, 2, 3)));

	}
}
