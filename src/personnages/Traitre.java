package personnages;

import java.util.Random;

public class Traitre extends Samourai{
	private int traitrise = 0;
	
	public Traitre(String seigneur, String nom, String boisson, int argent) {
		super(seigneur, nom, boisson, argent);
	}
	
	@Override
	public void direBonjour(){
		super.direBonjour();
		parler("Mais je suis un traître et mon niveau de traîtrise est : " + traitrise + ". Chut !");
	}
	
	public void ranconner(Commercant commercant) {
		if(traitrise < 3) {
			int somme = commercant.argent * 2 / 10;
			commercant.perdreArgent(somme);
			gagnerArgent(somme);
			parler("Si tu veux ma protection contre les Yakuzas, il va falloir payer ! Donne-moi " + somme + " sous ou gare à toi !");
			traitrise++;
			commercant.parler("Tout de suite grand " + nom);
		} else {
			parler("Mince je ne peux plus rançonner personne sinon un samouraï risque de me démasquer !");
		}
	}
	
	public void faireLeGentil() {
		if(nbConnaissance < 1) {
			parler("Je ne peux faire ami ami avec personne car je connais personne ! Snif");
		}else {
			Random random = new Random();
			Humain h = memoire[random.nextInt(nbConnaissance)%MSIZE];
			int don = argent * 1/20;
			parler("Il faut absolument remonter ma cote de confiance. Je vais faire ami ami avec " + h.nom);
			parler("Bonjour l'ami! Je voudrais vous aider en vous donnant" + don + "sous");
			h.gagnerArgent(don);
			perdreArgent(don);
			h.parler("Merci " + nom + " vous êtes qqn de bien");
			if(traitrise > 1) {
				traitrise--;
			}
		}
	}
}
