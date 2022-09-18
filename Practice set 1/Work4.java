package termwork;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Work4 {
	@SuppressWarnings("resource")
	public static void main(String args[]){
		boolean flag=false;
		FileInputStream fin = null;
		FileOutputStream fout = null;
		try{
			fin = new FileInputStream("F:/alphabets.txt");
			fout = new FileOutputStream("F:/consonants.txt");
			int ch;
			while((ch=fin.read())!=-1){
				if(!(ch=='a'||ch=='i'||ch=='e'||ch=='o'||ch=='u'))
					fout.write(ch);
				else
					flag=true;	
			}
			if(flag)
				if(!(ch=='a'||ch=='i'||ch=='e'||ch=='o'||ch=='u'))
					throw new vowelNotAllowedException();
		}
		catch(Exception e){
			System.out.println(e.toString());
		}
		
	}
}

class vowelNotAllowedException extends Exception {
	vowelNotAllowedException() {;}
	public String toString() {
		return super.toString() + " : Vowels Not Allowed";
	}
}
