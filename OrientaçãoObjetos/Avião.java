package Quest�es;

public class Avi�o {
	
	// Crie uma classe avi�o e apresente os atributos e m�todos referentes
	// esta classe, em seguida crie um objeto avi�o, defina as instancias deste
	// objeto e apresente as informa��es deste objeto no console.

	private String companhia;
	private String cor; 
	private int quantidadeP;
	private int velocidadeA;
	
	void decolagem(){
		System.out.println("O avi�o pode decolar.");
	}
	
	public String getcompanhia() {
		return companhia;
	}
	
	public void setcompanhia(String companhia) {
		this.companhia = companhia;	
	}
	
	public String getcor() {
		return cor;
	}
	
	public void setcor(String cor) {
		this.cor = cor;	
	}
	
	public int getqunatidadeP() {
		return quantidadeP;
	}
	
	public void setquantidadeP (int quantidadeP) {
		this.quantidadeP = quantidadeP;	
	}
	
	public int getvelocidadeA() {
		return velocidadeA;
	}
	
	public void setvelocidadeA(int velocidadeA) {
		this.velocidadeA = velocidadeA;	
	}
	
	void n�oDecolagem() {
		System.out.println("O avi�o n�o pode decolar.");
	}
}
