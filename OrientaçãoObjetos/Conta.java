package Questões;

public class Conta {

	//Crie uma classe conta bancaria e apresente os atributos e métodos
	//referentes esta classe, em seguida crie um objeto conta bancaria, defina
	//as instancias deste objeto e apresente as informações deste objeto no console.
	
	private String nome;
	private String tipoC;
	private String banco;
	private double saldo = 1;
	
	void positivoS(){
		System.out.println("Conta com saldo positivo.");
	}
	
	public void setnome(String nome) {
		this.nome = nome;
	}
	
	public String getnome() {
		return nome;
	}
	
	public void settipoC(String tipoC) {
		this.tipoC = tipoC;
	}
	
	public String gettipoC() {
		return tipoC;
	}
	
	public void setbanco(String banco) {
		this.banco = banco;
	}
	
	public String getbanco() {
		return banco;
	}
	    
	public void setsaldo(double saldo) {
		this.saldo = saldo;
		
	}
	
	public double getsaldo() {
		return saldo;
	}
	
	void negativoS() {
		System.out.println("Conta com saldo negativo");
	}
}
