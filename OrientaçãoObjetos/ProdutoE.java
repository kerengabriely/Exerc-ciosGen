package Quest�es;

public class ProdutoE {
	
	// Crie uma classe produto eletr�nico e apresente os atributos e m�todos
	// referentes esta classe, em seguida crie um objeto produto eletr�nico,
	// defina as instancias deste objeto e apresente as informa��es deste objeto no console.

	private String marca;
	private String modelo;
	private String cor;
	private int mem�riaI;
	
	void bomCelular() {
		System.out.println("�timo funcionamento.");
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
	
	public void setmem�riaI(int mem�riaI) {
		this.mem�riaI = mem�riaI;
	}
	
	public int getmem�ria() {
		return mem�riaI;
	}

	void ruimCelular() {
		System.out.println("P�ssimo estado eletr�nico.");
	}

	}
