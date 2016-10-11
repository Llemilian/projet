package fr;

public class Compte {
	protected int numero;
	protected double solde;
	
	public Compte(){
		this.numero = 0;
		this.solde = 0.0;
	}
	
	public Compte(int num, double s){
		this.numero = num;
		this.solde = s;
	}
//		public String toString(){
//		}
	
	public void ajouter (double montant){				//Verif : ok
		this.solde += montant;
	}
	public void retirer (double montant){				//Verif : ok
		this.solde -= montant;
	}

	@Override
	public String toString() {							//Verif : ok
		return "Compte [numero=" + numero + ", solde=" + solde + "]";
	}
}
