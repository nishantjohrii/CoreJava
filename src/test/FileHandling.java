package test;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileHandling {

	public static void main(String[] args) throws Throwable {
		
		String str1 = "Order confirmation";
		
		
		FileOutputStream file1 = new FileOutputStream("results.txt");
		file1.write(str1.getBytes());
	

	}

}
