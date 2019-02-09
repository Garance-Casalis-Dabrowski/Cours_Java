package devoir01;

public class B {

	public B() {}
		// TODO Auto-generated constructor stub
	
		//Ceci (divise) est une méthode
		public static boolean divise (int n) {	// Soit n un entier quelconque
		
		if (A.treize(n) == true) return (n == n/2);   //on effectue la méthode treize sur l'entier n. Si elle retourne true, on divise n par 2
		else return (n == n + 2);						// si elle retourne false, on ajoute 2 au chiffre entier n
		}
}