// Online Quiz Platform – Result Processor
// Scenario: A quiz platform processes user answers and compares them to correct answers.
// Problem Requirements:
// ● Use String[] for correct answers and user answers.
// ● Use methods to compare answers, calculate scores, and return grade.
// ● Store scores of multiple users in a List<Integer>.
// ● Validate input (length mismatch) and throw an InvalidQuizSubmissionException.
import java.util.ArrayList;
import java.util.List;
public class Quize{
    public static class InvalidQuizSubmissionException extends Exception {
        public InvalidQuizSubmissionException(String message) {
            super(message);
        }

    }


    public static int calculateScore(String[] correctAnswers, String[] userAnswers) throws InvalidQuizSubmissionException {
        if (correctAnswers.length != userAnswers.length) {
            throw new InvalidQuizSubmissionException("Length of correct answers and user answers do not match.");
        }

        int score = 0;
        for (int i = 0; i < correctAnswers.length; i++) {
            if (correctAnswers[i].equalsIgnoreCase(userAnswers[i])) {
                score++;
            }
        }
        return score;
    }
    public static String getGrade(int score) {
        if (score >= 4) {
            return "A";
        } else if (score == 3) {
            return "B";
        } else if (score == 2) {
            return "C";
        } else if (score == 1) {
            return "D";
        } else {
            return "F";
        }
    }


    public static List<Integer> processScores(String[] correctAnswers, List<String[]> userAnswersList) {
        List<Integer> scores = new ArrayList<>();
        for (String[] userAnswers : userAnswersList) {
            try {
                int score = calculateScore(correctAnswers, userAnswers);
                scores.add(score);
            } catch (InvalidQuizSubmissionException e) {
                System.out.println(e.getMessage());
                scores.add(0); // Add 0 for invalid submissions
            }
        }
        return scores;
    }
    
    
    public static void main(String args[]){
        String[] correctAnswers = {"A", "B", "C", "D", "A"};
        String[] userAnswers = {"A", "B", "C", "D", "B"};

        try {
            int score = calculateScore(correctAnswers, userAnswers);
            String grade = getGrade(score);
            System.out.println("Score: " + score);
            System.out.println("Grade: " + grade);
        } catch (InvalidQuizSubmissionException e) {
            System.out.println(e.getMessage());
        }

    }
}