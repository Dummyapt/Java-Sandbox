package de.dummyapt.sandbox.codewars;

final class RockPaperScissors {
    public static void main(String[] args) {
        System.out.println(rockPaperScissors(rps.ROCK, rps.ROCK));
        System.out.println(rockPaperScissors(rps.ROCK, rps.SCISSORS));
        System.out.println(rockPaperScissors(rps.ROCK, rps.PAPER));
        System.out.println(rockPaperScissors(rps.SCISSORS, rps.PAPER));
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
    private static String rockPaperScissors(rps p1, rps p2) {
        if (p1 == p2)
            return "Draw!";
        else if (p1 == rps.PAPER && p2 == rps.ROCK
                || p1 == rps.ROCK && p2 == rps.SCISSORS
                || p1 == rps.SCISSORS && p2 == rps.PAPER)
            return "Player 1 won!";
        else if (p2 == rps.PAPER && p1 == rps.ROCK
                || p2 == rps.ROCK && p1 == rps.SCISSORS
                || p2 == rps.SCISSORS && p1 == rps.PAPER)
            return "Player 2 won!";
        else
            return "";
    }

    private enum rps {
        ROCK, PAPER, SCISSORS
    }
}