/**
 * 
 */
package devoir05;

/**
 * @author Garance
 *
 */
public class Crocodile extends Reptile implements Domesticable {

	public Crocodile(String type) {
		super(type);
		
		this.set_nb_pattes(4); //le crocodile a quatre pattes
		this.set_tete(1);	//1 tête
		this.set_couleur("vert avec des écailles"); //et on détermine sa couleur

		// TODO Auto-generated constructor stub
	}
	


	@Override
	public void domestiquer(String nom) { 
		// TODO Auto-generated method stub
		
	}

	@Override
	public String nom() {
		// TODO Auto-generated method stub
		return null;
	}

}
