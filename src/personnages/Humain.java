package personnages;

public class Humain {
	private String nom;
	private String boisson;
	protected int argent;

	public Humain(String nom, String boisson, int argent) {
		super();
		this.nom = nom;
		this.boisson = boisson;
		this.argent = argent;
	}

	public String getNom() {
		return nom;
	}

	protected void parler(String texte) {
		System.out.println("(" + nom + ")" + " - " + texte);
	}

	public void direBonjour() {
		parler("Bonjour ! Je m’appelle " + nom + " et j’aime boire du " + boisson);
	}

	public void boire() {
		parler("Mmmm, un bon verre de " + boisson + " ! GLOUPS !");
	}

	public void gagnerArgent(int gain) {
		argent = argent + gain;
	}

	public void perdreArgent(int perte) {
		assert(perte<=argent);
		argent = argent - perte;
	}

	public void acheter(String bien, int prix) {
		if(prix<=argent) {
			perdreArgent(prix);
			parler("J'ai " + argent + " sous en poche. Je vais pouvoir m'offrir " + bien + " à " + prix + " sous.");
		}else {
			parler("Je n'ai plus que " + argent + "sous en poche. Je ne peux pas m'offrir " + bien + " à " + prix + " sous.");
		}
	}
}
