package fr;

public class CompteASeuilRemunere extends CompteRemunere implements ICompteSeuil {
	
	protected double seuil;
	
	public CompteASeuilRemunere (){
		this.numero = 0;
		this.solde = 0.0;
		this.taux = 0.0;
		this.seuil = 0.0;
	}
	public CompteASeuilRemunere (int numero, double solde, double taux, double seuil){
		this.numero = numero;
		this.solde = solde;
		this.taux = taux;
		this.seuil = seuil;
	}
	
	public void retirer(double valeur){
		if (super.solde-valeur <= this.seuil)
			System.out.println("Essayez de retirer cette somme et nous allons vous prendre votre maison, vos vetements et votre chien!");
		else{
			this.solde -= valeur;
			System.out.println("L acte odieux que vous vous appretez a commettre a ete, malgre tout, tolere par notre instance supreme");
		}
	}
	public double getSeuil(){
		return this.seuil;
	}
	public void setSeuil(double s){
		this.seuil = s;
	}
}
