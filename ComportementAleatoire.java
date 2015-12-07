import java.awt.Point;


public class ComportementAleatoire implements Comportement {

	private int valMax;
	
	/**
	 * Constructeur du Comportement al�atoire prenant en param�tre la limite de la valeur al�toire (entre -vm et vm) 
	 * @param vm limite pour la valeur al�atoire
	 */
	public ComportementAleatoire(int vm) {
		
		this.valMax = vm;
	}
	
	/**
	 * M�thode surcharg�e rentournant le prochain mouvement al�atoire
	 * @return le mouvement � ajouter � la position de l'entit�
	 */
	@Override
	public Mouvement getProchainMouvement() {
		
		int max = valMax;
		int min = -valMax;	
		return new Mouvement((int)((Math.random()*(max-min))+min), (int)((Math.random()*(max-min))+min));
	}
	
	/**
	 * M�thode de d�bug permettant de mieux visualiser quel Comportement est utlis�
	 */
	public String toString() {

		return "Comportement Al�atoire";
	}

}
