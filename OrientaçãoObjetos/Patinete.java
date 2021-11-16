package Questões;

public class Patinete {
	
	// Crie uma classe patinete e apresente os atributos e métodos referentes
	// esta classe, em seguida crie um objeto patinete, defina as instancias deste
	// objeto e apresente as informações deste objeto no console.

	
	private String marca;
	private String cor;
	private int velocidade;
	private int rodas;

	
	public void setmarca(String marca) {
		this.marca = marca;
	}
	
	public String getmarca() {
		return marca;
	}
	
	public void setcor(String cor ) {
		this.cor = cor;
	}
	
	public String getcor() {
		return cor;
	}
	
	public void setvelocidade(int velocidade) {
		this.velocidade = velocidade;
	}
	
	public int getvelocidade() {
		return velocidade;
	}
	
	public void setrodas(int rodas ) {
		this.rodas = rodas;
	}
	
	public int getrodas() {
		return rodas;
	}
	
}
