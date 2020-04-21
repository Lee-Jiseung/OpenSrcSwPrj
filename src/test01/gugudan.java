package test01;

import java.util.Scanner;

public class gugudan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		int input = scanner.nextInt();
		
		for(int i=1;i<=9;i++) {
			System.out.println(input + " * " + i + " = " + (input*i));
		}
	}

}
