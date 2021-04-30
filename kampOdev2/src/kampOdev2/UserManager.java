package kampOdev2;

public class UserManager {
	
	public void add(User user) {
		System.out.println(user.getId() + "Kiþi eklendi");
	}
	
	public void update(User user) {
		System.out.println(user.getParola() + " Parola güncellendi ");
		System.out.println(user.getContact() + "Ýletiþim bilgileri güncellendi ");
	}
	

	
	
	
	

}
