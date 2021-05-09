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
			System.out.println(gamer.getFirstName() + " " + gamer.getLastName() + " : �simli kullan�c� sisteme kaydedildi ");
		}
		else
		{
			System.out.println("Ge�ersiz kimlik bilgisi girildi.L�tfen tekrar kontrol ediniz!!! ");
		}
	}
	public void delete(Gamer gamer)
	{
		System.out.println(gamer.getFirstName() + " " + gamer.getLastName() + " : �simli kullan�c� sistemden silindi. ");
		
	}
	
	public void update(Gamer gamer)
	{
		System.out.println(gamer.getFirstName() + " " + gamer.getLastName() + " : �simli kullan�c�n�n bilgileri g�ncellendi. " );
	}
		
	
	
}


