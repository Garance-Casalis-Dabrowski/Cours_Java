/**
 * 
 */
package devoir05;

/**
 * @author Garance
 *
 */
public class testCrocodile {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		//On crée une instance de la classe serpent
		Crocodile c1 = new Crocodile("crocodiles");
		c1.presente();
		c1.crie();
		c1.hiberne();
		
	
	
		//On crée une instance de la classe serpent
		Serpent s1 = new Serpent("pythons");
		s1.presente();
		s1.crie();
		s1.hiberne();
		s1.meurt();

	}

}
