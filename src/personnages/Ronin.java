package personnages;

public class Ronin extends Humain {
	int honeur = 1;
	
	public Ronin(String nom, String boisson, int argent){
		super(nom, boisson, argent);
	}
	
	public void donner(Commercant beneficiaire) {
		int ded = argent/10;
		if(ded>0) {
			parler(beneficiaire.getNom() + " prends ces " + ded + " sous.");
			beneficiaire.recevoir(ded);
			argent = argent - ded;
		} else {
			parler("Je n'ai rien à donner");
		}
		
	}
}
