/**
 * 
 */
package devoir05;


public abstract class Animal {	//cr�ation des param�tres de Animal
	private String espece;
	private int nb_pattes;
	private int tete;
	private String couleur;


	/**
	 * @author Garance
	 * 
	 *Cr�ation d'une nouvelle instance de la classe Animal 
	 *Initialisation de ses attributs
	 *
	 * @param type
	 *            nom de l'esp�ce
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

	//Mise en place du programe presente, dans lequel on int�gre les donn�es des param�tres pr�c�demment initialis�s
	public void presente() {
		System.out.println("Je suis un repr�sentant de l'esp�ce des " + espece
				+ ", je suis " + this.couleur
				+ ", j'ai " + this.tete + " t�te"
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
		System.out.println("Je suis mort. J'ai " + this.tete + " t�te, et je suis tout " + this.couleur + "."
				+ "");
	}

	public abstract void crie();
	public abstract void hiberne();

}

