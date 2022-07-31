//ID NO:21CE008
//NAME:priyanshi
//Implement Caesar Cipher 
import java.util.Scanner;

class test{
	String encrypt(String text, int s)
	{
	    String result = "";
	  
	    // traverse text
	    for (int i=0;i<text.length();i++)
	    {
	        // apply transformation to each character
	        // Encrypt Uppercase letters
	        if (Character.isUpperCase(text.charAt(i)))
	            result += (char)(((int)text.charAt(i)+s-65)%26 +65);
		    else// Encrypt Lowercase letters
		        result += (char)(((int)text.charAt(i)+s-97)%26 +97);
	    }
	  
	    // Return the resulting string
	    return result;
	}

}
public class P10 {
	public static void main(String argc[]) {
			test t =new test();
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter the text : ");
		 	String text=sc.next();System.out.print("Enter the shift : ");
             int s = sc.nextInt();
             System.out.println("Text : " + text);
             System.out.println("Shift : " + s);
             System.out.println("Cipher : " + t.encrypt(text, s));
            
     }
 } 
