
public class Aluno {
	private String nome;
	private int idade;
	private Curso curso_aluno;
	
	public Aluno(String nome_temp, int idade_temp, Curso curso_temp){
		nome = nome_temp;
		idade = idade_temp;
		curso_aluno = curso_temp;
	}
	
	public void relatorio(){
		System.out.println("Nome do aluno: " + nome);
		System.out.println("Idade do aluno: " + idade);
		curso_aluno.imprimir_curso();
	}
	
}
