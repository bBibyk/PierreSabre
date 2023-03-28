package personnages;

public class Ronin extends Humain {
	private int honneur = 1;
	
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
	
	public void provoquer(Yakuza adversaire) {
		int force = honneur*2;
		if(force>=adversaire.getReputation()) {
			parler("Je t'ai trouvé vermine, tu vas payer pour ce que tu as fait à ce pauvre marchand!");
			parler("Je t'ai eu petit yakuza");
			argent = argent + adversaire.perdre();
			honneur++;
		} else {
			parler("J'ai perdu contre ce yakuza, mon honneur et ma bourse en ont pris un coup");
			honneur--;
			adversaire.gagner(argent);
			argent = 0;
		}
	}
}
