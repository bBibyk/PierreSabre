package personnages;

public class Yakuza extends Humain {
	private String clan;
	private int reputation = 0;
	
	public Yakuza(String nom, String boisson, int argent, String clan) {
		super(nom, boisson, argent);
		this.clan = clan;
	}
	
	public void extorquer(Commercant victime) {
		parler("Opa opa, chto za patsanchik anou siuda ! Gop Stop !");
		parler(victime.getNom() + ", diadia, goni babki!");
		int gain = victime.seFaireExtorquer();
		argent = argent + gain;
		reputation++;
		parler("Je viens d'extorquer " + victime.getNom() + ". Cela me fait " + gain + " sous en plus. J'ai donc " + argent + " au total. Hi! Hi!");
	}
}
