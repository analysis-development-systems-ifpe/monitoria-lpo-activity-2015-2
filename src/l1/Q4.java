package l1;

public class Q4 {
	
	public static boolean verificaValorPar(int valor){
		
		if(valor%2 ==0 ){
			return true;
		}else{
			return false;
		}
	}
	
	

	public static void main(String[] args) {
		System.out.println(verificaValorPar(1));
		System.out.println(verificaValorPar(2));
	}


}
