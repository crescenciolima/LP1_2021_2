
public class Caminhao extends Veiculo{
	private double carga;
	
	public Caminhao(int m, int n, double c) {
		super(m, n);
		carga = c;
	}
	
	public void imprimir() {
		System.out.println("-------------------");
		System.out.println("Motor: " + motor);
		System.out.println("Numero de rodas: " + n_rodas);
		System.out.println("Carga: " + carga);
	}
}
