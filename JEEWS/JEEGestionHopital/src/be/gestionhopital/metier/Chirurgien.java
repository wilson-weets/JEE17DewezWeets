package be.gestionhopital.metier;

public class Chirurgien extends Personne{
	//Variable d'instance
	private String specialisation;
	
	//Constructeur
	public Chirurgien() {
		super();
	}
	
	//Propri�t�s
	public String getSpecialisation() {
		return specialisation;
	}

	public void setSpecialisation(String specialisation) {
		this.specialisation = specialisation;
	}
	
	//M�thodes
	@Override
	public void modifierInfos() {
		
	};
}
