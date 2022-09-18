package termwork;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Work1 {
	public static void main(String args[]) {
		int x = 10;
		int y = 0;
		int d[] = new int[5];
		
		try {
			int c = x / y;
		} catch (ArithmeticException e) {
			System.out.println("indivisible by zero");
			
		}
		
		try {
            File file = new File("E://numbers.txt");
  
            FileReader fr = new FileReader(file);
        }
        catch (FileNotFoundException e) {
            System.out.println("File does not exist");
        }
		
		try {
			d[6] = 6;
		} catch (ArrayIndexOutOfBoundsException g) {
			System.out.println("Array index exceeded");
		}
	}
}