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
	int count = 0;	//compteur de boucles réalisées
	int limit;	//nbre limite de comparaisons à faire (moitié du mot)
	String result = "";
	word = word.replaceAll(" ", ""); //suppression des espaces
	int carA = 0;	//indice premier caractère du mot
	int carZ = word.length()-1;	//indice dernier caractère du mot
	
	
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
	while (count != limit){						//quand on n'est pas arrivés à la limite du mot (le milieu du mot), la boucle de vérification peut être enclenchée
		if (word.charAt(carA) != word.charAt(carZ)){	//si le premier caractère du mot correspondant à la variable carA n'est pas similaire au caractère du mot correspondant à carZ
			result = "False";		//le résultat est faux
			break;					//on arrête la boucle
		}else{
			result = "True";	//Le résultat est vrai... Alors et alors seulement :
			count++;	// on ajoute 1 à la variable count
			carA++;		// on vérifie la 2e lettre du mot (puis ensuite la troisième et ainsi de suite)
			carZ--;		// on vérifie l'avant dernière lettre du mot (puis ensuite l'anté-pénultième et ainsi de suite)
		}
	}
	System.out.println(result);
	}
	
}



