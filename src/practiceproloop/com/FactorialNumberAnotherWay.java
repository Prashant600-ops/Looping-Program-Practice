package practiceproloop.com;

import java.util.Scanner;

public class FactorialNumberAnotherWay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String rep;
		do {
		Scanner sc=new Scanner(System.in);
	    System.out.println("enter number");
		
		int no=sc.nextInt();
		int fact= 1;
		for(int i=no;i>=1;i--)
		{
			fact=fact*i;
		}
		System.out.println(fact);
		System.out.println("continue yes for(y) no for(n)");
		rep=sc.next();
		}
		while(rep.equals("y")||rep.equals("Y") && rep.equals("n") || rep.equals("N"));
		
		

	}

}
