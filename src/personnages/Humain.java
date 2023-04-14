package personnages;

public class Humain {
	static final int MSIZE = 30;
	protected String nom;
	private String boisson;
	protected int argent;
	protected int nbConnaissance = 0;
	protected Humain[] memoire = new Humain[MSIZE];

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

	protected void gagnerArgent(int gain) {
		argent = argent + gain;
	}

	protected void perdreArgent(int perte) {
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
	
	public void faireConnaissanceAvec(Humain h2) {
		direBonjour();
		h2.repondre(this);
		memoriser(h2);
	}
	
	public void repondre(Humain h1) {
		direBonjour();
		memoriser(h1);
	}
	
	protected void memoriser(Humain humain) {
		memoire[nbConnaissance%MSIZE] = humain;
		nbConnaissance++;
	}
	
	public void listerConnaissance() {
		String s="";
		for(int i=0; (i<MSIZE && memoire[i]!=null); i++) {
			s = s + memoire[i].nom + ", ";
		}
		parler("Je connais beaucoup de monde dont : " + s.substring(0, s.length()-2));
	}
}
