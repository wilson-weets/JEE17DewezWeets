package be.gestionhopital.DAO;

import java.sql.Connection;

import be.gestionhopital.metier.Personne;

public class DAOPersonne extends DAO<Personne> {
	public DAOPersonne(Connection conn) {
		super(conn);
	}

	@Override
	public boolean create(Personne obj) {
		return false;
	}

	@Override
	public boolean delete(Personne obj) {
		return false;
	}

	@Override
	public boolean update(Personne obj) {
		return false;
	}

	@Override
	public Personne find(Personne obj) {
		return null;
	}
}