package business.concrete;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

import business.abstracts.UserService;
import dataAccess.abstracts.UserDao;
import eTicaretSistemi.entities.concretes.User;

public class UserManager implements UserService{
	
	private UserDao userDao;
	
	public UserManager(UserDao userDao) {
		super();
		this.userDao = userDao;
	}

	private List<String> eMailList = new ArrayList<String>();
	private List<String> passwordList = new ArrayList<String>();

	public static boolean isEmailValid(String email) {
	    final Pattern EMAIL_REGEX = Pattern.compile("[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", Pattern.CASE_INSENSITIVE);
	    return EMAIL_REGEX.matcher(email).matches();
	}
	
	public static boolean isEmailValidOnClick() {
		return true;
	}
	
	@Override
	public void register(User user) {
		if(user.getPassword().length()<6) {
			System.out.println("DIKKAT !! Parola en az 6 haneli olmalidir..");
			return;
		}
		
		if (eMailList.contains(user.geteMail())) {
			System.out.println("Girilen mail adresi sistemde zaten mevcut.Lütfen yeni bir email adresi giriniz.");
			return;
		}
		
		if(isEmailValid(user.geteMail()) != true) {
			System.out.println("Gecersiz mail adresi girdiniz.Lütfen yeniden deneyiniz..");
			return;
		}
		
		if(user.getFirstName().length() < 2  || user.getLastName().length() < 2 ) {
			return;
		}
		else {
			System.out.println("Ilgili" + " " + user.geteMail() + " mail adresinize dogrulama maili gönderilmistir.");
		}
		
		if(isEmailValidOnClick() != true) {
			System.out.println("Lütfen mail adresinizi doðrulayin...");
		}
		else {
			System.out.println("Sisteme basariyla kayit oldunuz.");
			eMailList.add(user.geteMail());
			passwordList.add(user.getPassword());
		}
			
	}

	@Override
	public void logIn(String eMail, String password) {
		if(eMailList.contains(eMail) && passwordList.contains(password)) {
			System.out.println("Basariyla giris yapildi.");
			return;
		}
		else {
			System.out.println("Email veya sifreniz yanlis lütfen tekrar deneyiniz...");
		}
		
	}


}
