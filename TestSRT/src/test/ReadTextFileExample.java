package test;

import java.io.FileInputStream;
import java.util.Scanner;

public class ReadTextFileExample {
	public static void main(String[] args) {
		FileInputStream is;
		try {
			is = new FileInputStream("D:/a.srt");
			Scanner input=new Scanner(is,"UTF-8");
			int i=1;
			
			while(input.hasNextLine())
			{		
			String line=input.nextLine();		
			System.out.println((i++)+". "+line);			
			}
			input.close();
			is.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}