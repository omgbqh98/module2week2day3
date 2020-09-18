public class TennisGame {

    public static final int DEFAULT_SCORE = 0;
    private static final int SCORE0 = 0;
    private static final int SCORE1 = 1;
    private static final int  SCORE2 = 2;
    private static final int SCORE3 = 3;



    public static String getScore(String player1Name, String player2Name, int scorePlayer1, int scorePlayer2) {
        String score = "";
        int tempScore = DEFAULT_SCORE;
        if (scorePlayer1 == scorePlayer2) {
            switch (scorePlayer1) {
                case SCORE0 :
                    score = "Love-All";
                    break;
                case SCORE1:
                    score = "Fifteen-All";
                    break;
                case SCORE2:
                    score = "Thirty-All";
                    break;
                case SCORE3:
                    score = "Forty-All";
                    break;
                default:
                    score = "Deuce";
                    break;

            }
        } else if (scorePlayer1 >= 4 || scorePlayer2 >= 4) {
            int minusResult = scorePlayer1 - scorePlayer2;
            if (minusResult == 1) score = "Advantage player1";
            else if (minusResult == -1) score = "Advantage player2";
            else if (minusResult >= 2) score = "Win for player1";
            else score = "Win for player2";
        } else {
            for (int i = 1; i < 3; i++) {
                if (i == 1) tempScore = scorePlayer1;
                else {
                    score += "-";
                    tempScore = scorePlayer2;
                }
                switch (tempScore) {
                    case 0:
                        score += "Love";
                        break;
                    case 1:
                        score += "Fifteen";
                        break;
                    case 2:
                        score += "Thirty";
                        break;
                    case 3:
                        score += "Forty";
                        break;
                }
            }
        }
        return score;
    }
}