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
		System.out.println(gamer.getFirstName() + " isimli kullanýcý " + game.getName() + " oyununu " + game.getPrice() + " TL'ye satýn aldý. ");
		
	}

	public void campaignSale(Game game, Gamer gamer, Campaign campaign) {
		System.out.println(gamer.getFirstName() + " isimli kullanýcý " + game.getName() + " oyununu " + campaign.getCampaignName() + " kampanyasýyla " + 
		      " % " + campaign.getDiscountedRate() + " indirimle " + (game.getPrice() - (game.getPrice() * campaign.getDiscountedRate()/ 100)) + " TL'ye satýn almýþtýr. ");
	}

}
