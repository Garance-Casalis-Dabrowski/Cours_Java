package devoir03;
/**
 * Programme servant à déterminer si un mot est un palindrome ou non
 * @author Garance
 *
 */
public class Palindrome {
	private String word;	//C'est le mot de référence pour le test palindrome

	public Palindrome(String word){		//On initialise l'attribut word
		word(word);
	}

	public String word(){
		return this.word();
	}

	public void word(String word){
		this.word = word;
		return;
	}

	public boolean isPalindrome(String word) {

		int count = 0;	//compteur de boucles réalisées
		int limit;	//nbre limite de comparaisons à faire (moitié du mot)
		word = word.replaceAll(" ", ""); //suppression des espaces
		int carA = 0;	//indice premier caractère du mot
		int carZ = word.length()-1;	//indice dernier caractère du mot

		boolean result = true; //Par défaut, la valeur du boolean isPalindrome est "true"
		//cas 1 : cas impair / cas 2 : cas pair
		//cas 2

		if (word.length()%2 == 0){
			limit = word.length()/2;		//limit = quand on arrive au milieu du mot
			//cas 1
		}else{
			limit = (word.length()+1)/2;	//limit = quand il ne reste qu'une lettre au milieu du mot
		}
		if (word.length() == 0){
			result = false;
		}
		while (count != limit){						//quand on n'est pas arrivés à la limite du mot (le milieu du mot), la boucle de vérification peut être enclenchée
			if (word.charAt(carA) != word.charAt(carZ)){	//si le premier caractère du mot correspondant à la variable carA n'est pas similaire au caractère du mot correspondant à carZ
				result = false;		//le résultat est faux
				break;					//on arrête la boucle
			}else{
				result = true;	//Le résultat est vrai... Alors et alors seulement :
				count++;	// on ajoute 1 à la variable count
				carA++;		// on vérifie la 2e lettre du mot (puis ensuite la troisième et ainsi de suite)
				carZ--;		// on vérifie l'avant dernière lettre du mot (puis ensuite l'anté-pénultième et ainsi de suite)
			}
		}
			return result;
	}

}