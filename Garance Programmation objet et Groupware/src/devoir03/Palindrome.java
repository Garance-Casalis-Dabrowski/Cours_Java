package devoir03;
/**
 * Programme servant � d�terminer si un mot est un palindrome ou non
 * @author Garance
 *
 */
public class Palindrome {
	private String word;	//C'est le mot de r�f�rence pour le test palindrome

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

		int count = 0;	//compteur de boucles r�alis�es
		int limit;	//nbre limite de comparaisons � faire (moiti� du mot)
		word = word.replaceAll(" ", ""); //suppression des espaces
		int carA = 0;	//indice premier caract�re du mot
		int carZ = word.length()-1;	//indice dernier caract�re du mot

		boolean result = true; //Par d�faut, la valeur du boolean isPalindrome est "true"
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
		while (count != limit){						//quand on n'est pas arriv�s � la limite du mot (le milieu du mot), la boucle de v�rification peut �tre enclench�e
			if (word.charAt(carA) != word.charAt(carZ)){	//si le premier caract�re du mot correspondant � la variable carA n'est pas similaire au caract�re du mot correspondant � carZ
				result = false;		//le r�sultat est faux
				break;					//on arr�te la boucle
			}else{
				result = true;	//Le r�sultat est vrai... Alors et alors seulement :
				count++;	// on ajoute 1 � la variable count
				carA++;		// on v�rifie la 2e lettre du mot (puis ensuite la troisi�me et ainsi de suite)
				carZ--;		// on v�rifie l'avant derni�re lettre du mot (puis ensuite l'ant�-p�nulti�me et ainsi de suite)
			}
		}
			return result;
	}

}