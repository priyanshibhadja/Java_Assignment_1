//ID NO:21CE008
//NAME:priyanshi
/*Display numbers in a pyramid pattern.
1
1 2 1
1 2 4 2 1
1 2 4 8 4 2 1
1 2 4 8 16 8 4 2 1
1 2 4 8 16 32 16 8 4 2 1
1 2 4 8 16 32 64 32 16 8 4 2 
1 2 4 8 16 32 64 128 64 32 16 8 4 2 1 */
import java.util.*;
public class P7 {
    
	public static void main(String[] args) {

        int size = 7;
        for (int i = 0; i < size; i++) {
            // print spaces
            for (int j = 0; j < size - i - 1; j++) {
                System.out.print(" ");
            }
            // print stars
            int k;
            for ( k = 1; k <= i; k++) {
            	
                System.out.print((int)Math.pow(2,k-1) + " ");
            }
            for (; k >=1; k--) {
            	
                System.out.print((int)Math.pow(2,k-1)+" ");
            }
            System.out.println(" ");//for print into new line 
        }
    }
}

