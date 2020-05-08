package test04;

import java.util.Scanner;

public class Euler {
	//Scanner scanner = new Scanner(System.in);
	private int iter;
	private double sum;
	
	public Euler() {
		this.iter = 1;
		this.sum = 0;
	}
	
	public double Formula(int iter) {
		for(int i=1;i<=iter;i++) {
			sum += 1/(Math.pow((double)i, (double)2));
		}
		double pie = Math.sqrt(sum*6);
		System.out.println("Euler : " + pie);
		return pie;
	}
}
