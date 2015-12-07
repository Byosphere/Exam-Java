public class ComportementToutDroit implements Comportement {

	public static final int HAUT = 1;
	public static final int BAS = 2;
	public static final int GAUCHE = 3;
	public static final int DROITE = 4;
	private int direction = 0;

	/**
	 * D�fini la direction � prendre comme comportement
	 * @param d : Constante � utiliser parmis HAUT BAS GAUCHE DROITE
	 */
	public void setDirection(int d) {

		this.direction = d;
	}

	/**
	 * M�thode surcharg�e rentournant le prochain mouvement en fonction de la direction indiqu�e
	 * @return le mouvement � ajouter � la position de l'entit�
	 */
	@Override
	public Mouvement getProchainMouvement() {

		switch (this.direction) {

		case 1:
			return new Mouvement(0,-1);
		case 2:
			
			return new Mouvement(0,1);
		case 3:
			
			return new Mouvement(-1,0);
		case 4:
			
			return new Mouvement(1,0);
		default:
			
			return new Mouvement(0,0);
		}
	}
	
	/**
	 * Méthode de débug permettant de mieux visualiser quel Comportement est utlisé
	 */
	public String toString() {

		return "Comportement Tout Droit";
	}

}
