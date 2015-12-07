import java.awt.Point;
import java.util.ArrayList;

public class EntiteMobile {
	
	private Point position;
	private Comportement comportement;
	
	/**
	 * Permet de récupérer l'instance du comportement de l'entité Mobile
	 * @return le comportement
	 */
	public Comportement getComportement() {
		return comportement;
	}

	/**
	 * Constructeur de la classe Entite mobile qui prend un comportement en paramètre
	 * @param c comportement
	 */
	public EntiteMobile(Comportement c) {
		
		this.position = new Point(0,0);
		this.comportement = c;
	}

	/**
	 * Actionne le déplacement de l'entité Mobile selon le comportement passé en paramètre de l'objet
	 */
	public void deplacer() {
		
		Mouvement mouvement = this.comportement.getProchainMouvement();
		this.position.x += mouvement.getDeplacementVertical();
		this.position.y += mouvement.getDeplacementHorizontal();
		
	}
	
	/**
	 * Methode de débug pour visualiser la position de l'entité mobile 
	 * @return
	 */
	public String getStringPosition() {
	
		return this+" Position : [x="+this.position.x+", y="+this.position.y+"]";
	}

}
