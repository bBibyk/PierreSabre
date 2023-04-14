package histoire;

import personnages.*;

public class HistoireTP5 {

	public static void main(String[] args) {
		Commercant marco = new Commercant("Marco", 20);
		Commercant chonin = new Commercant("Chonin", 40);
		Commercant kumi = new Commercant("Kumi", 10);
		Yakuza yaku = new Yakuza("Yaku Le Noir", "whisky", 30, "Warsong");
		Ronin roro = new Ronin("Roro", "shochu", 60);
		Samourai akimoto = new Samourai("Miyamoto", "Akimoto", "saké", 80);
		Traitre masako = new Traitre("Miyamoto", "Masako", "whisky", 100);
		
//		masako.faireLeGentil();
//		masako.ranconner(kumi);
//		masako.ranconner(chonin);
//		masako.ranconner(marco);
//		akimoto.faireConnaissanceAvec(masako);
//		masako.ranconner(kumi);
//		masako.faireConnaissanceAvec(yaku);
//		masako.faireLeGentil();
//		masako.faireConnaissanceAvec(roro);
		
		Humain nori = new Traitre("Miyamoto", "Nori", "whisky", 70);
		Ronin hiro = new Traitre("Miyamoto", "Hiro", "saké", 20);
		Samourai akira = new Traitre("Miyamoto", "Akira", "whisky", 50);
		
		Grandmere grandMere = new Grandmere("Grand-Mère", 10);
		grandMere.faireConnaissanceAvec(akimoto);
		grandMere.faireConnaissanceAvec(yaku);
		grandMere.faireConnaissanceAvec(masako);
		grandMere.faireConnaissanceAvec(kumi);
		grandMere.faireConnaissanceAvec(marco);
		grandMere.faireConnaissanceAvec(chonin);
		grandMere.ragoter();
	}
}
