package business.abstracts;

import eTicaretSistemi.entities.concretes.User;

public interface UserService {
	
	void register(User user);
	void logIn(String eMail, String password);
	

}
