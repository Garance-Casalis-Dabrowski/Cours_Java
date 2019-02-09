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
		super(type, 0, 1, "vert");  //on initialise des paramètres par défaut
	}
	//L'animal est sauvage par défaut
	protected boolean domestique = false;
	
	//présentation des caractéristiques du reptile
	public void presente(){
		super.presente();		//on appelle la méthode "présente" de la classe supérieure, Animal
		String etat = (domestique) ? "domestique" : "sauvage";
		System.out.println("je suis un animal très " + etat);
	}


	//cri de l'animal
	public void crie() {
		System.out.println("Je siffle"); 
	}
	//On spécifie si l'animal hiberne
	public void hiberne() {
		System.out.println("Et je n'hiberne pas.");
	}
	
	//On appelle la méthode "meurt
	public void meurt() { //et idem pour "meurt"
		super.meurt();
	}




}
