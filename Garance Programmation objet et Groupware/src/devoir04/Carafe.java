package devoir04;

public class Carafe {

	private int contenu;
	private int capacité;
	
	//constructeur par défaut
	public Carafe(){
		System.out.println("Création d'une carafe");
		int contenu = 0;
		int capacité = 0;
	}


	//Constructeur avec paramètres
	public Carafe(int icontenu, int icapacité)
	{

		contenu = icontenu;
		capacité = icapacité;

	}

//si on remplit une carafe
	void remplir() {
		this.contenu = this.capacité;
		return;
	}

		//si on vide une carafe
	void vider() {
		this.contenu = 0;
		return;	
	}

//si on transvase contenu d'une carafe dans une autre
	void transvaser (Carafe arrivée){
		int transféré = arrivée.capacité - arrivée.contenu;
		if (this.contenu <= arrivée.capacité - arrivée.contenu) {	//si on a la place de mettre tout le contenu de la carafe 1 dans la carafe 2
			arrivée.contenu = (arrivée.contenu + this.contenu);
			this.contenu = 0;

			

		}else {			//si on a pas la place de mettre contenu de carafe 1 dans carafe 2
			transféré = arrivée.capacité - arrivée.contenu;
			arrivée.contenu = arrivée.capacité;
			this.contenu = this.contenu - transféré;
		

		}

		if (arrivée.contenu == 5){  //si on arrive au resultat esconté
			System.out.println("c'est la fin du programme");
		}else{
			System.out.println("pas encore"); //sinon
		

		}


	}
	void quant(){
		System.out.println(this.contenu);
	}
}
