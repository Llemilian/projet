package fr;

import java.util.Arrays;

public class Client {
	private String nom, prenom;
	private int age, numero;
	private Compte[] tab = new Compte[5];
	private int nbCompte;
	
	public Client (String nom, String prenom, int age, int numero){
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
		this.numero = numero;
		this.nbCompte = 0;
	}
	
	public String toString() {
		return "Client [nom=" + nom + ", prenom=" + prenom + ", age=" + age + ", numero=" + numero + ", tab="
				+ Arrays.toString(tab) + "]";
	}

	/*public void ajouterCompte (Compte c){					// Test : ok
		int i;
		for (i = 0; i<5; i++){
			if (this.tab[i] == null){
				this.tab[i] = c;
				break;
			}
		}
		if (i == 5)
			System.out.println(this.prenom + this.nom + " possede deja le nombre maximum de comptes autorise");
	}*/
	
	public void ajouterCompte (Compte c){					// Test : ok
		if (this.nbCompte < 5){
			this.tab[nbCompte] = c;
			this.nbCompte ++;
		}
		else
			System.out.println(this.prenom + this.nom + " possede deja le nombre maximum de comptes autorise");
	}
	public Compte getCompte(int n ){
		Compte rep = null;
		int i = 0;
		boolean trouve = false;
		while (i < this.nbCompte && !trouve){
			if (this.tab[i].numero == n){
				rep = this.tab[i];
				trouve = true;
			}
			i++;
		}
		return rep;
	}
	
	public Compte[] getCompte(){
		return this.tab;
	}
}
