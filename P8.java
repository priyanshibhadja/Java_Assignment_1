//ID NO:21CE008
//NAME:priyanshi
/*The problem is to write a program that will grade multiple-choice tests. Assume 
there are eight students and ten questions, and the answers are stored in a twodimensional array. Each row records a student’s answers to the questions, as 
shown in the following array.
Students’ Answers to the Questions:
0 1 2 3 4 5 6 7 8 9
Student 0 A B A C C D E E A D
Student 1 D B A B C A E E A D
Student 2 E D D A C B E E A D
Student 3 C B A E D C E E A D
Student 4 A B D C C D E E A D
Student 5 B B E C C D E E A D
Student 6 B B A C C D E E A D
Student 7 E B E C C D E E A D
The key is stored in a one-dimensional array:
Key to the Questions:
0 1 2 3 4 5 6 7 8 9
Key D B D C C D A E A D
Your program grades the test and displays the result. It compares each student’s 
answers with the key, counts the number of correct answers, and displays it.
 */
import java.util.Scanner;
public class P8 {
    public static void main (String[] args)
  {
    Scanner scan = new Scanner (System.in);
    String[] key = { "D" , "B" , "D" , "C" , "C" , "D" , 
        "A" , "E" , "A" , "D" };
    System.out.println("Fill in the eight student's ans" +
        "wers to 10 questions");
    String[][] list = new String[8][10];
    int[][] sort = new int[8][1];
    for (int i =0;i<list.length;i++)
    {
      int count =0;
      for (int j =0;j<list[i].length;j++)
      {
        list[i][j] = scan.next();
        if(list[i][j].equalsIgnoreCase(key[j]))
        {  count++;
          sort[i][0] = count;
        }
        
      }
    }
  int[] students = { 0 ,1 ,2 ,3 ,4 ,5 ,6, 7};
  for (int i =0;i<sort.length;i++)
    {
      for (int j=0;j<sort.length-1;j++)
      {
        if (sort[j][0] > sort[j+1][0])
        {
          int temp = sort[j][0];          
          sort[j][0] = sort[j+1][0];
          sort[j+1][0] = temp;
          
          int temp2 = students[j];
          students[j] = students[j+1];
          students[j+1]= temp2;
        }
      }
    } 
    for (int i =0;i<sort.length;i++)
    {
      System.out.println("Student "+ students[i]+" score per order " + sort[i][0]);
    }
    
  }
}
 


