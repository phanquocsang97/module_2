package mvc.mvc_player.view;

import mvc.mvc_player.controller.PlayerController;

public class run {
    public static void main(String[] args) {
        PlayerController playerController = new PlayerController();
        playerController.showMenu();
    }
}
