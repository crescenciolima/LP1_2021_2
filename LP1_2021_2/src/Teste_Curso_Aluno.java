
public class Teste_Curso_Aluno {

	public static void main(String[] args) {
		Curso bsi = new Curso("BSI", "111");
	
		Aluno tiao = new Aluno("Sebatiao", 23, bsi);
		
		tiao.relatorio();
		
	}

}
