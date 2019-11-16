package CompanyQuestions;

import java.util.Scanner;

public class Convert_dec_to_binary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int a,count=0;
//		String x="";
//		while(n>0)
//		{
//			a=n%2;
//			if(a==1)
//			{
//				count++;
//			}
//			x=a+" "+x;
//			n=n/2;
//		}
//		System.out.println(x);
		int decimal=n;
		String binary=Integer.toBinaryString(decimal);
		System.out.println(binary);

	}

}
