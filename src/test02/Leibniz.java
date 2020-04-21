package test02;

import java.util.Scanner;

public class Leibniz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int n= scanner.nextInt();
		double sum=0;
		
		for(int i=1; i<=n; i++) {		
			sum += (Math.pow(-1,i+1))/(2*i-1);
		}
		
		System.out.println(sum*4);
	}

}
