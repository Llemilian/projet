package fr;

public class Main {

	public static void main(String[] args) {
		Client toto = new Client("To", "To", 6, 13);
		Compte cpt = new Compte(6, 18.0);
//		CompteRemunere cR = new CompteRemunere(1, 150, 0.2);
		CompteASeuilRemunere cASR = new CompteASeuilRemunere(3, 300, 0.15, -50);
		toto.ajouterCompte(cpt);
		toto.ajouterCompte(cASR);
		System.out.println(toto);
	}
}
