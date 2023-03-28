package personnages;

public class Commercant extends Humain {
	public Commercant(String nom, int argent) {
		super(nom, "thé", argent);
	}
	
	public int seFaireExtorquer() {
		int perdu=argent;
		argent=0;
		parler("Ce monde est vraiment injuste!!!");
		return(perdu);
	}
	
	public void recevoir(int argent) {
		this.argent = this.argent + argent;
		parler(argent + " sous! Je te remercie généreux donateur!");
	}
}