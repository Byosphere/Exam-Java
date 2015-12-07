import java.awt.Point;


public class ComportementAleatoire implements Comportement {

	private int valMax;
	
	/**
	 * Constructeur du Comportement aléatoire prenant en paramètre la limite de la valeur alétoire (entre -vm et vm) 
	 * @param vm limite pour la valeur aléatoire
	 */
	public ComportementAleatoire(int vm) {
		
		this.valMax = vm;
	}
	
	/**
	 * Méthode surchargée rentournant le prochain mouvement aléatoire
	 * @return le mouvement à ajouter à la position de l'entité
	 */
	@Override
	public Mouvement getProchainMouvement() {
		
		int max = valMax;
		int min = -valMax;	
		return new Mouvement((int)((Math.random()*(max-min))+min), (int)((Math.random()*(max-min))+min));
	}
	
	/**
	 * Méthode de débug permettant de mieux visualiser quel Comportement est utlisé
	 */
	public String toString() {

		return "Comportement Aléatoire";
	}

}
