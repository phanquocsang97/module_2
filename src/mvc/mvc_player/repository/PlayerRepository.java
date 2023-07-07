package mvc.mvc_player.repository;

import case_study_furama_resort.utils.WriteAndRead;
import mvc.mvc_player.model.Player;
import mvc.mvc_player.util.writeAndRead;

import java.util.ArrayList;
import java.util.List;

public class PlayerRepository implements IPlayerRepository{
//    Player player = new Player();
    private final String PLAYER_PATH_FILE = "D:\\CodeGym\\Module 2\\src\\mvc\\mvc_player\\data\\player.csv";

    @Override
    public void addNewPlayer(Player player) {
        List<String> stringList = writeAndRead.readFile(PLAYER_PATH_FILE);
        stringList.add(player.convertToString());
        writeAndRead.writeFile(PLAYER_PATH_FILE,stringList,false);
    }

    @Override
    public List<Player> displayList() {
        List<Player> playerList = new ArrayList<>();
        List<String> stringList = writeAndRead.readFile(PLAYER_PATH_FILE);
        String[] info = null;
        for (String s : stringList) {
            info = s.split(",");
            Player player = new Player(Integer.parseInt(info[0]),info[1],info[2],info[3],info[4]);
            playerList.add(player);
        }
        return playerList;
    }
    public int searchIdPlayer(int id){
        List<Player> playerList = displayList();
        int index = -1;
        for (int i = 0; i < playerList.size(); i++) {
            if (id == playerList.get(i).getIdPlayer()){
                index= i;
            }
        }
        return index;
    }

    @Override
    public boolean shootPenalty(int playerShoot) {
        int random = (int) (Math.random() * 5 + 1);
        if (playerShoot == random){
            return true;
        }
        return false;
    }
}
