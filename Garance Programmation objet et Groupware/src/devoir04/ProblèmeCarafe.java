package devoir04;

public class Probl�meCarafe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//on initialise les parametres des deux carafes 
		//(le param�tre de gauche = capacit�;
		//param�tre de droite = contenu avant remplissage)
		Carafe carafe01 = new Carafe(0,4);	
		Carafe carafe02 = new Carafe(0,7);
		
		
		carafe01.remplir();					//on essaye les op�rations remplir, transvaser, vider pour arriver au resultat
		carafe01.quant();
		carafe01.transvaser(carafe02);
		carafe01.remplir();
		carafe01.transvaser(carafe02);
		carafe02.vider();
		carafe01.transvaser(carafe02);
		carafe01.remplir();
		carafe01.transvaser(carafe02);
		carafe02.quant();
		
	}
}

