package personnages;

public class Yakuza extends Humain {
	private String clan;
	private int reputation = 0;
	
	public Yakuza(String nom, String boisson, int argent, String clan) {
		super(nom, boisson, argent);
		this.clan = clan;
	}
	
	@Override
	public void direBonjour() {
		super.direBonjour();
		parler("Mon clan est celui de " + clan);
	}
	
	public int getReputation() {
		return(reputation);
	}
	
	public void extorquer(Commercant victime) {
		parler("Opa opa, chto za patsanchik anou siuda ! Gop Stop !");
		parler(victime.getNom() + ", diadia, goni babki!");
		int gain = victime.seFaireExtorquer();
		argent = argent + gain;
		reputation++;
		parler("Je viens d'extorquer " + victime.getNom() + ". Cela me fait " + gain + " sous en plus. J'ai donc " + argent + " au total. Hi! Hi!");
	}
	
	public int perdre() {
		reputation--;
		parler("J'ai perdu mon duel et mes " + argent + " sous, snif... J'ai déshonoré le clan de " + clan);
		int gain=argent;
		argent=0;
		return(gain);
	}
	
	public void gagner(int gain) {
		parler("Ce ronin pensait vraiment battre " + nom + " du clan de " + clan + " ? Je l'ai dépouillé de ses " + gain + " sous!");
		argent = argent + gain;
	}
}
