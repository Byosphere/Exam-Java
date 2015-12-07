import java.util.ArrayList;


public class ComportementCyclique implements Comportement {

	private ArrayList<Mouvement> mouvements;
	private int index;
	
	/**
	 * Constructeur permettant la recomposition en profondeur d'une instance de ComportementCyclique
	 * @param cc : ComportementCyclique à cloner
	 */
	public ComportementCyclique(ComportementCyclique cc) {
		
		this(new ArrayList<Mouvement>(cc.mouvements));
		this.index = cc.index;
	}

	/**
	 * Créé une instance de Comportement Cyclique
	 * @param t : tableau de Points correspondant aux mouvements voulus
	 */
	public ComportementCyclique(ArrayList<Mouvement> t) {
		
		this.mouvements = t;
		this.index = 0;
	}
	/**
	 * Retourne le tableau contenant les mouvements
	 * @return
	 */
	public ArrayList<Mouvement> getMouvements() {

		return this.mouvements;
	}
	
	/**
	 * Créé une nouvelle instance de Comportement Cyclique avec un tableau qui est l'inverse du comportement 
	 * de l'instance actuelle (les mouvements sont en ordre inverse, et chaque mouvement est inversé).
	 * @return 
	 */
	public ComportementCyclique creeComportementInverse() {
		
		ArrayList<Mouvement> oldTab = this.getMouvements();
		ArrayList<Mouvement> newTab = new ArrayList<Mouvement>();
		
		for(int i=oldTab.size()-1; i>=0; i--) {
			
			newTab.add(new Mouvement((oldTab.get(i).getDeplacementHorizontal()*-1), (oldTab.get(i).getDeplacementVertical()*-1)));
		}

		return new ComportementCyclique(newTab);
	}

	/**
	 * Méthode surchargée rentournant le prochain mouvement selon l'index 
	 * @return le mouvement à ajouter à la position de l'entité
	 */
	@Override
	public Mouvement getProchainMouvement() {
		
		if(index == this.mouvements.size())
			index = 0;
		Mouvement result = this.mouvements.get(index);
		index++;
		
		return result;
		
	}
	/**
	 * Méthode de débug permettant de mieux visualiser quel Comportement est utlisé
	 */
	public String toString() {
		
		return "Comportement Cyclique";
	}

}
