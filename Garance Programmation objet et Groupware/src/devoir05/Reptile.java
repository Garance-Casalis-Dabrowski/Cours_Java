/**
 * 
 */
package devoir05;

/**
 * @author Garance
 *
 */
public class Reptile extends Animal {

	public Reptile(String type) { 
		super(type, 0, 1, "vert");  //on initialise des param�tres par d�faut
	}
	//L'animal est sauvage par d�faut
	protected boolean domestique = false;
	
	//pr�sentation des caract�ristiques du reptile
	public void presente(){
		super.presente();		//on appelle la m�thode "pr�sente" de la classe sup�rieure, Animal
		String etat = (domestique) ? "domestique" : "sauvage";
		System.out.println("je suis un animal tr�s " + etat);
	}


	//cri de l'animal
	public void crie() {
		System.out.println("Je siffle"); 
	}
	//On sp�cifie si l'animal hiberne
	public void hiberne() {
		System.out.println("Et je n'hiberne pas.");
	}
	
	//On appelle la m�thode "meurt
	public void meurt() { //et idem pour "meurt"
		super.meurt();
	}




}
