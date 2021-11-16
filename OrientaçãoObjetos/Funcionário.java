package Questões;

public class Funcionário {
	
	//Crie uma classe funcionário e apresente os atributos e métodos
	//referentes esta classe, em seguida crie um objeto funcionário, defina as
	//instancias deste objeto e apresente as informações deste objeto no
	//console.

	private String nome;
	private String setor;
	private String cargo;
	private String qualidadeT;
	private int periodoT;
	
	void promoção(){
		System.out.println("Funcionário merece promoção.");
	}
	
	public void setnome(String nome) {
		this.nome = nome;
	}
	
	public String getnome() {
		return nome;
	}
	
	public void setsetor(String setor) {
		this.setor = setor;
	}
	
	public String getsetor() {
		return setor;
	}
	
	public void setcargo(String cargo) {
		this.cargo = cargo;
	}
	
	public String getcargo() {
		return cargo;
	}
	
	public void setqualidadeT(String qualidadeT) {
		this.qualidadeT = qualidadeT;
	}
	
	public String getqualidadeT() {
		return qualidadeT;
}
	public void setperiodoT(int periodoT) {
		this.periodoT = periodoT;
	}
	
	public int getperiodoT () {
		return periodoT;
  }
	
	void nãoPromoção() {
		System.out.println("Funcionário não merece promoção.");
	}
}
	
