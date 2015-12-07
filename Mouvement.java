
public class Mouvement {
	
	private int dx;
	private int dy;
	
	public Mouvement(int dx, int dy) {
		
		this.dx = dx;
		this.dy = dy;
	}

	public int getDeplacementVertical() {
		
		return this.dx;
	}

	public int getDeplacementHorizontal() {
		
		return this.dy;
	}

}
