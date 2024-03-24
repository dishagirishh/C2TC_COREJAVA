package basics;

import java.util.Scanner;

public class forloop {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number to get its table");
		int num=sc.nextInt();
		
		for(int i=0;i<=10;i++) {
			System.out.println(num+"*"+i+"="+num*i);
		}
	}

}
