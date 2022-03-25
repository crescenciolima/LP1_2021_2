
public class Automovel extends Veiculo {
	private String tipo;
	
	public Automovel(int m, int n, String t) {
		super(m, n);
		tipo = t;
	}
	
	public void imprimir() {
		System.out.println("-------------------");
		System.out.println("Motor: " + motor);
		System.out.println("Numero de rodas: " + n_rodas);
		System.out.println("Tipo do Automovel: " + tipo);
	}
}
