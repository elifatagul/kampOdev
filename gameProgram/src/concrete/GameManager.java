package concrete;

import abstracts.GameService;
import entities.Game;

public class GameManager implements GameService {

	@Override
	public void add(Game game) {
		System.out.println("Oyun eklendi : " + game.getName());
		System.out.println("Oyunun fiyat� : " + game.getPrice());
		
	}

	@Override
	public void delete(Game game) {
		System.out.println("Oyun silindi : " + game.getName());
		System.out.println("Oyunun fiyat� : " + game.getPrice());
		
		
	}

	@Override
	public void update(Game game) {
		System.out.println("Oyun g�ncellendi : " + game.getName());
		System.out.println("Oyunun fiyat� : " + game.getPrice());
		
		
	}

}
