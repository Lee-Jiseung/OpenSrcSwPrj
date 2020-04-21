package test01;

import java.util.Scanner;

public class gugudan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		int input = scanner.nextInt();
		if (input==0) {
			for(int j=2;j<=9;j++) {
				for(int i=1;i<=9;i++) {
					System.out.println(j + " * " + i + " = " + (j*i));
				}
			}
		}
		else if(input <0) {
			System.out.println("can't print gugudan");
		}
		else {
			for(int i=1;i<=9;i++) {
				System.out.println(input + " * " + i + " = " + (input*i));
			}
		}
		
	}

}
