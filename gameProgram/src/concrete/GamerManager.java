package concrete;

import abstracts.GamerService;
import adapter.MernisServiceAdapter;
import entities.Gamer;

public class GamerManager implements GamerService {

	private MernisServiceAdapter mernisServiceAdapter;


	public GamerManager(MernisServiceAdapter mernisServiceAdapter) {
            this.mernisServiceAdapter = mernisServiceAdapter;
	}

	
	public void add(Gamer gamer) {
		if(mernisServiceAdapter.checkIfRealGamer(gamer)) {
			System.out.println(gamer.getFirstName() + " " + gamer.getLastName() + " : Ýsimli kullanýcý sisteme kaydedildi ");
		}
		else
		{
			System.out.println("Geçersiz kimlik bilgisi girildi.Lütfen tekrar kontrol ediniz!!! ");
		}
	}
	public void delete(Gamer gamer)
	{
		System.out.println(gamer.getFirstName() + " " + gamer.getLastName() + " : Ýsimli kullanýcý sistemden silindi. ");
		
	}
	
	public void update(Gamer gamer)
	{
		System.out.println(gamer.getFirstName() + " " + gamer.getLastName() + " : Ýsimli kullanýcýnýn bilgileri güncellendi. " );
	}
		
	
	
}


