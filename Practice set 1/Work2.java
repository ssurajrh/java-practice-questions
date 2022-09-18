package termwork;

import java.io.*;
import java.util.Scanner;

public class Work2 {
	public static void main(String args[]) {
		int flag = 0;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = s.nextInt();
		try {
			if (num < 0) {
				throw new NegativeNumberNotAllowedException();
			}
			else {
				try {
					if (num == 0 || num == 1) {
						throw new NumberNotPrimeException();
					} 
			else {
				for (int i = 2; i <= num / 2; i++) {
					if (num % i == 0) {
						flag = 1;
					}
				}
				if (flag == 1) {
					throw new NumberNotPrimeException();
				} 
				else
					System.out.println("The given number is prime");
				}
			} 
				catch (NumberNotPrimeException a) {
					System.out.println(a.toString());
				}
			}
		} 
		catch (NegativeNumberNotAllowedException e) {
			System.out.println(e.toString());
		}
	}
}
		class NumberNotPrimeException extends Exception {
			NumberNotPrimeException() {};
			public String toString() {
				return super.toString() + " : The entered number is not prime";
			}
		}
		
		class NegativeNumberNotAllowedException extends Exception {
			NegativeNumberNotAllowedException() {};
			public String toString() {
				return super.toString() + " : Entered number is negative";
			}
		}