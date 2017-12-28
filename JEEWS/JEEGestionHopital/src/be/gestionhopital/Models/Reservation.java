package be.gestionhopital.Models;

import java.sql.Date;

public class Reservation {
	//Variables d'instance
	private Chirurgien chirurgien;
	private Salle salle;
	private Patient patient;
	private Date dateHeure;
	
	//Constructeurs
	public Reservation() {
		
	}
	
	public Reservation(Chirurgien chirurgien,Salle salle,Patient patient,Date dateHeure) {
		this.chirurgien = chirurgien;
		this.salle = salle;
		this.patient = patient;
		this.dateHeure = dateHeure;
	}

	//Propri�t�s
	public Chirurgien getChirurgien() {
		return chirurgien;
	}

	public void setChirurgien(Chirurgien chirurgien) {
		this.chirurgien = chirurgien;
	}

	public Salle getSalle() {
		return salle;
	}

	public void setSalle(Salle salle) {
		this.salle = salle;
	}

	public Patient getPatient() {
		return patient;
	}

	public void setPatient(Patient patient) {
		this.patient = patient;
	}

	public Date getDateHeure() {
		return dateHeure;
	}

	public void setDateHeure(Date dateHeure) {
		this.dateHeure = dateHeure;
	}
	
	public void modifierReservation(Reservation r) {
		this.chirurgien = r.getChirurgien();
		this.salle = r.getSalle();
		this.patient = r.getPatient();
		this.dateHeure = r.getDateHeure();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((chirurgien == null) ? 0 : chirurgien.hashCode());
		result = prime * result + ((dateHeure == null) ? 0 : dateHeure.hashCode());
		result = prime * result + ((patient == null) ? 0 : patient.hashCode());
		result = prime * result + ((salle == null) ? 0 : salle.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		Reservation other = (Reservation) obj;
		if (chirurgien == null) {
			if (other.chirurgien != null)
				return false;
		} else if (!chirurgien.equals(other.chirurgien))
			return false;
		if (dateHeure == null) {
			if (other.dateHeure != null)
				return false;
		} else if (!dateHeure.equals(other.dateHeure))
			return false;
		if (patient == null) {
			if (other.patient != null)
				return false;
		} else if (!patient.equals(other.patient))
			return false;
		if (salle == null) {
			if (other.salle != null)
				return false;
		} else if (!salle.equals(other.salle))
			return false;
		return true;
	}
	
	
}