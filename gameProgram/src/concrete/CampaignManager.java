package concrete;

import abstracts.CampaignService;
import entities.Campaign;

public class CampaignManager implements CampaignService {

	@Override
	public void add(Campaign campaign) {
		System.out.println(campaign.getCampaignName() + " : �simli kampanya eklendi");
		
	}

	@Override
	public void delete(Campaign campaign) {
		System.out.println(campaign.getCampaignName() + " : �simli kampanya silindi");
		
	}

	@Override
	public void update(Campaign campaign) {
		System.out.println(campaign.getCampaignName() + " : �simli kampanya g�ncellendi");
		
	}
	

}
