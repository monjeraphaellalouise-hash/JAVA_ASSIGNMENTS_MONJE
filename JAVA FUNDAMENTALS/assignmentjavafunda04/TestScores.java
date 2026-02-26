import java.util.Arrays;

public class TestScores {

    public static void main(String[] args) {

        System.out.println("----- Student Scores Analyzer -----");

        int[] scores = {85, 92, 78, 64, 99, 53, 87, 71};

        System.out.println("Scores: " + Arrays.toString(scores));
        System.out.println();

        ScoreUtil util = new ScoreUtil();

        System.out.println("Average Score: " + util.getAverageScore(scores));
        System.out.println("Highest Score: " + util.getHighestScore(scores));
        System.out.println("Lowest Score: " + util.getLowestScore(scores));
        System.out.println();

        System.out.println("Passing Scores (>= 75):");
        util.printPassingScores(scores, 75);
        System.out.println();

        System.out.println("Failing Scores (< 75):");

        int[] failing = util.getFailingScores(scores, 75);

        for (int score : failing) {
            System.out.print(score + " ");
        }

        System.out.println();
    }
}