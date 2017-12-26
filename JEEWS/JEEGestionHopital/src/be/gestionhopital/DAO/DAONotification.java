package be.gestionhopital.DAO;

import java.sql.Connection;

import be.gestionhopital.metier.Notification;

public class DAONotification extends DAO<Notification> {
	public DAONotification(Connection conn) {
		super(conn);
	}

	@Override
	public boolean create(Notification obj) {
		return false;
	}

	@Override
	public boolean delete(Notification obj) {
		return false;
	}

	@Override
	public boolean update(Notification obj) {
		return false;
	}

	@Override
	public Notification find(Notification obj) {
		return null;
	}
}