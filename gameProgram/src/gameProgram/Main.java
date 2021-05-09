package gameProgram;

import java.time.LocalDate;

import adapter.MernisServiceAdapter;
import concrete.GamerManager;
import entities.Gamer;
import concrete.CampaignManager;
import concrete.GameManager;
import concrete.SalesManager;
import entities.Campaign;
import entities.Game;
public class Main {

	
	public static void main(String[] args) {
		
		GamerManager gamerManager = new GamerManager(new MernisServiceAdapter());
		
		Gamer gamer1 = new Gamer(1,"Engin","Demiroð", 6754, 1985,"28861499108");
        gamerManager.add(gamer1);
        gamerManager.delete(gamer1);
        gamerManager.update(gamer1);
        System.out.println();
        
        Gamer gamer2 = new Gamer(2, "Ýrem Nur", "Ceylan", 6532, 2000, "4532167876");
        gamerManager.add(gamer2);
        System.out.println();
        
        Gamer gamer3 = new Gamer(3, "Aslý", "Yýldýz", 1234, 2003, "34562109562");
        gamerManager.add(gamer3);
        gamerManager.delete(gamer3);
        System.out.println();
        
        GameManager gameManager = new GameManager();
        Game game1 = new Game(001, "GTA", 120);
        gameManager.add(game1);
        gameManager.update(game1);
        System.out.println();
        
        Game game2 = new Game(002, "PUBG", 160);
        gameManager.delete(game2);
        System.out.println();
        
        CampaignManager campaignManager = new CampaignManager();
        Campaign campaign1 = new Campaign(01, "Golden Week" ,  30 );
        campaignManager.add(campaign1);
        campaignManager.delete(campaign1);
        campaignManager.update(campaign1);
        System.out.println();
        
        Campaign campaign2 = new Campaign(02, "Ýlk oyunum", 45);
        System.out.println();
        
        SalesManager salesManager = new SalesManager();
        salesManager.campaignSale(game1, gamer1, campaign1);
        salesManager.campaignSale(game2, gamer2, campaign2);
        

	}

}
