public class ScoreUtil {

    // Get the average of the scores
    public double getAverageScore(int[] scores) {
        int sum = 0;

        // Add all scores
        for (int i = 0; i < scores.length; i++) {
            sum += scores[i];
        }

        // Return average
        return (double) sum / scores.length;
    }

    // Find the highest score
    public int getHighestScore(int[] scores) {
        int highest = scores[0];

        // Check which score is the highest
        for (int score : scores) {
            if (score > highest) {
                highest = score;
            }
        }

        return highest;
    }

    // Find the lowest score
    public int getLowestScore(int[] scores) {
        int lowest = scores[0];

        // Check which score is the lowest
        for (int score : scores) {
            if (score < lowest) {
                lowest = score;
            }
        }

        return lowest;
    }

    // Print all passing scores
    public void printPassingScores(int[] scores, int passingMark) {

        // Print scores that passed
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] >= passingMark) {
                System.out.print(scores[i] + " ");
            }
        }

        System.out.println();
    }

    // Return an array of failing scores
    public int[] getFailingScores(int[] scores, int passingMark) {

        int count = 0;

        // Count failing scores
        for (int score : scores) {
            if (score < passingMark) {
                count++;
            }
        }

        int[] failingScores = new int[count];
        int index = 0;

        // Store failing scores
        for (int score : scores) {
            if (score < passingMark) {
                failingScores[index] = score;
                index++;
            }
        }

        return failingScores;
    }
}