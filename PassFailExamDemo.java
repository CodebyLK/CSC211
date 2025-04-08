import javax.swing.JOptionPane;


/**
   This program demonstrates the PassFailExam class.
*/
class GradedActivity
{
   private double score;  // Numeric score
   //protected double score;  // Numeric score
   /**
      The setScore method sets the score field.
      @param s The value to store in score.
   */

   public void setScore(double s)
   {
      score = s;
   }

   /**
      The getScore method returns the score.
      @return The value stored in the score field.
   */

   public double getScore()
   {
      return score;
   }

   /**
      The getGrade method returns a letter grade
      determined from the score field.
      @return The letter grade.
   */

   public char getGrade()
   {
      char letterGrade;

      if (score >= 90)
         letterGrade = 'A';
      else if (score >= 80)
         letterGrade = 'B';
      else if (score >= 70)
         letterGrade = 'C';
      else if (score >= 60)
         letterGrade = 'D';
      else
         letterGrade = 'F';

      return letterGrade;
   }
}

public class PassFailExamDemo
{
   public static void main(String[] args)
   {

      String questionsInput;  
      double questions;     // Number of questions
      String missedInput;
      double missed;        // Number of questions missed
      String minPassingInput;
      double ptsPerQuestion;
      double testScore;
      double minPassing; // Minimum passing score

      GradedActivity grade = new GradedActivity();

      // Get the number of questions on the exam.
      questionsInput = JOptionPane.showInputDialog("How many questions are " +
                       "on the exam? ");
      questions = Double.parseDouble(questionsInput);

      // Get the number of questions missed.
      missedInput = JOptionPane.showInputDialog("How many questions did " +
                       "the student miss? ");
      missed = Double.parseDouble(missedInput);

      ptsPerQuestion = 100/questions;

      String formatPtsPerQuestion = String.format("%.2f", ptsPerQuestion);

      testScore = 100.0 - (missed * ptsPerQuestion);

      String formatTestScore = String.format("%.2f", testScore);
      
      grade.setScore(testScore);

      // Get the minimum passing score.
      minPassingInput = JOptionPane.showInputDialog("What is the minimum " +
                       "passing score? ");
      minPassing = Integer.parseInt(minPassingInput);

      JOptionPane.showMessageDialog(null, "There were " + questions + " questions on the exam.", "Total Questions", JOptionPane.PLAIN_MESSAGE);

      JOptionPane.showMessageDialog(null, "Student missed " + missed + " questions.", "Questions Missed", JOptionPane.PLAIN_MESSAGE);

      JOptionPane.showMessageDialog(null, "Each question is worth " + formatPtsPerQuestion + " points.", "Points Per Question", JOptionPane.PLAIN_MESSAGE);

      JOptionPane.showMessageDialog(null, "Student score is " + formatTestScore + "%.", "Student Score", JOptionPane.PLAIN_MESSAGE);

      JOptionPane.showMessageDialog(null, "The minimum passing score is " + minPassing + "%.", "Minimum Passing Score", JOptionPane.PLAIN_MESSAGE);

      JOptionPane.showMessageDialog(null,
      "The grade for that test is " +
      grade.getGrade(), "Letter Grade", JOptionPane.PLAIN_MESSAGE);


      if (testScore >= minPassing) {
         JOptionPane.showMessageDialog(null, "Student passed.", "Result", JOptionPane.PLAIN_MESSAGE);
      }
      else {
         JOptionPane.showMessageDialog(null, "Student did not pass.", "Result", JOptionPane.PLAIN_MESSAGE);
      }

    System.exit(0);

   }

}
