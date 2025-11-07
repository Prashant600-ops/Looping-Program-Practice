package practiceproloop.com;

import java.util.Scanner;

public class PrintTableScannerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String yn;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number......");
		do {
		int no=sc.nextInt();
		for(int i=1;i<=10;i++)
		{
			System.out.println(no*i);
		}
		System.out.println("do you want to Contineu press(y)for yes,press (n)for no");
		yn=sc.next();
		
		}
		while(yn.equals("y") || yn.equals("Y") && yn.equals("n") || yn.equals("N"));

	}

}
