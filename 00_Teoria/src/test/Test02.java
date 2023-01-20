package test;

import java.util.Scanner;

public class Test02 {
	public static void main(String[] arg) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		long num, num1;
		num = sc.nextInt();
		num1 = num;
		
		while (num != (-1)) {
			
			while(num1 != 1) {
				if (num1%2 == 0) {				
					num1 = num1/2;
				} else if (num1%2 != 0) {				
					num1 = (num1*3) + 1;
				}
				System.out.println(num1);
			}
			num++;
			num1 = num;
		}	
	}
}
