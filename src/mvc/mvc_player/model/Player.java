package mvc.mvc_player.model;

public class Player {
    private int idPlayer;
    private String namePlayer;
    private String datePlayer;
    private String addressPlayer;
    private String teamPlayer;

    public Player() {
    }

    public Player(int idPlayer, String namePlayer, String datePlayer, String addressPlayer, String teamPlayer) {
        this.idPlayer = idPlayer;
        this.namePlayer = namePlayer;
        this.datePlayer = datePlayer;
        this.addressPlayer = addressPlayer;
        this.teamPlayer = teamPlayer;
    }

    public int getIdPlayer() {
        return idPlayer;
    }

    public void setIdPlayer(int idPlayer) {
        this.idPlayer = idPlayer;
    }

    public String getNamePlayer() {
        return namePlayer;
    }

    public void setNamePlayer(String namePlayer) {
        this.namePlayer = namePlayer;
    }

    public String getDatePlayer() {
        return datePlayer;
    }

    public void setDatePlayer(String datePlayer) {
        this.datePlayer = datePlayer;
    }

    public String getAddressPlayer() {
        return addressPlayer;
    }

    public void setAddressPlayer(String addressPlayer) {
        this.addressPlayer = addressPlayer;
    }

    public String getTeamPlayer() {
        return teamPlayer;
    }

    public void setTeamPlayer(String teamPlayer) {
        this.teamPlayer = teamPlayer;
    }
    public String convertToString(){
        return idPlayer + "," + namePlayer + "," + datePlayer + "," + addressPlayer + "," + teamPlayer;
    }

    @Override
    public String toString() {
        return "Player{" +
                "idPlayer=" + idPlayer +
                ", namePlayer='" + namePlayer + '\'' +
                ", dateString='" + datePlayer + '\'' +
                ", addressPlayer='" + addressPlayer + '\'' +
                ", teamPlayer='" + teamPlayer + '\'' +
                '}';
    }
}
