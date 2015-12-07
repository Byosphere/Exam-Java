public class ComportementToutDroit implements Comportement {

	public static final int HAUT = 1;
	public static final int BAS = 2;
	public static final int GAUCHE = 3;
	public static final int DROITE = 4;
	private int direction = 0;

	/**
	 * Défini la direction à prendre comme comportement
	 * @param d : Constante à utiliser parmis HAUT BAS GAUCHE DROITE
	 */
	public void setDirection(int d) {

		this.direction = d;
	}

	/**
	 * Méthode surchargée rentournant le prochain mouvement en fonction de la direction indiquée
	 * @return le mouvement à ajouter à la position de l'entité
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
	 * MÃ©thode de dÃ©bug permettant de mieux visualiser quel Comportement est utlisÃ©
	 */
	public String toString() {

		return "Comportement Tout Droit";
	}

}
