package l1;

public class Q7 {

	public static int[] calculaUniaoDeArrays(int[] primeiro, int[] segundo) {

		int uniaoArrays[] = null;
		if (primeiro != null && segundo != null) {
			if (primeiro.length > 0 && segundo.length > 0) {
				uniaoArrays = new int[segundo.length + primeiro.length];
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
				uniaoArrays = new int[primeiro.length];

				for (int i = 0; i < uniaoArrays.length; i++) {

					uniaoArrays[i] = primeiro[i];

				}

			}

		} else if (segundo != null && primeiro == null) {
			if (segundo.length > 0) {
				uniaoArrays = new int[segundo.length];
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

	public static int[] ordenarCrescente(int[] uniaoArrays) {
		// TODO Auto-generated method stub
		
		for (int i = 0; i < uniaoArrays.length; i++) {
			if (i + 1 < uniaoArrays.length) {
				if (uniaoArrays[i + 1] < uniaoArrays[i]) {
					int aux = uniaoArrays[i];
					uniaoArrays[i] = uniaoArrays[i + 1];
					uniaoArrays[i + 1] = aux;

				}
			}

		}
		
		return uniaoArrays;
	}

	public static String imprimirUniaoArrays(int[] numFatorados) {

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
		int A[] = { 1, 2, 11 };
		int B[] = { 15, 16, 17, 18 };
		System.out.println(imprimirUniaoArrays(calculaUniaoDeArrays(A, B)));
		
		
		System.out.println(imprimirUniaoArrays(calculaUniaoDeArrays(null, null)));
		int C[] = A;
		A = null;
		System.out.println(imprimirUniaoArrays(calculaUniaoDeArrays(A, B)));
		B = null;
		
		System.out.println(imprimirUniaoArrays(calculaUniaoDeArrays(C, B)));
	}
}
