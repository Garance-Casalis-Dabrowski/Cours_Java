/**
 * 
 */
package devoir02;

/**
 * @author Garance
 *
 */
public class Palindrome {

	/**
	 * @param args
	 */
	public static void isPalindrom(String word) {
	int count = 0;	//compteur de boucles r�alis�es
	int limit;	//nbre limite de comparaisons � faire (moiti� du mot)
	String result = "";
	word = word.replaceAll(" ", ""); //suppression des espaces
	int carA = 0;	//indice premier caract�re du mot
	int carZ = word.length()-1;	//indice dernier caract�re du mot
	
	
	//cas 1 : cas impair / cas 2 : cas pair
	//cas 2
	if (word.length()%2 == 0){
		limit = word.length()/2;		//limit = quand on arrive au milieu du mot
	//cas 1
	}else{
		limit = (word.length()+1)/2;	//limit = quand il ne reste qu'une lettre au milieu du mot
	}
	if (word.length() == 0){			
		result = "True";				
	}
	while (count != limit){						//quand on n'est pas arriv�s � la limite du mot (le milieu du mot), la boucle de v�rification peut �tre enclench�e
		if (word.charAt(carA) != word.charAt(carZ)){	//si le premier caract�re du mot correspondant � la variable carA n'est pas similaire au caract�re du mot correspondant � carZ
			result = "False";		//le r�sultat est faux
			break;					//on arr�te la boucle
		}else{
			result = "True";	//Le r�sultat est vrai... Alors et alors seulement :
			count++;	// on ajoute 1 � la variable count
			carA++;		// on v�rifie la 2e lettre du mot (puis ensuite la troisi�me et ainsi de suite)
			carZ--;		// on v�rifie l'avant derni�re lettre du mot (puis ensuite l'ant�-p�nulti�me et ainsi de suite)
		}
	}
	System.out.println(result);
	}
	
}



