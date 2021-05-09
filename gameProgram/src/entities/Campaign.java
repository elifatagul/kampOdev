package entities;

public class Campaign {
	private int id;
	private String campaignName;
	private int discountedRate;
	
	
	public Campaign() {
		
	}
	
	public Campaign(int id, String campaignName, int discountedRate) {
		super();
		this.id = id;
		this.campaignName = campaignName;
		this.discountedRate = discountedRate;
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCampaignName() {
		return campaignName;
	}

	public void setCampaignName(String campaignName) {
		this.campaignName = campaignName;
	}

	public int getDiscountedRate() {
		return discountedRate;
	}

	public void setDiscountedRate(int discountedRate) {
		this.discountedRate = discountedRate;
	}

	

}
