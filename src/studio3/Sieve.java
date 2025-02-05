package studio3;

import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the amount of numbers to start with: ");
		int n = in.nextInt();
		int[] sieve = new int[n];
		
		for(int i = 0; i < n; i++) {
			sieve[i] = i + 1;
			System.out.print( sieve[i] + ", " );
		}
		
		int count = sieve[1];
		System.out.println(" ");
		
		
		for(int i = 1; i < n; i++) {
			if(sieve[i] == 0) {
			
			} else {
				count = sieve[i];
				for(int j = i + count; j < n; j = j + count) {
					sieve[j] = 0;
					
				}
			}
		}
		
		System.out.println(" ");
		for(int value : sieve) {
			if(value != 0) {	
				System.out.print(value + ", ");
			}
		
		}

	}
}
