package Questões;

public class Paciente {
	
	//Crie uma classe paciente e apresente os atributos e métodos referentes
	//esta classe, em seguida crie um objeto paciente, defina as instancias deste
	//objeto e apresente as informações deste objeto no console.

	private String nomeP;
	private String sintomas;
	private String temperatura;
	private String convênio;
	
	Paciente(String nomeP, String sintomas, String temperatura, String convênio){
	
        this.nomeP = nomeP;
        this.sintomas = sintomas;
        this.temperatura = temperatura;
        this.convênio = convênio;
    }

    public String getnomeP() {
        return nomeP;
    }
    public String getsintomas() {
        return sintomas;
    }
    public String gettemperatura() {
        return temperatura;
    }
    public String getconvênio() {
        return convênio;
    }

}
