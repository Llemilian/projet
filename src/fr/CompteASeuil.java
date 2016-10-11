package fr;

public class CompteASeuil extends Compte implements ICompteSeuil {
	private double seuil;
	
	public CompteASeuil (){
		this.numero = 0;
		this.solde = 0.0;
		this.seuil = 0.0;
	}
	public CompteASeuil (int n, double s, double se){
		this.numero = n;
		this.solde = s;
		this.seuil = se;
	}
	
	public void retirer(double val){
		if (super.solde-val <= this.seuil)
			System.out.println("Essayez de retirer cette somme et nous allons vous prendre votre maison, vos vetements et votre chien!");
		else{
			this.solde -= val;
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
