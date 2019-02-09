/**
 * 
 */
package devoir05;

/**
 * @author Garance
 *
 */
public class testReptile {
//On teste la classe Reptile
	/**
	 * @param args
	 */
	public static void main(String[] args) { 
		// TODO Auto-generated method stub
		Reptile r = new Reptile("reptiles");    //on crée une instance de reptile
		r.presente();							//sur cette instance, on applique la méthode presente,
		r.crie();					// puis crie, puis hiberne, puis mange, puis meurt
		r.hiberne();
		r.mange();
		r.meurt();
		
	}

}
