package mvc.mvc_player.repository;

import mvc.mvc_player.model.Player;

import java.util.List;

public interface IPlayerRepository {
    void addNewPlayer(Player player);
    List<Player> displayList();
    public int searchIdPlayer(int id);
    boolean shootPenalty(int playerShoot);

}
