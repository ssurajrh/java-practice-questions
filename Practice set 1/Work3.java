package termwork;

import java.util.Scanner;
public class Work3 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the string");
		String string1 = sc.nextLine();
		String string2 = "SDMCET";
		try { 
			if (!string1.toUpperCase().contains(string2)) {
				throw new SubStringNotFoundException();
			} else
				System.out.println("substring found");
		} catch (SubStringNotFoundException e) {
			System.out.println(e.toString());
		}
	}
}

class SubStringNotFoundException extends Exception {
	SubStringNotFoundException() {};
	public String toString() {
		return super.toString() + " : substring not found";
	}
}