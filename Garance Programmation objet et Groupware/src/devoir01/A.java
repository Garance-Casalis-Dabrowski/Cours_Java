package devoir01;

public class A {

	public A() {}
		// TODO Auto-generated constructor stub
	    // Ceci (treize) est une méthode
		public static boolean treize (int n) {	//on a un entier quelconque qu'on appellera n
			
			if (n % 13 == 0)		//On met une condition : si la division euclidienne de n par 13 donne pour résultat 0, le booléen treize est vrai
			{
				return true;
			}
			
			else					//Sinon, le booléen treize est faux
			{
				return false ;
			}
			}
}