//ID NO:21CE008
//NAME:priyanshi
/*Given an array of strings, return a new array without the strings that are equal to 
the target string. One approach is to count the occurrences of the target string, make 
a new array of the correct length, and then copy over the correct strings.
wordsWithout(["a", "b", "c", "a"], "a") → ["b", "c"]
wordsWithout(["a", "b", "c", "a"], "b") → ["a", "c", "a"]
wordsWithout(["a", "b", "c", "a"], "c") → ["a", "b", "a"]
/* */
//solution:
import java.util.*;
public class P6 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array : ");
        int a = sc.nextInt();
        String[] b = new String[a];
        System.out.println("Enter array : ");
        for (int i = 0; i < b.length; i++) {
            b[i] = sc.next();
        }
        System.out.println("Enter string you want to remove");
        String c = sc.next();
        wordsWithout(b, c);

        
    }

    static void wordsWithout(String x[],String y)
    {   int count=0;
        for(int i=0;i<x.length;i++)
        {
            if(x[i].equals(y))
            {
                count++;
            }
        }
        String[] str=new String[x.length-count];
        int j=0;
        for(int i=0;i<x.length;i++)
        {
            if(!x[i].equals(y))
            // {}
            // else
            {
                str[j]=x[i];
                j++;
            }
        }
        System.out.println("New Array is :");
        for(String element:str)
        {
            System.out.println(element);
        }

    }
}