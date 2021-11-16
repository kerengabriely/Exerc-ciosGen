package Questões;

public class Cliente {
	
	// Crie uma classe cliente e apresente os atributos e métodos referentes
	//esta classe, em seguida crie um objeto cliente, defina as instancias deste
	// objeto e apresente as informações deste objeto no console.
	
	private String nome;
	private String sexo;
	private int idade;
	
	void olhando() {
		System.out.println("Cliente apenas olhando.");
	}
	
	public String getnome() {
		return nome;
	}
	
	public void setnome(String nome) {
		this.nome = nome;	
	}
	
	public String getsexo(){
		return sexo;
	}
	
	public void setsexo(String sexo){
	    this.sexo = sexo;
	}
	
	public int getidade() {
		return idade; 
	}
	
	public void setidade(int idade) {
		this.idade = idade; 		
	}
	
	void comprou() {
		System.out.println("Cliente comprou.");
	}
}
