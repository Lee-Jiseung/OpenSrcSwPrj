package test04;

import java.util.Scanner;

public class Ramanujan {
	//Scanner scanner = new Scanner(System.in);
	private int iter;
	private double sum = 0;
	
	public double Formula(int iter) {
		for(int i=0;i<=iter;i++) {
			sum += (double)(Factorial(4*i) * (1103 + 26390*i)) / (Math.pow(Factorial(i), (double)4) * Math.pow((double)396, (double)4*i));
		}
		double pie = 1/(sum * 2 * Math.sqrt(2) / 9801);
		System.out.println("Ramanujan : " + pie);
		return pie;
	}
	
	public int Factorial(int n) {
		int factorial=1;
		
		for(int i=1; i<=n;i++) {
			factorial *= i;
		}
		return factorial;
	}
}
