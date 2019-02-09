/**
 * 
 */
package devoir05;


public abstract class Animal {	//création des paramètres de Animal
	private String espece;
	private int nb_pattes;
	private int tete;
	private String couleur;


	/**
	 * @author Garance
	 * 
	 *Création d'une nouvelle instance de la classe Animal 
	 *Initialisation de ses attributs
	 *
	 * @param type
	 *            nom de l'espèce
	 * @param pattes
	 *            nombre de pattes
	 *@param color
	 *			couleur
	 */

	public Animal (String type, int pattes, int tete, String color){
		espece = type;
		nb_pattes = pattes;
		couleur = color;

	}

	//Initialisation de l'attribut nb_pattes
	void set_nb_pattes(int pattes){
		nb_pattes = pattes;
		return;
	}

	//Initialisation de l'attribut tete
	void set_tete(int teete){
		tete = teete;
		return;
	}

	//Initialisation de l'attribut couleur
	void set_couleur(String color){
		couleur = color;
		return;
	}

	//Mise en place du programe presente, dans lequel on intègre les données des paramètres précédemment initialisés
	public void presente() {
		System.out.println("Je suis un représentant de l'espèce des " + espece
				+ ", je suis " + this.couleur
				+ ", j'ai " + this.tete + " tête"
				+ ", et j'ai " + this.nb_pattes + " pattes."
				+ "");
	}

	public void mange() {
		System.out.println("Et j'ai le ventre plein."
				+ "");
	}

	public void meurt() {
		this.tete = 0;
		this.couleur = "gris";
		System.out.println("Je suis mort. J'ai " + this.tete + " tête, et je suis tout " + this.couleur + "."
				+ "");
	}

	public abstract void crie();
	public abstract void hiberne();

}

