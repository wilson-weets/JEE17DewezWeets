package be.gestionhopital.DAO;

import java.sql.Connection;

import be.gestionhopital.metier.Secretaire;

public class DAOSecretaire extends DAO<Secretaire> {
	public DAOSecretaire(Connection conn) {
		super(conn);
	}

	@Override
	public boolean create(Secretaire obj) {
		return false;
	}

	@Override
	public boolean delete(Secretaire obj) {
		return false;
	}

	@Override
	public boolean update(Secretaire obj) {
		return false;
	}

	@Override
	public Secretaire find(Secretaire obj) {
		return null;
	}
}
