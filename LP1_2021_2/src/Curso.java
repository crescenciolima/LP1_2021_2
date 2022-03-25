
public class Curso {
	private String nome;
	private String codigo;
	
	public Curso(String nome_temp, String codigo_temp){
		nome = nome_temp;
		codigo = codigo_temp;
	}

	public String getNome(){
		return nome;
	}
	
	public void setNome(String nome_atual){
		nome = nome_atual;
	}
	
	public void imprimir_curso(){
		System.out.println("Nome do curso: " + nome);
		System.out.println("Codigo do curso: " + codigo);
	}
	
	
}
