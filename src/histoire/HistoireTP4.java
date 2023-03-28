package histoire;

import personnages.*;

public class HistoireTP4 {
	public static void main(String[] args) {
		Ronin roro = new Ronin("Roro", "shochu", 54);
		Yakuza noir = new Yakuza("Le Noir", "shochu", 45, "Warzong");
		
		roro.provoquer(noir);
	}
}
