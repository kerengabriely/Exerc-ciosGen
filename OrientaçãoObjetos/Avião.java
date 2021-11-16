package Questões;

public class Avião {
	
	// Crie uma classe avião e apresente os atributos e métodos referentes
	// esta classe, em seguida crie um objeto avião, defina as instancias deste
	// objeto e apresente as informações deste objeto no console.

	private String companhia;
	private String cor; 
	private int quantidadeP;
	private int velocidadeA;
	
	void decolagem(){
		System.out.println("O avião pode decolar.");
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
	
	void nãoDecolagem() {
		System.out.println("O avião não pode decolar.");
	}
}
