package fr;

public class CompteRemunere extends Compte implements ICompteRemunere {
	protected double taux;
	
	public CompteRemunere (){
		this.numero = 0;
		this.solde = 0.0;
		this.taux = 0.0;
	}
	public CompteRemunere (int n, double s, double t){
		this.numero = n;
		this.solde = s;
		if (0 <= t || t <= 1)
			this.taux = t;
		else{
			this.taux = 0;
			System.out.println("Le taux doit etre entre 0 et 1 (valeur mise a 0 par defaut)");
		}
	}

	@Override
	public String toString() {
		return "CompteRemunere [numero=" + numero + ", solde=" + solde + ", taux=" + taux + "]";
	}
	
	public double calculerInterets(){
		return this.taux*this.solde;
	}
	public void verserInterets(){
		this.solde += this.calculerInterets(); 
	}
	
	public double getTaux(){
		return this.taux;
	}
	public void setTaux(double t){
		if (0 <= t || t <= 1)
			this.taux = t;
		else{
			this.taux = 0;
			System.out.println("Le taux doit etre entre 0 et 1 (valeur mise a 0 par defaut)");
		}
	}
}