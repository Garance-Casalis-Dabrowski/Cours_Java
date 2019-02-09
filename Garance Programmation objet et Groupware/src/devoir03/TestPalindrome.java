package devoir03;
/**
 * Programme servant à tester si un mot est un palindrome ou non
 * @author Garance
 *
 */
public class TestPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Palindrome w = new Palindrome("");

		//1e cas : palindrome avec nombre impair de lettres
		System.out.println(w.isPalindrome("essayasse"));
		
		//2e cas : palindrome avec nombre pair de lettres (rappelons qu'on ne prend pas en compte les espaces)
		System.out.println(w.isPalindrome("mon nom"));

		//3e cas : Ce n'est pas un palindrome
		System.out.println(w.isPalindrome("jesuisunepatate"));

		// 4e cas : quand il s'agit d'un mot vide
		w.word("");
		System.out.println(w.isPalindrome(""));
	}
}
