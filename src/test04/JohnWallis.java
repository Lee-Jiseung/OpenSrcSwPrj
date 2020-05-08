package test04;

import java.util.Scanner;

public class JohnWallis {
	//Scanner scanner = new Scanner(System.in);
	private int iter;
	private double sum = 1;
	
	public double Formula(int iter) {
		for(int i=1;i<=iter;i++) {
			if(i%2 ==0) {
				sum *= ((double)i+1)/(double)i;
			} else {
				sum *= (double)i/((double)i+1);
			}
		}
		double pie = 1/(sum/2);
		System.out.println("JohnWallis : " + pie);
		return pie;
	}
}
