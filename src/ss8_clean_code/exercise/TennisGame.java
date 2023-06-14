package ss8_clean_code.exercise;

public class TennisGame {
    public static final char ZEROPOINT = 0;
    public static final char ONEPOINT = 1;
    public static final char TWOPOINT = 2;
    public static final char THREEPOINT = 3;
    public static final char MATCHPOINT = 4;


    public static String getScore(int player1Score, int player2Score) {
        String total = "";
        int tempScore = 0;


        if (player1Score == player2Score) {
            switch (player1Score) {
                case ZEROPOINT:
                    total = "Love-All";
                    break;
                case ONEPOINT:
                    total = "Fifteen-All";
                    break;
                case TWOPOINT:
                    total = "Thirty-All";
                    break;
                case THREEPOINT:
                    total = "Forty-All";
                    break;
                default:
                    total = "Deuce";
                    break;

            }

        } else if (player1Score >= MATCHPOINT || player2Score >= MATCHPOINT) {
            int minusResultPoint = player1Score - player2Score;
            if (minusResultPoint == 1) {
                total = "Advantage player1";
            } else if (minusResultPoint == -1) {
                total = "Advantage player2";
            } else if (minusResultPoint >= 2) {
                total = "Win for player1";
            } else {
                total = "Win for player2";
            }
        } else {
            for (int i = 1; i < 3; i++) {
                if (i == 1) {
                    tempScore = player1Score;
                } else {
                    total += "-";
                    tempScore = player2Score;
                }
                switch (tempScore) {
                    case ZEROPOINT:
                        total += "Love";
                        break;
                    case ONEPOINT:
                        total += "Fifteen";
                        break;
                    case TWOPOINT:
                        total += "Thirty";
                        break;
                    case THREEPOINT:
                        total += "Forty";
                        break;
                }
            }
        }
        return total;
    }
}
