//ID NO:21CE008
//NAME:priyanshi
/*Question:Given two non-negative int values, return true if they have the same last digit, such 
as with 27 and 57. Note that the % "mod" operator computes remainders, so 17 % 
10 is 


	lastDigit(7, 17) → true
	lastDigit(6, 17) → false
	lastDigit(3, 113) → true
 * */
// Solution :
import java.util.Scanner;//importing Scanner class 
public class P3 {
	public static void main(String argc[]) {
		int n1,n2,F1,F2;
		Scanner sc = new Scanner(System.in);
		n1=sc.nextInt();
		n2=sc.nextInt();
		F1=n1;
		F2=n2;
		if(F2%10==F1) {//checking the last digits are same or not 
			System.out.println("lastdigit(" + n1 + ", " +n2+ ") --> true" );
		}
		else {
			System.out.println("lastdigit(" + n1 + ", " +n2+ ") --> false" );
		}
		
	}
}