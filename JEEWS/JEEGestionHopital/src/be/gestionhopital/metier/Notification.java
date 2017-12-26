package be.gestionhopital.metier;

public class Notification {
	//Variables d'instance
	private int idNotification;
	private int priorite;
	private int type;
	private String commentaire;
	private Chirurgien chirurgien;
	
	//Constructeur
	public Notification() {
		
	}

	//Propriétés
	public int getIdNotification() {
		return idNotification;
	}

	public void setIdNotification(int idNotification) {
		this.idNotification = idNotification;
	}

	public int getPriorite() {
		return priorite;
	}

	public void setPriorite(int priorite) {
		this.priorite = priorite;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public String getCommentaire() {
		return commentaire;
	}

	public void setCommentaire(String commentaire) {
		this.commentaire = commentaire;
	}

	public Chirurgien getChirurgien() {
		return chirurgien;
	}

	public void setChirurgien(Chirurgien chirurgien) {
		this.chirurgien = chirurgien;
	}
}
