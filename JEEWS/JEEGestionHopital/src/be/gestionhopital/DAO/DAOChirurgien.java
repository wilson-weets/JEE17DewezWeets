package be.gestionhopital.DAO;

import java.sql.Connection;

import be.gestionhopital.metier.Chirurgien;

public class DAOChirurgien extends DAO<Chirurgien> {
	public DAOChirurgien(Connection conn) {
		super(conn);
	}

	@Override
	public boolean create(Chirurgien obj) {
		return false;
	}

	@Override
	public boolean delete(Chirurgien obj) {
		return false;
	}

	@Override
	public boolean update(Chirurgien obj) {
		return false;
	}

	@Override
	public Chirurgien find(Chirurgien obj) {
		return null;
	}
}
