import java.util.ArrayList;

public class Monde {

	ArrayList<EntiteMobile> listeEntiteMobile;
	
	/**
	 * Classe Monde possédant un tableau d'entités mobiles
	 */
	public Monde() {

		this.listeEntiteMobile = new ArrayList<EntiteMobile>();
	}
	
	
	/**
	 * Fonction permettant d'ajouter une entité mobile au Monde
	 * @param em : entité mobile à ajouter à l'instance de Monde
	 */
	public void addEntiteMobile(EntiteMobile em) {
		
		this.listeEntiteMobile.add(em);

	}
	
	/**
	 * Fonction permettant de dÃ©placer les entitÃ©s mobiles contenues dans le monde
	 * @param nb : nombre de dÃ©placement par entitÃ© mobile
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
