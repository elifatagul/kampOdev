package dataAccess.concrete;

import java.util.List;

import dataAccess.abstracts.UserDao;
import eTicaretSistemi.entities.concretes.User;

public class InMemoryUserDao implements UserDao {

	@Override
	public void add(User user) {
		System.out.println(user.getFirstName() + user.getLastName() + " : Isimli kisi veritaban�'na basar�yla eklendi.");
		
	}

	@Override
	public void delete(User user) {
		System.out.println(user.getFirstName() + user.getLastName() + " : Isimli kisi veritaban�'na basar�yla silindi.");
		
	}

	@Override
	public void update(User user) {
		System.out.println(user.getFirstName() + user.getLastName() + " : Isimli kisi basar�yla g�ncellendi.");		
	}

	@Override
	public List<User> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
