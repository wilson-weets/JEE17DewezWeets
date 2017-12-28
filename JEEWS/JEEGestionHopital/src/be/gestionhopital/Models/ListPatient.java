package be.gestionhopital.Models;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.ParserConfigurationException;

import org.xml.sax.SAXException;

import be.gestionhopital.DAO.DAOPatient;
import be.gestionhopital.Factory.AbstractDAOFactory;

public class ListPatient {
	private static ListPatient instance = null;
	private List<Patient> listPatient = new ArrayList<>();
	private AbstractDAOFactory adf = AbstractDAOFactory.getFactory(AbstractDAOFactory.DAO_FACTORY);
	private DAOPatient patiDAO = (DAOPatient) adf.getPatientDAO();
	
	private ListPatient() {
		try {
			listPatient = patiDAO.findAll();
		} catch (ParserConfigurationException | SAXException | IOException e) {
			e.printStackTrace();
		}
	}
	
	public void ajouterPatient(Personne p) {
		listPatient.add((Patient)p);
	}
	
	public void supprimerPatient(Personne p) {
		for(Patient pa : listPatient) {
			if(p.equals(pa)) {
				listPatient.remove(pa);
			}
		}
	}
	
	public static synchronized ListPatient getInstance() {
		if(instance == null)
			instance = new ListPatient();
		
		return instance;
	}
}