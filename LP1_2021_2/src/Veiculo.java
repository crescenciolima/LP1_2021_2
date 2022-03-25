
public abstract class Veiculo {
	protected int motor;
	protected int n_rodas;
	
	public Veiculo(int m, int n) {
		motor = m;
		n_rodas = n;
	}
	
	public void setN_rodas(int n) {
		n_rodas = n;
	}
	
	public int getN_rodas() {
		return n_rodas;
	}
	
	public abstract void imprimir();
	
}
