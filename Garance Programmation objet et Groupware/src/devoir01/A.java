package devoir01;

public class A {

	public A() {}
		// TODO Auto-generated constructor stub
	    // Ceci (treize) est une m�thode
		public static boolean treize (int n) {	//on a un entier quelconque qu'on appellera n
			
			if (n % 13 == 0)		//On met une condition : si la division euclidienne de n par 13 donne pour r�sultat 0, le bool�en treize est vrai
			{
				return true;
			}
			
			else					//Sinon, le bool�en treize est faux
			{
				return false ;
			}
			}
}