package Quest�es;

public class Paciente {
	
	//Crie uma classe paciente e apresente os atributos e m�todos referentes
	//esta classe, em seguida crie um objeto paciente, defina as instancias deste
	//objeto e apresente as informa��es deste objeto no console.

	private String nomeP;
	private String sintomas;
	private String temperatura;
	private String conv�nio;
	
	Paciente(String nomeP, String sintomas, String temperatura, String conv�nio){
	
        this.nomeP = nomeP;
        this.sintomas = sintomas;
        this.temperatura = temperatura;
        this.conv�nio = conv�nio;
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
    public String getconv�nio() {
        return conv�nio;
    }

}
