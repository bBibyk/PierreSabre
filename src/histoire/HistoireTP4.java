package histoire;

import personnages.*;

public class HistoireTP4 {
	public static void main(String[] args) {
		Commercant marco = new Commercant("Marco", 20);
		Yakuza norik = new Yakuza("Norik", "gorilka", 30, "Armenia");
		norik.direBonjour();
		norik.extorquer(marco);
	}
}
