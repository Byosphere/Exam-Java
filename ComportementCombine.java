
public class ComportementCombine implements Comportement {

	Comportement c1;
	Comportement c2;

	public ComportementCombine(Comportement c1, Comportement c2) {

		this.c1 = c1;
		this.c2 = c2;

	}

	@Override
	public Mouvement getProchainMouvement() {

		Mouvement mouvement1 = c1.getProchainMouvement();
		Mouvement mouvement2 = c2.getProchainMouvement();

		return new Mouvement(mouvement1.getDeplacementHorizontal() + mouvement2.getDeplacementHorizontal(),
				mouvement1.getDeplacementVertical() + mouvement2.getDeplacementVertical());

	}

	public String toString() {

		return "Comportement Combiné";
	}

}
