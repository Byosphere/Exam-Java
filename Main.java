import java.awt.Point;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {

		// Et ainsi fut le monde :
		Monde leMonde = new Monde();

		// Entité au comportement qui va vers la droite
		ComportementToutDroit td = new ComportementToutDroit();
		td.setDirection(ComportementToutDroit.DROITE);
		leMonde.addEntiteMobile(new EntiteMobile(td));

		// Entité au comportement cyclique avec les valeurs (0,1) (0,2) (1,1) (3,1)
		ArrayList<Mouvement> pattern = new ArrayList<>();
		pattern.add(new Mouvement(0, 1));
		pattern.add(new Mouvement(0, 2));
		pattern.add(new Mouvement(1, 1));
		pattern.add(new Mouvement(3, 1));
		ComportementCyclique c = new ComportementCyclique(new ArrayList<Mouvement>(pattern));

		// Entité au comportement cyclique inversé du comportement précédent
		ComportementCyclique cInverse = c.creeComportementInverse();
		leMonde.addEntiteMobile(new EntiteMobile(cInverse));

		// Entité au comportement aléatoire
		ComportementAleatoire ca = new ComportementAleatoire(12);
		leMonde.addEntiteMobile(new EntiteMobile(ca));

		// Entité au comportement combiné entre aléatoire et toutDroit
		ComportementToutDroit versHaut = new ComportementToutDroit();
		versHaut.setDirection(ComportementToutDroit.HAUT);
		ComportementAleatoire ca2 = new ComportementAleatoire(8);
		ComportementCombine cb = new ComportementCombine(versHaut, ca2);
		leMonde.addEntiteMobile(new EntiteMobile(cb));

		leMonde.lanceIterations(20);

	}

}
