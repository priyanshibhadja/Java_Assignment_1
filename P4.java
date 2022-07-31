//ID NO:21CE008
//NAME:priyanshi
/*Given an array of ints, return true if the sequence of numbers 1, 2, 3 appears in the 
array somewhere.
array123([1, 1, 2, 3, 1]) → true
array123([1, 1, 2, 4, 1]) → false
array123([1, 1, 2, 1, 2, 3]) → true */
import javax.sound.sampled.SourceDataLine;

import java.util.*;
public class P4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Enter size of an array : ");
        n = sc.nextInt();
        System.out.print("Enter elements of the array : ");
        int []a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        L4 l=new L4();
        if(l.sequence(a))
        	System.out.println("True");
        else 
        	System.out.println("False");
       
        sc.close();
    }
}
 class L4 {//logic of 4th Practical
    public boolean sequence(int[] a) {
		int count =0;
		for (int i = 0; i < a.length - 2; i++) {
			//check the continuous 1, 2, 3 is there or not
            if (a[i] == 1 && a[i + 1] == 2 && a[i + 2] == 3) {
                count++;
            }
        }
        if (count == 1)
            return true;
        else 
            return false;
	}
}