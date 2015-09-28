package l1;

public class Q3 {
	
	public static int soma(int a, int b){
		
		return a+ b;
	}
	
	
	public static int soma(int a, int b, int c) {
		int soma1 = soma(a,b);
		int somaFinal = soma(soma1,c);
		return somaFinal;
	}

	public static void main(String[] args) {
		System.out.println(soma(1, 1,1));
	}


}
