//ID NO:21CE008
//NAME:priyanshi
/*Given 2 strings, a and b, return the number of the positions where they contain the 
same length 2 substring. So "xxcaazz" and "xxbaaz" yields 3, since the "xx", "aa", 
and "az" substrings appear in the same place in both strings.
stringMatch("xxcaazz", "xxbaaz") → 3
stringMatch("abc", "abc") → 2
stringMatch("abc", "axc") → 0 */
//solution:
import java.util.Scanner;

class test{

public int stringMatch(String a, String b) {

  int len = Math.min(a.length(), b.length());
  int count = 0;
  for (int i = 0; i < len-1; i++){
    String aSub = a.substring(i, i+2);
    String bSub = b.substring(i, i+2);
    if (aSub.equals(bSub))

      count++; 
    }
  return count;
}
}
class P5
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter one string");
        String str=sc.next();
        System.out.println("enter second string");
        String str1=sc.next();
        test t = new test();
        int ans;
        ans=t.stringMatch(str,str1);
        System.out.println(ans);
    
    }
}