import java.util.Scanner;  // import the Scanner Class
import java.io.*;  // Needed for File and IO Exception
/**
 * This is the solution to the class example of file I/O
 * 
 * @author  ryumol
 * @version date assignment due
 */
/*
 * Instructor: 
 * Assumptions: 
 * Known errors: File not found exception
 *
 * 
*/
public class Average1Ver2
{
    /**
     *  Reads data from a file into arrays and processes the array
     */
    public void run()throws IOException
    {
        /*
         * Data is read from the file using the Scanner class
         * As data is read, it is loaded into a arrays
         * Using the second array, the average of the values are calculated
         */

        // Declare the arrays and variables
        double [] grade = new double [20];  // array containing grades
        String [] ID = new String [20];     // array containing ID
        int count;      // count of students
        int i;          // array index used for processing arrays
        double sum;     // sum of the grades
        double ave;     // average of the grades
        String [] comment = new String [20];  // states whether above, at or below average
        
        Scanner inputFile = new Scanner (new File ("marks.txt"));
    
      // loading the data from the file into the array
        count = 0;
        while (inputFile.hasNext())
        {
            ID[count] = inputFile.next();
            grade[count] = inputFile.nextDouble();
           
            count++;
        }
      inputFile.close();    // closes the file
      
      // calculating the average of the grades
      sum = 0;
      for (i = 0; i < count; i++)
      {
          System.out.println (ID [i] + "\t" + grade [i]);
          sum = sum + grade [i];
      }
      ave = sum / count;
      System.out.println ("The average grade of " + count + " students is " + ave);
      
      // commenting on students' performance using an array for comments
     
      for (i = 0; i < count; i++)
      {
          if (grade[i] < ave)
          {
             comment[i] = "is below average";   
          }
          else if (grade[i] > ave)
          {
             comment[i] = "is above average"; 
          }
          else 
          {
              comment[i] = "is average"; 
          }
      }
      
     for (i = 0; i < count; i++)
      {
          System.out.println (ID [i] + "\t" + comment [i]);
      }
  
       
    }
}
