
public class ContaImposto extends ContaAbstrata{
	
	public ContaImposto(String c, double s) {
		super(c, s);
	}
	
	public void debitar(double valor) {
		double imposto = valor * 0.01;
		if(saldo > (valor+imposto)) {
			saldo = saldo - (valor+imposto);
		} else {
			System.out.println("Saldo insuficiente!");
		}
	}

}
