package de.dummyapt.sandbox.codewars;

public class RockPaperScissors {
    public static void main(String[] args) {
        System.out.println(rockPaperScissors("rock", "rock"));
        System.out.println(rockPaperScissors("rock", "scissors"));
        System.out.println(rockPaperScissors("rock", "paper"));
        System.out.println(rockPaperScissors("scissors", "paper"));
    }

    /**
     * Let's play!
     * You have to return which player won!
     * In case of a draw return Draw!.
     *
     * @param p1 Player 1
     * @param p2 Player 2
     * @return Winner or draw
     */
    public static String rockPaperScissors(String p1, String p2) {
        if (p1.equals(p2))
            return "Draw!";
        if (p1.equals("paper") && p2.equals("rock")
                || p1.equals("rock") && p2.equals("scissors")
                || p1.equals("scissors") && p2.equals("paper"))
            return "Player 1 won!";
        if (p2.equals("paper") && p1.equals("rock")
                || p2.equals("rock") && p1.equals("scissors")
                || p2.equals("scissors") && p1.equals("paper"))
            return "Player 2 won!";
        return "";
    }
}