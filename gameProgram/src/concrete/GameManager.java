package concrete;

import abstracts.GameService;
import entities.Game;

public class GameManager implements GameService {

	@Override
	public void add(Game game) {
		System.out.println("Oyun eklendi : " + game.getName());
		System.out.println("Oyunun fiyatý : " + game.getPrice());
		
	}

	@Override
	public void delete(Game game) {
		System.out.println("Oyun silindi : " + game.getName());
		System.out.println("Oyunun fiyatý : " + game.getPrice());
		
		
	}

	@Override
	public void update(Game game) {
		System.out.println("Oyun güncellendi : " + game.getName());
		System.out.println("Oyunun fiyatý : " + game.getPrice());
		
		
	}

}
