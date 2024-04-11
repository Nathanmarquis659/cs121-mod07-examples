/**
 * Represents a school grade.
 * @author Java Foundations
 */
public class Grade implements Comparable<Grade>
{
   private String name;
   private int lowerBound;

   /**
    * Constructor: Sets up this Grade object with the specified
    * grade name and numeric lower bound.
    * @param grade
    * @param cutoff
    */
   public Grade(String grade, int cutoff)
   {
      name = grade;
      lowerBound = cutoff;
   }

   /**
    * Returns a string representation of this grade.
    */
   public String toString()
   {
      return name + "\t" + lowerBound;
   }

   /**
    * Sets the name of the grade.
    * @param grade
    */
   public void setName(String grade)
   {
      name = grade;
   }

   /**
    * Sets the lower bound cutoff
    * @param cutoff
    */
   public void setLowerBound(int cutoff)
   {
      lowerBound = cutoff;
   }

   /**
    * Returns the name.
    * @return
    */
   public String getName()
   {
      return name;
   }

   /**
    * Returns the lower bound.
    * @return
    */
   public int getLowerBound()
   {
      return lowerBound;
   }

   @Override
   /** Compare this grade object to the grade object that is passed in as arg0.
    *  Return a positive number (> 0) if this grade threshold is higher than the one passed in.
    *  Return a negative number (< 0) if this grade threshold is lower than the one passed in.
    *  Retun a zero if the grade threshold is the same between the two objects
    *
    * @param arg0 Reference to Grade object to compare this object to
    *
    * @return Result of comparison between the two objects
    */
   public int compareTo(Grade arg0) {
      return arg0.lowerBound - this.lowerBound;
   }
}
