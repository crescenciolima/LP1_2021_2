
public class VeiculoTest {

	public static void main(String[] args) {
		Automovel uno = new Automovel(10, 4, "Era_economico");
		//uno.imprimir();
		
		Caminhao scania = new Caminhao(200, 16, 20.0);
		//scania.imprimir();
		
		Veiculo [] BD = new Veiculo[5];
		BD[0] = uno;
		BD[1] = scania;
		
		for(int i = 0; i < 2; i++) {
			BD[i].imprimir();
		}
	}
}
