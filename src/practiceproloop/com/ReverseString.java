package practiceproloop.com;

public class ReverseString {

	public static void main(String[] args) {
		String str="pradip";
		String rev="";
		int leg=str.length();
		for(int i=leg-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);
		}
		
		System.out.println(rev);
		
		System.out.println("reversed String is sucessusful.....");

	}

}
