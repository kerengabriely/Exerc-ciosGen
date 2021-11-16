package Questões;

public class ProdutoE {
	
	// Crie uma classe produto eletrônico e apresente os atributos e métodos
	// referentes esta classe, em seguida crie um objeto produto eletrônico,
	// defina as instancias deste objeto e apresente as informações deste objeto no console.

	private String marca;
	private String modelo;
	private String cor;
	private int memóriaI;
	
	void bomCelular() {
		System.out.println("Ótimo funcionamento.");
	}
	
	public void setmarca(String marca) {
		this.marca = marca;
	}
	
	public String getmarca() {
		return marca;
	}
	
	public void setmodelo(String modelo) {
		this.modelo = modelo;
	}
	
	public String getmodelo() {
		return modelo;
	}
	
	public void setcor(String cor) {
		this.cor = cor;
	}
	
	public String getcor() {
		return cor;
	}
	
	public void setmemóriaI(int memóriaI) {
		this.memóriaI = memóriaI;
	}
	
	public int getmemória() {
		return memóriaI;
	}

	void ruimCelular() {
		System.out.println("Péssimo estado eletrônico.");
	}

	}
