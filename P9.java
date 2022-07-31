//ID NO:21CE008
//NAME:priyanshi
/*
 * The problem is to check whether a given Sudoku solution is correct
 */
import java.util.Scanner;
public class P9 {
	public static void main(String argc[]) {
		Scanner sc = new Scanner (System.in);
		int a[][]=new int[9][9];
		for(int i=0;i<9;i++) {
			for(int j=0;j<9;j++) {
				a[i][j]=sc.nextInt();
			}
		}
		int r[]=new int [9];
		int c[]=new int [9];
		int sumR=0,sumC=0;
		for(int i=0;i<9;i++) {
			for(int j=0;j<9;j++) {
				r[i]+=a[i][j];
			}
			if(r[i]==45) {
				sumR+=r[i];
			}
			else {
				System.out.println("No solution");
				break;
			}
		}
		for(int i=0;i<9;i++) {
			for(int j=0;j<9;j++) {
				c[i]+=a[j][i];
			}
			if(c[i]==45){
				sumC+=r[i];
			}
			else {
				System.out.println("No solution");
				break;
			}
		}
		if(sumR+sumC==810) {
			System.out.println("correct solution");
		}
		
		sc.close();
		
	}
}

