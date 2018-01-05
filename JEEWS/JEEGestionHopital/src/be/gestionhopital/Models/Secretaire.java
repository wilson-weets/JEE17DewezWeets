package be.gestionhopital.Models;

import java.io.IOException;

import org.xml.sax.SAXException;

import be.gestionhopital.Factory.AbstractDAOFactory;

public class Secretaire extends Personne {
	private static final long serialVersionUID = 3955384103009827636L;
	// Variable d'instance
	private String service;

	// Constructeurs
	public Secretaire() {
		super();
	}
	
	public Secretaire(String service,int idPersonne,String nom,String prenom,String dateNaiss, String numTelephone, String motDePasse) {
		super(idPersonne,nom,prenom,dateNaiss,numTelephone,motDePasse);
		this.service = service;
	}

	// Propri�t�s
	public String getService() {
		return service;
	}

	public void setService(String service) {
		this.service = service;
	}

	// M�thodes
	@Override
	public void modifierInfos(Personne p) {
		super.modifierInfos(p);
		this.service = ((Secretaire)p).service;
		AbstractDAOFactory adf = AbstractDAOFactory.getFactory(AbstractDAOFactory.DAO_FACTORY);
		try {
			adf.getSecretaireDAO().update((Secretaire)p);
		} catch (SAXException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	};
	
	public void ajouterReservation(Reservation r, Notification n) {
		ListReservation lr = ListReservation.getInstance();
		lr.ajouterReservation(r, n);
	}
	
	public void modifierReservation(Reservation before, Reservation after, Notification n) {
		ListReservation lr = ListReservation.getInstance();
		lr.modifierReservation(before, after, n);
	}
	
	public void supprimerReservation(Reservation r, Notification n) {
		ListReservation lr = ListReservation.getInstance();
		lr.supprimerReservation(r, n);
	}
}
