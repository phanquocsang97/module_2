package mvc.mvc_player.service;

import mvc.mvc_player.model.Player;
import mvc.mvc_player.repository.IPlayerRepository;
import mvc.mvc_player.repository.PlayerRepository;

import java.util.List;
import java.util.Scanner;

public class PlayerService implements IPlayerService {
    Scanner scanner = new Scanner(System.in);
    private static IPlayerRepository playerRepository = new PlayerRepository();

    @Override
    public void displayList() {
        List<Player> playerList = playerRepository.displayList();
        for (Player player : playerList) {
            System.out.println(player);
        }
    }

    @Override
    public void addNewPlayer() {
            System.out.println("Enter id of player : ");
            int idPlayer = Integer.parseInt(scanner.nextLine());
            if (playerRepository.searchIdPlayer(idPlayer) == -1){
                System.out.println("Enter name of player : ");
                String namePlayer = scanner.nextLine();
                System.out.println("Enter date of player : ");
                String datePlayer = scanner.nextLine();
                System.out.println("Enter address of player : ");
                String addressPlayer = scanner.nextLine();
                System.out.println("Enter team of player : ");
                String teamPlayer = scanner.nextLine();
                Player player = new Player(idPlayer, namePlayer, datePlayer, addressPlayer, teamPlayer);
                playerRepository.addNewPlayer(player);
            }else {
                System.out.println("Try again");
            }
    }

    @Override
    public void shootPenalty() {

    }

//    @Override
//    public void shootPenalty() {
//        do {
//            System.out.println("Enter id player you want to shoot penalty");
//            int id = Integer.parseInt(scanner.nextLine());
//
//        }
//    }
}
