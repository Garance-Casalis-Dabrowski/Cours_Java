/**
 * 
 */
package tp01;

/**
 * @author isha
 *
 */
public class SimpleProgramme1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Stub de la m�thode g�n�r�e automatiquement

		String phrase = "Bonjour mon nom est Garance Casalis" ;
		System.out.println(phrase) ;
		String mots[] = phrase.split(" ") ;
		for (String s : mots) System.out.println(s) ;
	}

}
