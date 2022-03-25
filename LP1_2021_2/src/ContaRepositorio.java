
public class ContaRepositorio {
	private ContaAbstrata [] BD;
	private int indice;

	public ContaRepositorio(){
		indice = 0;
		BD = new ContaAbstrata[10];
	}
	
	public void inserir(ContaAbstrata c){
		BD[indice] = c;
		indice++;
	}
	
	public void imprimirContas(){
		for(int i = 0; i < indice; i++){
			BD[i].imprimir();
		}
	}	
}
