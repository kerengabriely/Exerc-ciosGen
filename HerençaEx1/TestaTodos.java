package br.com.generationex;

public class TestaTodos {
	
	public static void main(String[] args) {
		
		Cachorro cachorro = new Cachorro();
		Cavalo cavalo = new Cavalo();
		Pregui�a pregui�a = new Pregui�a();
		
		cachorro.setNome("Ravenna");
		cachorro.setIdade(3);
		cachorro.setSom("Latido");
		cachorro.setmodoV("Corre");
		
		System.out.println("Nome: "+ cachorro.getNome() + ".");
		System.out.println("Idade: "+ cachorro.getIdade() + " anos.");
		System.out.println("Som: "+ cachorro.getSom() + ".");
		System.out.println("Modo de vida: " + cachorro.getmodoV() + ".");
		
		
		
		cavalo.setNome("Alaz�o");
		cavalo.setIdade(4);
		cavalo.setSom("Relincho");
		cavalo.setmodoV("Corre");
		
		System.out.println("\nNome: "+ cavalo.getNome() + ".");
		System.out.println("Idade: "+ cavalo.getIdade() + " anos.");
		System.out.println("Som: "+ cavalo.getSom() + ".");
		System.out.println("Modo de vida: " + cavalo.getmodoV() + ".");
		
		
		
		pregui�a.setNome("Jade");
		pregui�a.setIdade(15);
		pregui�a.setSom("Inc�gnita");
		pregui�a.setmodoV("Sobe em �rvore");
		
		System.out.println("\nNome: "+ pregui�a.getNome() +".");
		System.out.println("Idade: "+ pregui�a.getIdade() + " anos.");
		System.out.println("Som: "+ pregui�a.getSom() + ".");
		System.out.println("Modo de vida: " + pregui�a.getmodoV() + ".");
		
	}

}
