public class Main {

	public static void main(String[] args) {
		Conta primeira_conta = new Conta("123", 100.0);
		Conta segunda_conta = new Conta("456");
		Conta terceira_conta = new Conta("789", 300.0);
		
		primeira_conta.creditar(100.0);
		segunda_conta.creditar(100.0);

		Poupanca quarta_conta = new Poupanca("111", 100.0, 10);
		ContaImposto quinta_conta = new ContaImposto("999", 100);
		quinta_conta.debitar(10);
		primeira_conta.debitar(10);
		//primeira_conta.imprimir();
		//quinta_conta.imprimir();
		
		/*
		ContaAbstrata [] testBD = new ContaAbstrata [5];
		testBD[0] = primeira_conta;
		testBD[1] = quarta_conta;
		testBD[2] = quinta_conta;
		System.out.println("Endereco do array: " + testBD);
		System.out.println("Endereco posicao 1: " + testBD[0]);
		System.out.println("Endereco posicao 2: " + testBD[1]);
		System.out.println("Endereco posicao 3: " + testBD[2]);
		*/
		
		quarta_conta.creditar(100.0);
		quarta_conta.renderJuros(0.01);
		//primeira_conta.imprimir();
		//quarta_conta.imprimir();
		
		ContaRepositorio BD = new ContaRepositorio();
		BD.inserir(primeira_conta);
		BD.inserir(segunda_conta);
		BD.inserir(terceira_conta);
		BD.inserir(quarta_conta);
		BD.inserir(quinta_conta);
		BD.imprimirContas();
		
	}
}
