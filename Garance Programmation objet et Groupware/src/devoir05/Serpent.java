/**
 * 
 */
package devoir05;

/**
 * @author Garance
 *
 */
public class Serpent extends Reptile implements Domesticable {

	public Serpent(String type) {
		super(type);
		// TODO Auto-generated constructor stub
		this.set_nb_pattes(0);
		this.set_tete(1);
		this.set_couleur("jaune et marron avec des écailles");

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
