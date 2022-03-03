package org.howard.edu.lsp.assignment2;

import java.util.Arrays;
import java.util.Scanner;

public class Processor {

	public static void main(String[] args) {
		
		while (true) {
			
			System.out.println("String?");
			Scanner scanner = new Scanner(System.in);	
			String[] tokens = scanner.nextLine().split(" ");
			
			if (tokens[0].equals("Goodbye")) {
				scanner.close();
//				System.out.println("Termination key received");
				break;
			}
			
			System.out.println("Tokens:");
			int sum = 0;
			int product = 1;
			for (String token : tokens) {
				System.out.println(token);
				sum = sum + Integer.parseInt(token);
				product = product * Integer.parseInt(token);
			}
			
			System.out.println("Sum: " + String.valueOf(sum));
			System.out.println("Product: " + String.valueOf(product));
			
			System.out.println();
			
		}
		
		
	}

}
