

package demo;

import java.util.Scanner;

public class changingdigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int digit;
		 while(n>0) {
		 digit = n %10;
		 System.out.print(digit);
		 n=n/10;}
		}
	

	}


