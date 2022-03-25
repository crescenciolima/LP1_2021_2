
public class Poupanca extends Conta{
	private int ID;
	
	public Poupanca(String numero_conta, double saldo, int ID){
		super(numero_conta, saldo);
		this.ID = ID;
	}
	
	public void renderJuros(double taxa){
		saldo = saldo + (saldo*taxa);
	}	
	
	public void imprimir() {
		super.imprimir();
		System.out.println("Identificação: " + ID);
	}
	
}