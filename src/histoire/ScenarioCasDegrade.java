package histoire;

import personnages.Gaulois;
import villagegaulois.Etal;

public class ScenarioCasDegrade {
	public static void main(String[] args) { 
		Etal etal = new Etal();
		try {
			etal.libererEtal();
		} catch (NullPointerException e) {
			e.printStackTrace();
		}
		Gaulois asterix = new Gaulois("Astérix", 3);
		etal.occuperEtal(asterix, "baguette", 2);
		etal.libererEtal();
		try {
			etal.acheterProduit(1,asterix);
		} catch (IllegalArgumentException | IllegalStateException e ) {
			e.printStackTrace();
		} 
		System.out.println("Fin du test");
	}
	

}
