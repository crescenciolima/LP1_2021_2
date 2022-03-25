
public abstract class ContaAbstrata {
	protected String numero_conta; 
	protected double saldo; 
	
	public ContaAbstrata(String numero_conta, double saldo_temp){
		this.numero_conta = numero_conta;
		saldo = saldo_temp;
	}
	
	public ContaAbstrata(String numero_conta){
		this.numero_conta = numero_conta;
		saldo = 0.0;
	}
	
	public abstract void debitar(double valor);
	
	public void setNumero_conta(String numero_temp){
		numero_conta = numero_temp;
	}
	
	public String getNumero_conta(){
		return numero_conta;
	}
	
	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public void creditar(double valor){
		saldo = saldo + valor;
	}
	
	public void imprimir(){
		System.out.println("----------------");
		System.out.println("Numero da Conta: " + numero_conta);
		System.out.println("Saldo: " + saldo);
	}

}
