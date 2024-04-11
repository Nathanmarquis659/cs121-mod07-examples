import java.util.Arrays;

/**
 * Demonstrates the use of an array of objects.
 * @author Java Foundations
 */
public class GradeRange
{
   /**
    * Creates an array of Grade objects and prints them.
    * @param args
    */
   public static void main(String[] args)
   {
      Grade[] grades =
      {
         new Grade ("A+", 97), new Grade("B+", 87), new Grade("C+", 77), new Grade("D+", 67),
         new Grade("A", 94), new Grade("B", 84), new Grade("C", 74), new Grade("D", 64), new Grade("F", 0),
         new Grade("A-", 90), new Grade("B-", 80), new Grade("C-", 70), new Grade("D-", 60)
      };

      for (Grade letterGrade : grades)
         System.out.println(letterGrade);

      Arrays.sort(grades);

      System.out.print("\n*\n* Sorted in ascending order\n*\n");
      for (Grade letterGrade : grades)
         System.out.println(letterGrade);
   }
}
