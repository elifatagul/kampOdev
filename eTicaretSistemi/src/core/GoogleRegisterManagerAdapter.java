package core;

import Google.GoogleRegisterManager;
import core.abstracts.GoogleRegisterService;

public class GoogleRegisterManagerAdapter implements GoogleRegisterService {

	@Override
	public void registerToSystem(String message) {
		
		GoogleRegisterManager googleRegisterManager = new GoogleRegisterManager();
		googleRegisterManager.send("Google ile kayýt olundu.");
		
	}

}
