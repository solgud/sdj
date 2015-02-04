import java.util.ArrayList;


public class Student
{
   private String name;
   private int studentNumber;
   private int numberOfExams;
   private ArrayList<Exam> exams;
   
   public Student(String name, int studentNumber)
   {
      this.name = name;
      this.studentNumber = studentNumber;
      this.exams = new ArrayList<Exam>();
      this.numberOfExams = 0;
   }
   
   public String getName()
   {
      return this.name;
   }
   
   public int getStudentNumber()
   {
      return this.studentNumber;
   }
   
   public void addExam(Exam exam) throws ExceededMaximumItemsException
   {
      if (this.numberOfExams == 100)
      {
         throw new ExceededMaximumItemsException("Too many exams");
      }
      this.numberOfExams++;
      this.exams.add(exam);
   }
   
   public int getTotalEcts()
   {
      int totalEcts = 0;
      for (Exam exam : this.exams)
      {
         if (exam.isPassed())
         {
            totalEcts += exam.getEctsPoints();
         }
      }
      return totalEcts;
   }
   
   public double getAverageGrade()
   {
      double totalGrade = 0;
      double totalNumberOfGrades = 0;
      double averageGrade = 0;
      
      for (Exam exam : this.exams)
      {
         if (exam instanceof GradedExam)
         {
            GradedExam gradedExam = (GradedExam) exam;
            totalGrade += gradedExam.getGrade();
            totalNumberOfGrades++;
         }
      }
      averageGrade = totalGrade / totalNumberOfGrades;
      return averageGrade;
   }

}
