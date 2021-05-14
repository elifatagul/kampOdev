import business.concrete.UserManager;
import core.GoogleRegisterManagerAdapter;
import dataAccess.abstracts.UserDao;
import dataAccess.concrete.InMemoryUserDao;
import eTicaretSistemi.entities.concretes.User;

public class Main {

	public static void main(String[] args) {
		
		UserManager usermanager = new UserManager(new InMemoryUserDao());
		GoogleRegisterManagerAdapter  googleRegisterManagerAdapter = new GoogleRegisterManagerAdapter();
		UserDao userDao = new InMemoryUserDao();
		
	
		User user1 = new User(001, "Elif", "Atagul", "elif@gmail.com", "12565433");
		User user2 = new User(002, "Dfkf", "Cdkfrk", "dkfkf", "234894");
		User user3 = new User(003,"A","Bay","a@gmail.com","123456");
		User user4 = new User(004,"Ayse","Bal","elif@gmail.com","123456");
		usermanager.register(user1);
		usermanager.register(user2);
		usermanager.register(user3);
		usermanager.register(user4);
		
		
		

	}

}
