package Quest�es;

public class Funcion�rio {
	
	//Crie uma classe funcion�rio e apresente os atributos e m�todos
	//referentes esta classe, em seguida crie um objeto funcion�rio, defina as
	//instancias deste objeto e apresente as informa��es deste objeto no
	//console.

	private String nome;
	private String setor;
	private String cargo;
	private String qualidadeT;
	private int periodoT;
	
	void promo��o(){
		System.out.println("Funcion�rio merece promo��o.");
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
	
	void n�oPromo��o() {
		System.out.println("Funcion�rio n�o merece promo��o.");
	}
}
	
