package br.com.generationex;

public class TestaTodos {
	
	public static void main(String[] args) {
		
		Cachorro cachorro = new Cachorro();
		Cavalo cavalo = new Cavalo();
		Preguiça preguiça = new Preguiça();
		
		cachorro.setNome("Ravenna");
		cachorro.setIdade(3);
		cachorro.setSom("Latido");
		cachorro.setmodoV("Corre");
		
		System.out.println("Nome: "+ cachorro.getNome() + ".");
		System.out.println("Idade: "+ cachorro.getIdade() + " anos.");
		System.out.println("Som: "+ cachorro.getSom() + ".");
		System.out.println("Modo de vida: " + cachorro.getmodoV() + ".");
		
		
		
		cavalo.setNome("Alazão");
		cavalo.setIdade(4);
		cavalo.setSom("Relincho");
		cavalo.setmodoV("Corre");
		
		System.out.println("\nNome: "+ cavalo.getNome() + ".");
		System.out.println("Idade: "+ cavalo.getIdade() + " anos.");
		System.out.println("Som: "+ cavalo.getSom() + ".");
		System.out.println("Modo de vida: " + cavalo.getmodoV() + ".");
		
		
		
		preguiça.setNome("Jade");
		preguiça.setIdade(15);
		preguiça.setSom("Incógnita");
		preguiça.setmodoV("Sobe em árvore");
		
		System.out.println("\nNome: "+ preguiça.getNome() +".");
		System.out.println("Idade: "+ preguiça.getIdade() + " anos.");
		System.out.println("Som: "+ preguiça.getSom() + ".");
		System.out.println("Modo de vida: " + preguiça.getmodoV() + ".");
		
	}

}
