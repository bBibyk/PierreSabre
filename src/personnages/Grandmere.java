package personnages;

import java.util.Random;

public class Grandmere extends Humain {
	private Random random = new Random();
	
	public Grandmere(String nom, int argent) {
		super(nom, "tisane", argent);
	}
	
	@Override
	protected void memoriser(Humain humain) {
		if(nbConnaissance < 5) {
			memoire[nbConnaissance] = humain;
			nbConnaissance++;
		}else {
			parler("Oh ma tête !!!");
		}
	}
	
	private String humainHasard() {
		TypeHumain[] types = TypeHumain.values();
		return(types[random.nextInt(0, types.length)].toString());
	}
	
	public void ragoter() {
		for(int i=0; i<nbConnaissance; i++) {
			if(memoire[i] instanceof Traitre) {
				parler(memoire[i].nom + " est un traitre, baka !!!");
			} else {
				parler("Je crois que " + memoire[i].nom + " est un " + humainHasard());
			}
		}
	}
}
