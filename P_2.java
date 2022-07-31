//ID NO:21CE008
//NAME:priyanshi
/*Question:Given a string, return a string made of the first 2 chars (if present), however include 
first char only if it is 'o' and include the second only if it is 'z', so "ozymandias" 
yields "oz". */
//solution:
import java.util.*;
class test
{
        public String startOz(String str) {
            if (str.startsWith("oz"))
          
              return "oz";
          
            else if (str.startsWith("o"))
          
              return "o";
          
            else if (str.startsWith("z", 1))
          
              return "z";
          
            else
          
              return "";
          }
}
class P_2
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string : ");
        String str = sc.next();
        test t = new test();
        String ans;
        ans=t.startOz(str);
        System.out.println("startOz("+str+")-->"+ans);
    }
}

