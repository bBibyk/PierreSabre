package personnages;

public enum TypeHumain {
	RONIN("Ronin"), SAMOURAI("Samouraï"), HUMAIN("Habitant"), COMMERCANT("Commerçant"), YAKUZA("Yakuza");
	
	private String nom;
	
	private TypeHumain(String nom) {
		this.nom = nom;
	}
	
	@Override
	public String toString() {
		return nom;
	}
}