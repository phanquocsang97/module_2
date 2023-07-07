package mvc.mvc_player.controller;

import mvc.mvc_player.service.PlayerService;

import java.util.Scanner;

public class PlayerController {
    Scanner scanner = new Scanner(System.in);
    private final PlayerService playerService = new PlayerService();
    public void showMenu(){
        do {
            System.out.println("Chọn chức năng :" +
                    "\n1. Display list player" +
                    "\n2. Add new player" +
                    "\n3. Shoot Penalty" +
                    "\n4. Exit");
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose){
                case 1:
                    System.out.println("Display list Player");
                    playerService.displayList();
                    break;
                case 2:
                    System.out.println("Add new player");
                    playerService.addNewPlayer();
                    break;
                case 3:
                    System.out.println("Shoot penalty");
                    playerService.shootPenalty();
                    break;
                case 4:
                    System.out.println("Exit");
                    System.exit(0);
            }
        }while (true);
    }
}
