package devoir04;

public class Carafe {

	private int contenu;
	private int capacit�;
	
	//constructeur par d�faut
	public Carafe(){
		System.out.println("Cr�ation d'une carafe");
		int contenu = 0;
		int capacit� = 0;
	}


	//Constructeur avec param�tres
	public Carafe(int icontenu, int icapacit�)
	{

		contenu = icontenu;
		capacit� = icapacit�;

	}

//si on remplit une carafe
	void remplir() {
		this.contenu = this.capacit�;
		return;
	}

		//si on vide une carafe
	void vider() {
		this.contenu = 0;
		return;	
	}

//si on transvase contenu d'une carafe dans une autre
	void transvaser (Carafe arriv�e){
		int transf�r� = arriv�e.capacit� - arriv�e.contenu;
		if (this.contenu <= arriv�e.capacit� - arriv�e.contenu) {	//si on a la place de mettre tout le contenu de la carafe 1 dans la carafe 2
			arriv�e.contenu = (arriv�e.contenu + this.contenu);
			this.contenu = 0;

			

		}else {			//si on a pas la place de mettre contenu de carafe 1 dans carafe 2
			transf�r� = arriv�e.capacit� - arriv�e.contenu;
			arriv�e.contenu = arriv�e.capacit�;
			this.contenu = this.contenu - transf�r�;
		

		}

		if (arriv�e.contenu == 5){  //si on arrive au resultat escont�
			System.out.println("c'est la fin du programme");
		}else{
			System.out.println("pas encore"); //sinon
		

		}


	}
	void quant(){
		System.out.println(this.contenu);
	}
}
