package chap01;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CountWord {
	public static void main(String[] args) {
		File file = new File("text.txt");
		int countWord = 0;
		
		try( Scanner inFile = new Scanner (file)) {
			while(inFile.hasNext() )
			{
				inFile.next();
				countWord++;
			}
		} catch (FileNotFoundException e) {
			// TODO: handle exception
			System.out.println("FILE NOT FOUNDED !!!");
		}
		
		System.out.println(countWord);
	}
}
