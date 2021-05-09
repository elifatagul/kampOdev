package abstracts;

import entities.Campaign;
import entities.Game;

public interface GameService {
	void add(Game game);
	void delete(Game game);
	void update(Game game);

}
