
public class Conta extends ContaAbstrata {
	
	public Conta(String c, double s) {
		super(c, s);
	}
	
	public Conta(String c) {
		super(c);
	}
	
	public void debitar(double valor){
		if(saldo > valor){
			saldo = saldo - valor;
		} else {
			System.out.println("Saldo insuficiente");
		}
	}
}
