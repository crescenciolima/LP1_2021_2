
public class Teste {

	static int soma(int x, int y){
		int total = x + y;
		return total;
	}
	
	static int soma(int y){
		return 10 + y;
	}
	
	static double subtracao(double k, double w){
		return soma((int)k) - w;
	}
	
	public static void main(String[] args) {
		System.out.println("Linha 1");
		int n1, n2;
		n1 = 5;
		n2 = 5;
		
		soma(0, 2);
		
		System.out.println(soma(n1, n2));
		System.out.println("Linha 2");
		for(int i = 0; i < 10; i++){
			System.out.println(soma(i, i));
		}	
	}
}
