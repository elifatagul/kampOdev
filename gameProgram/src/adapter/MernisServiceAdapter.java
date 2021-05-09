package adapter;

import java.rmi.RemoteException;

import abstracts.GamerCheckService;
import entities.Gamer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements GamerCheckService{

	@Override
	public boolean checkIfRealGamer(Gamer gamer) {
		KPSPublicSoapProxy client = new KPSPublicSoapProxy();	
		try {
			return client.TCKimlikNoDogrula(Long.parseLong(gamer.getNationalityId()),
					gamer.getFirstName().toUpperCase(), gamer.getLastName().toUpperCase(),
					gamer.getDateOfBirth());
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		return false;
	}

}
