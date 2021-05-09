package concrete;

import abstracts.SalesService;
import abstracts.CampaignService;
import entities.Campaign;
import entities.Game;
import entities.Gamer;


public class SalesManager implements SalesService {
	
	private Campaign campaign;
	
	public void SalesManger(Campaign campaign) {
		this.campaign=campaign;
	}

	public void sale(Game game, Gamer gamer) {
		System.out.println(gamer.getFirstName() + " isimli kullan�c� " + game.getName() + " oyununu " + game.getPrice() + " TL'ye sat�n ald�. ");
		
	}

	public void campaignSale(Game game, Gamer gamer, Campaign campaign) {
		System.out.println(gamer.getFirstName() + " isimli kullan�c� " + game.getName() + " oyununu " + campaign.getCampaignName() + " kampanyas�yla " + 
		      " % " + campaign.getDiscountedRate() + " indirimle " + (game.getPrice() - (game.getPrice() * campaign.getDiscountedRate()/ 100)) + " TL'ye sat�n alm��t�r. ");
	}

}
