import java.util.ArrayList;

public class Monde {

	ArrayList<EntiteMobile> listeEntiteMobile;
	
	/**
	 * Classe Monde poss�dant un tableau d'entit�s mobiles
	 */
	public Monde() {

		this.listeEntiteMobile = new ArrayList<EntiteMobile>();
	}
	
	
	/**
	 * Fonction permettant d'ajouter une entit� mobile au Monde
	 * @param em : entit� mobile �ajouter �l'instance de Monde
	 */
	public void addEntiteMobile(EntiteMobile em) {
		
		this.listeEntiteMobile.add(em);

	}
	
	/**
	 * Fonction permettant de déplacer les entités mobiles contenues dans le monde
	 * @param nb : nombre de déplacement par entité mobile
	 */
	public void lanceIterations(int nb) {
		
		
		for(int i=0; i<nb; i++) {
			
			for(EntiteMobile e : listeEntiteMobile) {
				e.deplacer();
				System.out.println(e.getStringPosition()+"("+e.getComportement()+")");
			}
		}
		
	}

}
