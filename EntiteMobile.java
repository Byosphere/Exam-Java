import java.awt.Point;
import java.util.ArrayList;

public class EntiteMobile {
	
	private Point position;
	private Comportement comportement;
	
	/**
	 * Permet de r�cup�rer l'instance du comportement de l'entit� Mobile
	 * @return le comportement
	 */
	public Comportement getComportement() {
		return comportement;
	}

	/**
	 * Constructeur de la classe Entite mobile qui prend un comportement en param�tre
	 * @param c comportement
	 */
	public EntiteMobile(Comportement c) {
		
		this.position = new Point(0,0);
		this.comportement = c;
	}

	/**
	 * Actionne le d�placement de l'entit� Mobile selon le comportement pass� en param�tre de l'objet
	 */
	public void deplacer() {
		
		Mouvement mouvement = this.comportement.getProchainMouvement();
		this.position.x += mouvement.getDeplacementVertical();
		this.position.y += mouvement.getDeplacementHorizontal();
		
	}
	
	/**
	 * Methode de d�bug pour visualiser la position de l'entit� mobile 
	 * @return
	 */
	public String getStringPosition() {
	
		return this+" Position : [x="+this.position.x+", y="+this.position.y+"]";
	}

}
