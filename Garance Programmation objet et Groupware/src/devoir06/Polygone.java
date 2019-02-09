package devoir06;

public class Polygone extends FigureGeometrique {

public Polygone(String co) {
		super(co);
		// TODO Auto-generated constructor stub
	}

protected float cote = 0;
    
	/** Création d'une nouvelle instance de CarreRouge */
	public Polygone(float x) {
		super("rouge");
		cote = x;
	}
	
	/** calcul du périmètre d'un carré rouge
		* @return périmètre
	   */
		public float perimetre() { return 4*cote; }
    
		/** calcul de la surface d'un carr� rouge
		 * @return surface
		 */
		public float surface() { return cote*cote; }
    
}

