/**
 * 
 */
package devoir06;

/**
 * @author Garance
 *
 */
public abstract class FigureGeometrique {
	/**
	 * 
	 */

		protected String couleur = "noir";

		/** cr�ation d'une nouvelle instance de la classe FigureGeometrique
		 * @param co couleur de la figure
		 */    
		public FigureGeometrique (String co) {
			couleur = co; // couleur par d�faut
		}

		/** calcul du p�rim�tre d'une figure g�om�trique
		 * @return p�rim�tre
		 */    
		public abstract float perimetre();

		/** calcul de la surface d'une figure g�om�trique
		 * @return surface
		 */    
		public abstract float surface();
	} // fin de d�finition de la classe



